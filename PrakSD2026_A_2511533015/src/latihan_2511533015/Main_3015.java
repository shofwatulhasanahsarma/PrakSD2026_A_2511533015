package latihan_2511533015;

public class Main_3015 {

	//Class utama
	public class Main {
	 public static void main(String[] args) {

	     // Membuat objek perpustakaan
	     Perpustakaan p = new Perpustakaan();

	     // Membuat objek buku
	     Buku b1 = new Buku("Java Dasar", "Andi", "001");
	     Buku b2 = new Buku("Struktur Data", "Budi", "002");

	     // Menambahkan buku
	     p.tambahBuku(b1);
	     p.tambahBuku(b2);

	     // Menampilkan buku
	     System.out.println("=== DATA AWAL ===");
	     p.tampilkanBuku();

	     // Proses peminjaman
	     System.out.println("\n=== PINJAM BUKU ===");
	     p.pinjamBuku();

	     // Proses pengembalian
	     System.out.println("\n=== KEMBALIKAN BUKU ===");
	     p.kembalikanBuku();
	 }
	}

}
