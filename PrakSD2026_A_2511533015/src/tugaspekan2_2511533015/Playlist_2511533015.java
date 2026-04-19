package tugaspekan2_2511533015;
import java.util.ArrayList;
import java.util.Scanner;
public class Playlist_2511533015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input_3015 = new Scanner(System.in);
        ArrayList<Musik_2511533015> playlist_2511533015 = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511533015 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Kapasitas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan= input_3015.nextInt();
            input_3015.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul_3015 = input_3015.nextLine();

                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi_3015 = input_3015.nextLine();

                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi_3015 = input_3015.nextInt();

                    Musik_2511533015 laguBaru =
                            new Musik_2511533015(judul_3015, penyanyi_3015, durasi_3015);

                    playlist_2511533015.add(laguBaru);

                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n=== Daftar Playlist ===");
                    if (playlist_2511533015.isEmpty()) {
                        System.out.println("Playlist kosong");
                    } else {
                        for (int i = 0; i < playlist_2511533015.size(); i++) {
                            System.out.println((i + 1) + ". "
                                    + playlist_2511533015.get(i).getJudulLagu_3015()
                                    + " - "
                                    + playlist_2511533015.get(i).getPenyanyi_3015()
                                    + " (" 
                                    + playlist_2511533015.get(i).getDurasi_3015()
                                    + " detik)");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor lagu yang dihapus: ");
                    int index_3015 = input_3015.nextInt();

                    if (index_3015 > 0 && index_3015 <= playlist_2511533015.size()) {
                        playlist_2511533015.remove(index_3015 - 1);
                        System.out.println("Lagu berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case 4:
                    System.out.println("Jumlah lagu dalam playlist: "
                            + playlist_2511533015.size());
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
