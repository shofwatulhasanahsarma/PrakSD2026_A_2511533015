package tugaspekan3_2511533015;
import java.util.Scanner;
import java.util.Stack;
public class Browser_2511533015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input_3015 = new Scanner(System.in);
        Stack<Website_2511533015> history_3015 = new Stack<>();

        int pilihan;

        do {
            System.out.println("\n=== Browser History NIM: 2511533015 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input_3015.nextInt();
            input_3015.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul_3015 = input_3015.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url_3015= input_3015.nextLine();

                    Website_2511533015 websiteBaru =
                            new Website_2511533015(judul_3015, url_3015);

                    history_3015.push(websiteBaru);
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history_3015.isEmpty()) {
                        Website_2511533015 hapus = history_3015.pop();
                        System.out.println("Kembali dari: "
                                + hapus.getJudulWebsite_3015());
                    } else {
                        System.out.println("History kosong!");
                    }
                    break;

                case 3:
                    if (!history_3015.isEmpty()) {
                        Website_2511533015 aktif = history_3015.peek();
                        System.out.println("Halaman aktif:");
                        System.out.println("Judul : "
                                + aktif.getJudulWebsite_3015());
                        System.out.println("URL   : "
                                + aktif.getUrlWebsite_3015());
                    } else {
                        System.out.println("Tidak ada halaman aktif!");
                    }
                    break;

                case 4:
                    if (history_3015.isEmpty()) {
                        System.out.println("History kosong");
                    } else {
                        System.out.println("Jumlah history: "
                                + history_3015.size());
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input_3015.close();

	}

}
