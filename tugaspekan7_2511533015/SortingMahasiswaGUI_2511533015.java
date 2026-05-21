package tugaspekan7_2511533015;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class SortingMahasiswaGUI_2511533015 extends JFrame {

    // Komponen GUI
    private JTextField txtNama_3015;
    private JTextField txtNim_3015;
    private JTextField txtProdi_3015;

    private JButton btnTambah_3015;
    private JButton btnHapus_3015;
    private JButton btnSorting_3015;

    private JComboBox<String> cbSorting_3015;

    private JTable table_3015;
    private DefaultTableModel model_3015;

    private JTextArea txtProses_3015;

    // ArrayList untuk menyimpan data mahasiswa
    private ArrayList<Mahasiswa_2511533015> listMahasiswa_3015 = new ArrayList<>();

    // Constructor
    public SortingMahasiswaGUI_2511533015() {

        setTitle("GUI Sorting Mahasiswa");
        setSize(850, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ================= PANEL INPUT =================
        JPanel panelInput_3015 = new JPanel(new FlowLayout());

        panelInput_3015.add(new JLabel("Nama"));
        txtNama_3015 = new JTextField(10);
        panelInput_3015.add(txtNama_3015);

        panelInput_3015.add(new JLabel("NIM"));
        txtNim_3015 = new JTextField(10);
        panelInput_3015.add(txtNim_3015);

        panelInput_3015.add(new JLabel("Prodi"));
        txtProdi_3015 = new JTextField(10);
        panelInput_3015.add(txtProdi_3015);

        btnTambah_3015 = new JButton("Tambah Data");
        panelInput_3015.add(btnTambah_3015);

        btnHapus_3015 = new JButton("Hapus Data");
        panelInput_3015.add(btnHapus_3015);

        // ================= TABEL =================
        model_3015 = new DefaultTableModel();
        model_3015.addColumn("Nama");
        model_3015.addColumn("NIM");
        model_3015.addColumn("Program Studi");

        table_3015 = new JTable(model_3015);
        JScrollPane scrollTable_3015 = new JScrollPane(table_3015);

        // ================= PANEL SORTING =================
        JPanel panelSorting_3015 = new JPanel(new FlowLayout());

        cbSorting_3015 = new JComboBox<>();
        cbSorting_3015.addItem("Insertion Sort");
        cbSorting_3015.addItem("Selection Sort");
        cbSorting_3015.addItem("Bubble Sort");

        panelSorting_3015.add(new JLabel("Pilih Sorting:"));
        panelSorting_3015.add(cbSorting_3015);

        btnSorting_3015 = new JButton("Mulai Sorting");
        panelSorting_3015.add(btnSorting_3015);

        // ================= TEXT AREA =================
        txtProses_3015 = new JTextArea(15, 60);
        txtProses_3015.setEditable(false);

        JScrollPane scrollText_3015 = new JScrollPane(txtProses_3015);

        // ================= LAYOUT =================
        add(panelInput_3015, BorderLayout.NORTH);
        add(scrollTable_3015, BorderLayout.CENTER);

        JPanel panelBawah_3015 = new JPanel(new BorderLayout());
        panelBawah_3015.add(panelSorting_3015, BorderLayout.NORTH);
        panelBawah_3015.add(scrollText_3015, BorderLayout.CENTER);

        add(panelBawah_3015, BorderLayout.SOUTH);

        // ================= EVENT TAMBAH DATA =================
        btnTambah_3015.addActionListener(e -> tambahData_3015());

        // ================= EVENT HAPUS DATA =================
        btnHapus_3015.addActionListener(e -> hapusData_3015());

        // ================= EVENT SORTING =================
        btnSorting_3015.addActionListener(e -> mulaiSorting_3015());
    }

    // ================= METHOD TAMBAH DATA =================
    private void tambahData_3015() {
        String nama_3015 = txtNama_3015.getText().trim();
        String nim_3015 = txtNim_3015.getText().trim();
        String prodi_3015 = txtProdi_3015.getText().trim();

        if (nama_3015.isEmpty() || nim_3015.isEmpty() || prodi_3015.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua data harus diisi!");
            return;
        }

        Mahasiswa_2511533015 mhs_3015 = new Mahasiswa_2511533015(
                nama_3015,
                nim_3015,
                prodi_3015
        );

        listMahasiswa_3015.add(mhs_3015);

        model_3015.addRow(new Object[] {
                nama_3015,
                nim_3015,
                prodi_3015
        });

        txtNama_3015.setText("");
        txtNim_3015.setText("");
        txtProdi_3015.setText("");
    }

    // ================= METHOD HAPUS DATA =================
    private void hapusData_3015() {
        int selectedRow_3015 = table_3015.getSelectedRow();

        if (selectedRow_3015 != -1) {
            listMahasiswa_3015.remove(selectedRow_3015);
            model_3015.removeRow(selectedRow_3015);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
        }
    }

    // ================= METHOD MULAI SORTING =================
    private void mulaiSorting_3015() {
        if (listMahasiswa_3015.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data mahasiswa masih kosong!");
            return;
        }

        txtProses_3015.setText("");

        String pilihan_3015 = String.valueOf(cbSorting_3015.getSelectedItem());

        if (pilihan_3015.equals("Insertion Sort")) {
            insertionSort_3015();
        } else if (pilihan_3015.equals("Selection Sort")) {
            selectionSort_3015();
        } else {
            bubbleSort_3015();
        }

        tampilkanTable_3015();
    }

    // ================= INSERTION SORT =================
    private void insertionSort_3015() {
        txtProses_3015.append("=== INSERTION SORT ===\n");

        for (int i_3015 = 1; i_3015 < listMahasiswa_3015.size(); i_3015++) {
            Mahasiswa_2511533015 key_3015 = listMahasiswa_3015.get(i_3015);
            int j_3015 = i_3015 - 1;

            while (j_3015 >= 0 &&
                    listMahasiswa_3015.get(j_3015).getNama_3015()
                            .compareToIgnoreCase(key_3015.getNama_3015()) > 0) {

                listMahasiswa_3015.set(j_3015 + 1, listMahasiswa_3015.get(j_3015));
                j_3015--;
            }

            listMahasiswa_3015.set(j_3015 + 1, key_3015);

            txtProses_3015.append("Langkah " + i_3015 + " : " + tampilNama_3015() + "\n");
        }
    }

    // ================= SELECTION SORT =================
    private void selectionSort_3015() {
        txtProses_3015.append("=== SELECTION SORT ===\n");

        for (int i_3015 = 0; i_3015 < listMahasiswa_3015.size() - 1; i_3015++) {
            int minIndex_3015 = i_3015;

            for (int j_3015 = i_3015 + 1; j_3015 < listMahasiswa_3015.size(); j_3015++) {
                if (listMahasiswa_3015.get(j_3015).getNama_3015()
                        .compareToIgnoreCase(listMahasiswa_3015.get(minIndex_3015).getNama_3015()) < 0) {
                    minIndex_3015 = j_3015;
                }
            }

            Mahasiswa_2511533015 temp_3015 = listMahasiswa_3015.get(i_3015);
            listMahasiswa_3015.set(i_3015, listMahasiswa_3015.get(minIndex_3015));
            listMahasiswa_3015.set(minIndex_3015, temp_3015);

            txtProses_3015.append("Pass " + (i_3015 + 1) + " : " + tampilNama_3015() + "\n");
        }
    }

    // ================= BUBBLE SORT =================
    private void bubbleSort_3015() {
        txtProses_3015.append("=== BUBBLE SORT ===\n");

        for (int i_3015 = 0; i_3015 < listMahasiswa_3015.size() - 1; i_3015++) {
            for (int j_3015 = 0; j_3015 < listMahasiswa_3015.size() - i_3015 - 1; j_3015++) {
                if (listMahasiswa_3015.get(j_3015).getNama_3015()
                        .compareToIgnoreCase(listMahasiswa_3015.get(j_3015 + 1).getNama_3015()) > 0) {

                    Mahasiswa_2511533015 temp_3015 = listMahasiswa_3015.get(j_3015);
                    listMahasiswa_3015.set(j_3015, listMahasiswa_3015.get(j_3015 + 1));
                    listMahasiswa_3015.set(j_3015 + 1, temp_3015);
                }
            }

            txtProses_3015.append("Pass " + (i_3015 + 1) + " : " + tampilNama_3015() + "\n");
        }
    }

    // ================= METHOD MENAMPILKAN NAMA =================
    private String tampilNama_3015() {
        StringBuilder hasil_3015 = new StringBuilder("[");

        for (int i_3015 = 0; i_3015 < listMahasiswa_3015.size(); i_3015++) {
            hasil_3015.append(listMahasiswa_3015.get(i_3015).getNama_3015());

            if (i_3015 != listMahasiswa_3015.size() - 1) {
                hasil_3015.append(", ");
            }
        }

        hasil_3015.append("]");
        return hasil_3015.toString();
    }

    // ================= METHOD TAMPILKAN TABEL =================
    private void tampilkanTable_3015() {
        model_3015.setRowCount(0);

        for (Mahasiswa_2511533015 mhs_3015 : listMahasiswa_3015) {
            model_3015.addRow(new Object[] {
                    mhs_3015.getNama_3015(),
                    mhs_3015.getNim_3015(),
                    mhs_3015.getProdi_3015()
            });
        }
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SortingMahasiswaGUI_2511533015().setVisible(true));
    }
}