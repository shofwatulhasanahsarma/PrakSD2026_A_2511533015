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

public class BubbleSortGUI_2511533015 extends JFrame {

    private static final long serialVersionUID = 1L;

    private int[] array_3015;
    private JLabel[] labelArray_3015;

    private JTextField inputField_3015;
    private JTextArea stepArea_3015;

    private JButton setButton_3015;
    private JButton stepButton_3015;
    private JButton resetButton_3015;

    private JPanel panelArray_3015;

    private int i_3015 = 0;
    private int j_3015 = 0;
    private int stepCount_3015 = 1;
    private boolean sorting_3015 = false;

    public BubbleSortGUI_2511533015() {

        setTitle("Bubble Sort GUI 2511533015");
        setSize(900, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel_3015 = new JPanel(new FlowLayout());

        inputField_3015 = new JTextField(25);
        setButton_3015 = new JButton("Set Array");

        inputPanel_3015.add(new JLabel("Input angka (pisahkan koma):"));
        inputPanel_3015.add(inputField_3015);
        inputPanel_3015.add(setButton_3015);

        panelArray_3015 = new JPanel(new FlowLayout());

        JPanel controlPanel_3015 = new JPanel();

        stepButton_3015 = new JButton("Langkah Selanjutnya");
        resetButton_3015 = new JButton("Reset");

        stepButton_3015.setEnabled(false);

        controlPanel_3015.add(stepButton_3015);
        controlPanel_3015.add(resetButton_3015);

        stepArea_3015 = new JTextArea(12, 40);
        stepArea_3015.setEditable(false);

        JScrollPane scrollPane_3015 = new JScrollPane(stepArea_3015);

        add(inputPanel_3015, BorderLayout.NORTH);
        add(panelArray_3015, BorderLayout.CENTER);
        add(controlPanel_3015, BorderLayout.SOUTH);
        add(scrollPane_3015, BorderLayout.EAST);

        setButton_3015.addActionListener(e -> setArrayFromInput_3015());
        stepButton_3015.addActionListener(e -> performStep_3015());
        resetButton_3015.addActionListener(e -> reset_3015());
    }

    private void setArrayFromInput_3015() {

        String text_3015 = inputField_3015.getText().trim();

        if (text_3015.isEmpty())
            return;

        try {

            String[] parts_3015 = text_3015.split(",");

            array_3015 = new int[parts_3015.length];

            for (int k_3015 = 0; k_3015 < parts_3015.length; k_3015++) {
                array_3015[k_3015] = Integer.parseInt(parts_3015[k_3015].trim());
            }

            panelArray_3015.removeAll();

            labelArray_3015 = new JLabel[array_3015.length];

            for (int k_3015 = 0; k_3015 < array_3015.length; k_3015++) {

                labelArray_3015[k_3015] = new JLabel(String.valueOf(array_3015[k_3015]));

                labelArray_3015[k_3015].setFont(new Font("Arial", Font.BOLD, 24));
                labelArray_3015[k_3015].setOpaque(true);
                labelArray_3015[k_3015].setBackground(Color.WHITE);
                labelArray_3015[k_3015].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                labelArray_3015[k_3015].setPreferredSize(new Dimension(60, 60));
                labelArray_3015[k_3015].setHorizontalAlignment(SwingConstants.CENTER);

                panelArray_3015.add(labelArray_3015[k_3015]);
            }

            i_3015 = 0;
            j_3015 = 0;
            stepCount_3015 = 1;
            sorting_3015 = true;

            stepArea_3015.setText("");
            stepButton_3015.setEnabled(true);

            panelArray_3015.revalidate();
            panelArray_3015.repaint();

        } catch (NumberFormatException ex_3015) {

            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan angka yang dipisahkan koma!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void performStep_3015() {

        if (!sorting_3015 || i_3015 >= array_3015.length - 1) {

            sorting_3015 = false;
            stepButton_3015.setEnabled(false);

            JOptionPane.showMessageDialog(this,
                    "Bubble Sort selesai!");

            return;
        }

        resetHighlights_3015();

        labelArray_3015[j_3015].setBackground(Color.CYAN);
        labelArray_3015[j_3015 + 1].setBackground(Color.CYAN);

        StringBuilder log_3015 = new StringBuilder();

        if (array_3015[j_3015] > array_3015[j_3015 + 1]) {

            int temp_3015 = array_3015[j_3015];
            array_3015[j_3015] = array_3015[j_3015 + 1];
            array_3015[j_3015 + 1] = temp_3015;

            updateLabels_3015();

            labelArray_3015[j_3015].setBackground(Color.RED);
            labelArray_3015[j_3015 + 1].setBackground(Color.RED);

            log_3015.append("Langkah ")
                    .append(stepCount_3015)
                    .append(": Tukar ")
                    .append(array_3015[j_3015 + 1])
                    .append(" dengan ")
                    .append(array_3015[j_3015])
                    .append("\n");

        } else {

            log_3015.append("Langkah ")
                    .append(stepCount_3015)
                    .append(": Tidak ada pertukaran\n");
        }

        log_3015.append("Array : ")
                .append(arrayToString_3015(array_3015))
                .append("\n\n");

        stepArea_3015.append(log_3015.toString());

        j_3015++;

        if (j_3015 >= array_3015.length - i_3015 - 1) {
            j_3015 = 0;
            i_3015++;
        }

        stepCount_3015++;
    }

    private void updateLabels_3015() {

        for (int k_3015 = 0; k_3015 < array_3015.length; k_3015++) {
            labelArray_3015[k_3015]
                    .setText(String.valueOf(array_3015[k_3015]));
        }
    }

    private void resetHighlights_3015() {

        for (JLabel label_3015 : labelArray_3015) {
            label_3015.setBackground(Color.WHITE);
        }
    }

    private void reset_3015() {

        inputField_3015.setText("");
        panelArray_3015.removeAll();
        panelArray_3015.revalidate();
        panelArray_3015.repaint();

        stepArea_3015.setText("");

        i_3015 = 0;
        j_3015 = 0;
        stepCount_3015 = 1;

        sorting_3015 = false;

        stepButton_3015.setEnabled(false);
    }

    private String arrayToString_3015(int[] arr_3015) {

        StringBuilder sb_3015 = new StringBuilder();

        for (int k_3015 = 0; k_3015 < arr_3015.length; k_3015++) {

            sb_3015.append(arr_3015[k_3015]);

            if (k_3015 < arr_3015.length - 1) {
                sb_3015.append(", ");
            }
        }

        return sb_3015.toString();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            BubbleSortGUI_2511533015 gui_3015 =
                    new BubbleSortGUI_2511533015();

            gui_3015.setVisible(true);
        });
    }
}