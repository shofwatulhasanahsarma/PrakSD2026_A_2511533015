package pekan2_2511533015;
import java.util.ArrayList;
public class DaftarKata_2511533015 {
	private final ArrayList <String> data;
	// Konstruktor: inisialisasi list kosong
	public DaftarKata_2511533015() {
		this.data = new ArrayList<> ();
	}
	/** menambahkan elemen di akhir list. */
	public void tambah_2511533015 (String elemen) {
		data.add (elemen);
	}
	/** menambahkan elemen pada indeks tertentu (menyisipkan). */
	public void tambahPada_2511533015 (int index, String elemen) {
		data.add (index, elemen);
	}
	/**
	 * mengubah elemen pada posisi 'index' menjadi 'nilaiBaru'.
	 * bertindak sebagai "setter" untuk elemen tertentu.
	 */
	public void ubahElemen_2511533015 (int index, String nilaiBaru) {
		data.set (index, nilaiBaru);
	}
	/**
	 * menghapus elemen pada posisi 'index' dan mengembaliikan nilai yang dihapus.
	 */
	public  String hapusElemen (int index) {
		return data.remove(index);
	}
	/**
	 * melakukan iterasi dan mencetak setiap elemen dalam format : [index] nilai
	 * (metode ini tidak mengembalikannilai ; hanya demonstrasi iterasi).
	 */
	public void iterasiCetak () {
		for (int i = 0; i< data.size (); i++) {
			System.out.print(data.get(i) + " ");
		}
	}
	/** mengambil elemen berdasarkan indeks. */
	public String get (int index) {
		return data.get (index);
	}
	
	// representasi string agar mudah dicetak
	@Override
	public String toString () {
		return data.toString ();
	}

}
