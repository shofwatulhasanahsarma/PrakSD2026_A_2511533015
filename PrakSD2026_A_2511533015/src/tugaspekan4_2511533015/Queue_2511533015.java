package tugaspekan4_2511533015;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Queue_2511533015 {

    public static void main(String[] args) {

        Scanner input_3015 = new Scanner(System.in);
        Queue<String> antrian_3015 = new LinkedList<>();

        int pilih_3015;

        do {
            System.out.println("=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih_3015 = input_3015.nextInt();
            input_3015.nextLine();

            switch (pilih_3015) {

                case 1:
                    System.out.print("\nMasukkan nama pelanggan: ");
                    String nama_3015 = input_3015.nextLine();

                    antrian_3015.add(nama_3015);
                    System.out.println("Data berhasil ditambahkan ke antrian\n");
                    break;

                case 2:
                    if (antrian_3015.isEmpty()) {
                        System.out.println("\nAntrian kosong\n");
                    } else {
                        String hapus_3015 = antrian_3015.remove();
                        System.out.println("\n" + hapus_3015 + " telah dilayani\n");
                    }
                    break;

                case 3:
                    if (antrian_3015.isEmpty()) {
                        System.out.println("\nAntrian kosong\n");
                    } else {
                        System.out.println("\nIsi antrian:");
                        int no_3015 = 1;
                        for (String data_3015 : antrian_3015) {
                            System.out.println(no_3015 + ". " + data_3015);
                            no_3015++;
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    if (antrian_3015.isEmpty()) {
                        System.out.println("\nAntrian kosong\n");
                    } else {

                        Stack<String> stack_3015 = new Stack<>();

                        while (!antrian_3015.isEmpty()) {
                            stack_3015.push(antrian_3015.remove());
                        }

                        while (!stack_3015.isEmpty()) {
                            antrian_3015.add(stack_3015.pop());
                        }

                        System.out.println("\nIsi antrian:");
                        int no_3015 = 1;
                        for (String data_3015 : antrian_3015) {
                            System.out.println(no_3015 + ". " + data_3015);
                            no_3015++;
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("\nProgram selesai");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid\n");
            }

        } while (pilih_3015 != 5);

        input_3015.close();
    }
}