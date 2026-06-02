package pekan8_2511533015;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.util.LinkedList;
import java.util.Queue;

public class MergeSortGUI_2511533015 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_3015;
	private JLabel[] labelArray_3015;
	private JButton stepButton_3015, resetButton_3015, setButton_3015;
	private JTextField inputField_3015;
	private JPanel panelArray_3015;
	private JTextArea stepArea_3015;

	private Queue<int[]> mergeQueue_3015 = new LinkedList<>();
	private int stepCount_3015 = 1;
	private boolean isMerging_3015 = false;
	private boolean copying_3015 = false;

	private int[] temp_3015;
	private int left_3015, mid_3015, right_3015;
	private int i_3015, j_3015, k_3015;

	public MergeSortGUI_2511533015() {
		setTitle("Merge Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// panel input
		JPanel inputPanel_3015 = new JPanel(new FlowLayout());
		inputField_3015 = new JTextField(30);
		setButton_3015 = new JButton("Set Array");
		inputPanel_3015.add(new JLabel("Masukan angka (pisahkan dengan koma)"));
		inputPanel_3015.add(inputField_3015);
		inputPanel_3015.add(setButton_3015);

		// panel array visual
		panelArray_3015 = new JPanel();
		panelArray_3015.setLayout(new FlowLayout());

		// panel kontrol
		JPanel controlPanel_3015 = new JPanel();
		stepButton_3015 = new JButton("Langkah selanjutnya");
		resetButton_3015 = new JButton("Reset");
		controlPanel_3015.add(stepButton_3015);
		controlPanel_3015.add(resetButton_3015);

		// area text untuk log langkah langkah
		stepArea_3015 = new JTextArea(8, 60);
		stepArea_3015.setEditable(false);
		stepArea_3015.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_3015 = new JScrollPane(stepArea_3015);

		// tambahkan panel ke frame
		add(inputPanel_3015, BorderLayout.NORTH);
		add(panelArray_3015, BorderLayout.CENTER);
		add(controlPanel_3015, BorderLayout.SOUTH);
		add(scrollPane_3015, BorderLayout.EAST);

		// event set array
		setButton_3015.addActionListener(e -> setArrayFromInput_3015());

		// event selanjutnya
		stepButton_3015.addActionListener(e -> performStep_3015());

		// event reset
		resetButton_3015.addActionListener(e -> reset_3015());
	}

	private void setArrayFromInput_3015() {
		String text_3015 = inputField_3015.getText().trim();
		if (text_3015.isEmpty()) return;
		String[] parts_3015 = text_3015.split(",");
		array_3015 = new int[parts_3015.length];
		try {
			for (int k = 0; k < parts_3015.length; k++) {
				array_3015[k] = Integer.parseInt(parts_3015[k].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka dengan koma!",
					"Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		labelArray_3015 = new JLabel[array_3015.length];
		panelArray_3015.removeAll();
		for (int k = 0; k < array_3015.length; k++) {
			labelArray_3015[k] = new JLabel(String.valueOf(array_3015[k]));
			labelArray_3015[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_3015[k].setOpaque(true);
			labelArray_3015[k].setBackground(Color.WHITE);
			labelArray_3015[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_3015[k].setPreferredSize(new Dimension(50, 50));
			labelArray_3015[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_3015.add(labelArray_3015[k]);
		}

		mergeQueue_3015.clear();
		generateMergeSteps_3015(0, array_3015.length - 1);
		stepButton_3015.setEnabled(true);
		stepArea_3015.setText("");
		stepCount_3015 = 1;
		isMerging_3015 = false;

		panelArray_3015.revalidate();
		panelArray_3015.repaint();
	}

	private void generateMergeSteps_3015(int left, int right) {
		if (left >= right) return;
		int mid = (left + right) / 2;
		generateMergeSteps_3015(left, mid);
		generateMergeSteps_3015(mid + 1, right);
		mergeQueue_3015.add(new int[]{left, mid, right});
	}

	private void performStep_3015() {
		resetHighlights_3015();

		if (!isMerging_3015 && !mergeQueue_3015.isEmpty()) {
			int[] range_3015 = mergeQueue_3015.poll();
			left_3015 = range_3015[0];
			mid_3015 = range_3015[1];
			right_3015 = range_3015[2];
			temp_3015 = new int[right_3015 - left_3015 + 1];
			i_3015 = left_3015;
			j_3015 = mid_3015 + 1;
			k_3015 = 0;
			copying_3015 = false;
			isMerging_3015 = true;
			stepArea_3015.append("Langkah " + stepCount_3015++ +
					": Mulai merge dari " + left_3015 + " ke " + right_3015 + "\n");
			return;
		}

		if (isMerging_3015 && !copying_3015) {
			if (i_3015 <= mid_3015 && j_3015 <= right_3015) {
				labelArray_3015[i_3015].setBackground(Color.CYAN);
				labelArray_3015[j_3015].setBackground(Color.CYAN);
				if (array_3015[i_3015] <= array_3015[j_3015]) {
					temp_3015[k_3015++] = array_3015[i_3015++];
				} else {
					temp_3015[k_3015++] = array_3015[j_3015++];
				}
				stepArea_3015.append("Langkah " + stepCount_3015++ + ": Bandingkan dan salin elemen\n");
				return;
			} else if (i_3015 <= mid_3015) {
				temp_3015[k_3015++] = array_3015[i_3015++];
				stepArea_3015.append("Langkah " + stepCount_3015++ + ": Salin sisa kiri\n");
				return;
			} else if (j_3015 <= right_3015) {
				temp_3015[k_3015++] = array_3015[j_3015++];
				stepArea_3015.append("Langkah " + stepCount_3015++ + ": Salin sisa kanan\n");
				return;
			} else {
				copying_3015 = true;
				k_3015 = 0;
				return;
			}
		}

		if (copying_3015 && k_3015 < temp_3015.length) {
			array_3015[left_3015 + k_3015] = temp_3015[k_3015];
			labelArray_3015[left_3015 + k_3015].setText(String.valueOf(temp_3015[k_3015]));
			labelArray_3015[left_3015 + k_3015].setBackground(Color.GREEN);
			k_3015++;
			stepArea_3015.append("Langkah " + stepCount_3015++ + ": Tempelkan ke array utama\n");
			return;
		}

		if (copying_3015 && k_3015 == temp_3015.length) {
			isMerging_3015 = false;
			copying_3015 = false;
		}

		if (mergeQueue_3015.isEmpty() && !isMerging_3015) {
			stepArea_3015.append("Selesai.\n");
			stepButton_3015.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
		}
	}

	private void resetHighlights_3015() {
		if (labelArray_3015 == null) return;
		for (JLabel label : labelArray_3015) {
			label.setBackground(Color.WHITE);
		}
	}

	private void reset_3015() {
		inputField_3015.setText("");
		panelArray_3015.removeAll();
		panelArray_3015.revalidate();
		panelArray_3015.repaint();
		stepArea_3015.setText("");
		stepButton_3015.setEnabled(false);
		mergeQueue_3015.clear();
		isMerging_3015 = false;
		stepCount_3015 = 1;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MergeSortGUI_2511533015 gui = new MergeSortGUI_2511533015();
			gui.setVisible(true);
		});
	}
}