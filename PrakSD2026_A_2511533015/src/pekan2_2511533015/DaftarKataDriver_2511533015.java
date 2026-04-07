package pekan2_2511533015;

public class DaftarKataDriver_2511533015 {
	public static void main (String [] args){
	DaftarKata_2511533015 al = new DaftarKata_2511533015();
	
		// TODO Auto-generated method stub
		// Menambah elemen (akhir)
		al.tambah_2511533015 ("Kami");
		al.tambah_2511533015("Informatika");
		
		// menyisipkan elemen pada indeks 1
		al.tambahPada_2511533015 (1, "Mahasiswa");
		
		// mengubah elemen (index 1)
		al.ubahElemen_2511533015 (1, "Departemen");
		System.out.println ("Setelah Ubah: " + al);
		
		// menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen (0);
		System.out.println (" Terhapus : " + terhapus);
		System.out.println ("Setelah Hapus: " + al);
		
		// iterasi pada ArrayList (cetak setiap elemen)
		System.out.print("Iterasi");
		al.iterasiCetak ();
		System.out.println ();

	}
}

