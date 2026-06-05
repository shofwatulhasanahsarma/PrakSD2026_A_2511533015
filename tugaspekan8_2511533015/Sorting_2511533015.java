package tugaspekan8_2511533015;

import java.util.Scanner;

public class Sorting_2511533015 {

    private static final int MAKS_DATA_3015 = 20;
    private Lagu_2511533015[] dataLagu_3015 = new Lagu_2511533015[MAKS_DATA_3015];
    private int jumlahData_3015 = 0;

    public void inputData_3015() {
        tambahLagu_3015("Mio Cristo Piange Diamanti", "Unknown", 270);
        tambahLagu_3015("La Rumba Del Perdon", "Unknown", 252);
        tambahLagu_3015("La Perla", "Unknown", 196);
        tambahLagu_3015("Bella Ciao", "Unknown", 214);
        tambahLagu_3015("Volare", "Unknown", 205);
        tambahLagu_3015("O Sole Mio", "Unknown", 242);
        tambahLagu_3015("Con Te Partiro", "Unknown", 240);
    }

    private void tambahLagu_3015(String judul_3015, String penyanyi_3015, int durasi_3015) {
        if (jumlahData_3015 < MAKS_DATA_3015) {
            dataLagu_3015[jumlahData_3015] = new Lagu_2511533015(judul_3015, penyanyi_3015, durasi_3015);
            jumlahData_3015++;
        }
    }

    public void tampilData_3015(String judulTampilan_3015) {
        System.out.println(judulTampilan_3015);
        for (int i_3015 = 0; i_3015 < jumlahData_3015; i_3015++) {
            System.out.println((i_3015 + 1) + ". "
                    + dataLagu_3015[i_3015].getJudul_3015()
                    + " - "
                    + dataLagu_3015[i_3015].getDurasi_3015()
                    + " detik");
        }
    }

    public void pilihAlgoritma_3015(Scanner input_3015) {
        int pilihan_3015;

        do {
            System.out.println("=== Sorting Playlist NIM: 2511533015 ===");
            System.out.println("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
            System.out.print("Pilihan: ");
            pilihan_3015 = input_3015.nextInt();

            if (pilihan_3015 != 2) {
                System.out.println("Pada program ini hanya Quick Sort yang diimplementasikan.");
                System.out.println("Silakan pilih 2.\n");
            }
        } while (pilihan_3015 != 2);

        tampilData_3015("Data Sebelum Sorting:");

        quickSort_3015(0, jumlahData_3015 - 1);

        tampilData_3015("\nData Setelah Quick Sort (Durasi Asc):");
    }

    private void quickSort_3015(int kiri_3015, int kanan_3015) {
        if (kiri_3015 < kanan_3015) {
            int pivot_3015 = partition_3015(kiri_3015, kanan_3015);
            quickSort_3015(kiri_3015, pivot_3015 - 1);
            quickSort_3015(pivot_3015 + 1, kanan_3015);
        }
    }

    private int partition_3015(int kiri_3015, int kanan_3015) {
        Lagu_2511533015 pivot_3015 = dataLagu_3015[kanan_3015];
        int i_3015 = kiri_3015 - 1;

        for (int j_3015 = kiri_3015; j_3015 < kanan_3015; j_3015++) {
            if (bandingkan_3015(dataLagu_3015[j_3015], pivot_3015) <= 0) {
                i_3015++;
                swap_3015(i_3015, j_3015);
            }
        }

        swap_3015(i_3015 + 1, kanan_3015);
        return i_3015 + 1;
    }

    private void swap_3015(int i_3015, int j_3015) {
        Lagu_2511533015 temp_3015 = dataLagu_3015[i_3015];
        dataLagu_3015[i_3015] = dataLagu_3015[j_3015];
        dataLagu_3015[j_3015] = temp_3015;
    }

    private int bandingkan_3015(Lagu_2511533015 a_3015, Lagu_2511533015 b_3015) {
        int hasilDurasi_3015 = Integer.compare(a_3015.getDurasi_3015(), b_3015.getDurasi_3015());
        if (hasilDurasi_3015 != 0) {
            return hasilDurasi_3015;
        }
        return a_3015.getJudul_3015().compareToIgnoreCase(b_3015.getJudul_3015());
    }

    public static void main(String[] args_3015) {
        Scanner input_3015 = new Scanner(System.in);

        Sorting_2511533015 program_3015 = new Sorting_2511533015();
        program_3015.inputData_3015();
        program_3015.pilihAlgoritma_3015(input_3015);

        input_3015.close();
    }
}