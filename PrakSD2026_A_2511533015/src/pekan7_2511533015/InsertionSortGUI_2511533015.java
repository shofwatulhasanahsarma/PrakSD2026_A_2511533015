package pekan7_2511533015;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
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
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2511533015 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private int [] array_3015;
	private JLabel [] labelArray_3015;
	private JButton stepButton_3015, resetButton_3015, setButton_3015;
	private JTextField inputField_3015;
	private JPanel panelArray_3015;
	private JTextArea stepArea_3015;
	
	private int i_3015 = 1, j_3015;
	private boolean sorting_3015 = false;
	private int stepCount_3015 = 1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public InsertionSortGUI_2511533015() {
		setTitle("Insertion Sort Langkah per Lanagkah");
		setSize (750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo (null);
		setLayout (new BorderLayout ());
		
		//Panel input
		JPanel inputPanel_3015 = new JPanel (new FlowLayout());
		inputField_3015 = new JTextField (30);
		setButton_3015 = new JButton ("Set Array");
		inputPanel_3015.add (new JLabel ("Masukkan angka (pisahkan dengan koma): "));
		inputPanel_3015.add (inputField_3015);
		inputPanel_3015.add (setButton_3015);
		
		//Panel array visual
		panelArray_3015 = new JPanel ();
		panelArray_3015.setLayout (new FlowLayout());
		
		//Panel kontrol
		JPanel controlPanel = new JPanel ();
		stepButton_3015 = new JButton ("Langkah Selanjutnya");
		resetButton_3015 = new JButton ("Reset");
		stepButton_3015.setEnabled (false);
		controlPanel.add (stepButton_3015);
		controlPanel.add (resetButton_3015);
		
		//Area teks untuk log langkah-langkah
		stepArea_3015 = new JTextArea (8, 60);
		stepArea_3015.setEditable (false);
		stepArea_3015.setFont (new Font ("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane (stepArea_3015);
		
		//Tambahkan panel ke frame
		add (inputPanel_3015, BorderLayout.NORTH);
		add (panelArray_3015, BorderLayout.CENTER);
		add (controlPanel, BorderLayout.SOUTH);
		add (scrollPane, BorderLayout.EAST);
		
		//Event Set Array
		setButton_3015.addActionListener (e -> setArrayFromInput ());
		
		//Event Langkah Selanjutnya
		stepButton_3015.addActionListener (e -> performStep ());
		
		//Event Reset
		resetButton_3015.addActionListener (e -> reset ());
	}
	
		private void setArrayFromInput () {
			String text = inputField_3015.getText ().trim();
			if (text.isEmpty()) return;
			String [] parts = text.split (",");
			array_3015 = new int [parts.length];
			try {
				for (int k = 0; k < parts.length; k++) {
					array_3015 [k] = Integer.parseInt (parts [k].trim()); }
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog (this,  "Masukkan hanya yang dipisahkan "
							+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
					return; }
			i_3015 = 1;
			stepCount_3015 = 1;
			sorting_3015 = true;
			stepButton_3015.setEnabled (true);
			stepArea_3015.setText ("");
			panelArray_3015.removeAll ();
			labelArray_3015 = new JLabel [array_3015.length];
			for (int k = 0; k < array_3015.length; k++) {
				labelArray_3015 [k] = new JLabel (String.valueOf (array_3015[k]));
				labelArray_3015 [k].setFont (new Font ("Arial", Font.BOLD, 24));
				labelArray_3015 [k].setBorder (BorderFactory.createLineBorder (Color.BLACK));
				labelArray_3015 [k].setPreferredSize (new Dimension (50,50));
				labelArray_3015 [k].setHorizontalAlignment (SwingConstants.CENTER);
				panelArray_3015.add (labelArray_3015 [k]);
			}
			panelArray_3015.revalidate();
			panelArray_3015.repaint ();
		}
			private void performStep() {
				if (i_3015 < array_3015.length && sorting_3015) {
					int key = array_3015 [i_3015];
					j_3015 = i_3015 - 1;
					
					StringBuilder stepLog = new StringBuilder ();
					stepLog.append ("Langkah").append (stepCount_3015).
					append (": Memasukkan ").append (key).append ("\n");
					
					while (j_3015 >= 0 && array_3015 [j_3015] > key) {
						array_3015 [j_3015 + 1] = array_3015 [j_3015];
						j_3015--;
					}
					array_3015 [j_3015 + 1] = key;
					
					updateLabels ();
					stepLog.append ("Hasil: ").append (arrayToString (array_3015)).append("\n\n");
					stepArea_3015.append (stepLog.toString ());
					
					i_3015++;
					stepCount_3015++;
					
					if (i_3015 == array_3015.length) {
						sorting_3015 = false;
						stepButton_3015.setEnabled (false);
						JOptionPane.showMessageDialog (this,  "Sorting selesai");
					}
				}
			}
		
		private void updateLabels () {
			for (int k = 0; k < array_3015.length; k++) {
				labelArray_3015[k].setText (String.valueOf (array_3015 [k]));
			}
		}
		private void reset () {
			inputField_3015.setText ("");
			panelArray_3015.removeAll ();
			panelArray_3015.revalidate ();
			stepArea_3015.setText ("");
			stepButton_3015.setEnabled (false);
			sorting_3015 = false;
			i_3015 = 1;
			stepCount_3015 = 1;
		}
		
		private String arrayToString (int [] arr) {
			StringBuilder sb = new StringBuilder ();
			for (int k = 0; k < arr.length; k++) {
				sb.append (arr[k]);
				if (k < arr.length - 1) { sb.append (", ");}
			}
			return sb.toString ();
		}
		
		public static void main (String [] args) {
			SwingUtilities.invokeLater (() -> {
				InsertionSortGUI_2511533015 gui = new InsertionSortGUI_2511533015();
				gui.setVisible (true);
			});
			}
		}
