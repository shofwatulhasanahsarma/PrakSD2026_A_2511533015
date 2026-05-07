package tugaspekan5_2511533015;
import java.util.Scanner;
public class RumahSakit_2511533015 {
	
	static Pasien_2511533015 head_3015 = null;
	static int counter_3015 = 0;
	
	//insert at tail
	public static void daftarkanPasien_3015 (String nama_3015, String keluhan_3015) {
		counter_3015++;
		
		Pasien_2511533015 pasienBaru_3015 = new Pasien_2511533015 (nama_3015, keluhan_3015, counter_3015);
		
		//jika ;ist kosong
		if (head_3015 == null) {
			head_3015 = pasienBaru_3015;
		} else {
			
			//traversal ke node terakhir
			Pasien_2511533015 temp_3015 = head_3015;
			
			while (temp_3015.next_3015 != null) {
			}
			
			//sambungkan node terakhir ke node baru
			temp_3015.next_3015 = pasienBaru_3015;
		}
		
		System.out.println ("Pasien berhasil didaftarkan!");
		System.out.println ("Nomor Antrian: " + pasienBaru_3015.getNomorAntrian_3015());
	}
	
	//delete head
	public static void panggilPasien_3015() {
		
		//cek list kosong
		if (head_3015 == null) {
			System.out.println ("Antrian kosong!");
			return;
		}
		
		System.out.println ("\nPasien Dipanggil:");
		System.out.println ("Nomor Antrian : " + head_3015.getNomorAntrian_3015());
		System.out.println ("Nama Pasien : " + head_3015.getNamaPasien_3015());
		System.out.println ("Keluhan : " + head_3015.getKeluhan_3015());
		
		//geser head
		head_3015 = head_3015.next_3015;
	}
	
	//display
	public static void tampilkanAntrian_3015() {
		if (head_3015 == null) {
			System.out.println ("Antrian kosonbg!");
			return;
		}
		
		Pasien_2511533015 temp_3015 = head_3015;
		
		System.out.println ("\n=== DAFTAR ANTRIAN PASIEN ==="); 
		
		while (temp_3015 != null) {
			
			System.out.println ("-----------------------------");
			System.out.println ("Nomor Antrian : " + temp_3015.getNomorAntrian_3015());
			System.out.println ("Nama Pasien : " + temp_3015.getNamaPasien_3015());
			System.out.println ("Keluhan : " + temp_3015.getKeluhan_3015());
			
			temp_3015 =temp_3015.next_3015;
		}
	}
	
	//search
	public static void cariPasien_3015 (String namaCari) {
		if (head_3015 == null) {
			System.out.println ("Antrian kosong!");
			return;
		}
		
		Pasien_2511533015 temp_3015 = head_3015;
		boolean ditemukan = false;
		
		while (temp_3015 != null) {
			
			//case-insensitive
			if (temp_3015.getNamaPasien_3015().equalsIgnoreCase(namaCari)) {
				
				System.out.println ("\nPasien Ditemukan!");
				System.out.println ("Nomor Antrian : " + temp_3015.getNomorAntrian_3015());
				System.out.println ("Nama Pasien : " + temp_3015.getNamaPasien_3015());
				System.out.println ("Keluhan : " + temp_3015.getKeluhan_3015 ());
				
				ditemukan = true;
				break;
			}
			
			temp_3015 = temp_3015.next_3015;
		}
		
		if (!ditemukan) {
			System.out.println ("Pasien tidak ditemukan!");
		}
	}
	
	 //cek status antrian
    public static void cekStatusAntrian_3015() {

        if (head_3015 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        int jumlah = 0;

        Pasien_2511533015 temp_3015 = head_3015;

        while (temp_3015 != null) {
            jumlah++;
            temp_3015 = temp_3015.next_3015;
        }

        System.out.println("\n=== STATUS ANTRIAN ===");
        System.out.println("Jumlah Pasien : " + jumlah);

        System.out.println("\nPasien Terdepan:");
        System.out.println("Nomor Antrian : " + head_3015.getNomorAntrian_3015());
        System.out.println("Nama Pasien   : " + head_3015.getNamaPasien_3015());
        System.out.println("Keluhan       : " + head_3015.getKeluhan_3015());
    }

    //main program
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;

        do {

            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533015 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien   (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien      (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_3015 = input.nextLine();

                    System.out.print("Masukkan Keluhan     : ");
                    String keluhan_3015 = input.nextLine();

                    daftarkanPasien_3015(nama_3015, keluhan_3015);

                    break;
                case 2:
                    panggilPasien_3015();
                    break;

                case 3:
                    tampilkanAntrian_3015();
                    break;

                case 4:
                    System.out.print("Masukkan Nama Pasien yang dicari : ");
                    String cari = input.nextLine();
                    cariPasien_3015(cari);
                    break;

                case 5:
                    cekStatusAntrian_3015();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:

                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 6);

        input.close();
    }
}
