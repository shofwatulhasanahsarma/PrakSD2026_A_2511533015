package tugaspekan6_2511533015;

public class Musik_2511533015 {

	    // head dan tail playlist
	    Lagu_2511533015 head_3015 = null;
	    Lagu_2511533015 tail_3015 = null;

	    // 1. tambah lagu di akhir playlist
	    public void tambahLagu_3015(String judul_3015,
	                                String penyanyi_3015) {

	        // membuat node lagu baru
	        Lagu_2511533015 laguBaru_3015 =
	                new Lagu_2511533015(
	                        judul_3015,
	                        penyanyi_3015
	                );

	        // jika playlist kosong
	        if (head_3015 == null) {

	            head_3015 = laguBaru_3015;
	            tail_3015 = laguBaru_3015;

	        } else {

	            // hubungkan node terakhir dengan lagu baru
	            tail_3015.next_3015 = laguBaru_3015;
	            laguBaru_3015.prev_3015 = tail_3015;

	            // pindahkan tail ke lagu baru
	            tail_3015 = laguBaru_3015;
	        }

	        System.out.println(
	                "Lagu \"" + judul_3015 +
	                "\" berhasil ditambahkan"
	        );
	    }

	    // 2. hapus lagu pertama
	    public void hapusLaguAwal_3015() {

	        // jika playlist kosong
	        if (head_3015 == null) {
	            System.out.println("Playlist kosong");
	            return;
	        }

	        // jika hanya ada satu lagu
	        if (head_3015 == tail_3015) {

	            head_3015 = null;
	            tail_3015 = null;

	        } else {

	            // pindahkan head ke node berikutnya
	            head_3015 = head_3015.next_3015;

	            // prev head baru harus null
	            head_3015.prev_3015 = null;
	        }

	        System.out.println(
	                "Lagu awal berhasil dihapus"
	        );
	    }

	    // 3. hapus lagu terakhir
	    public void hapusLaguAkhir_3015() {

	        // jika playlist kosong
	        if (tail_3015 == null) {
	            System.out.println("Playlist kosong");
	            return;
	        }

	        // jika hanya ada satu lagu
	        if (head_3015 == tail_3015) {

	            head_3015 = null;
	            tail_3015 = null;

	        } else {

	            // pindahkan tail ke node sebelumnya
	            tail_3015 = tail_3015.prev_3015;

	            // next tail baru harus null
	            tail_3015.next_3015 = null;
	        }

	        System.out.println(
	                "Lagu akhir berhasil dihapus"
	        );
	    }

	    // 4. tampil playlist dari depan ke belakang
	    public void tampilMaju_3015() {

	        // jika kosong
	        if (head_3015 == null) {
	            System.out.println("Playlist kosong");
	            return;
	        }

	        Lagu_2511533015 curr_3015 = head_3015;

	        System.out.println("Playlist Maju:");

	        while (curr_3015 != null) {

	            System.out.println(
	                    curr_3015.getJudul_3015()
	                    + " - "
	                    + curr_3015.getPenyanyi_3015()
	            );

	            curr_3015 = curr_3015.next_3015;
	        }
	    }

	    // 5. tampil playlist dari belakang ke depan
	    public void tampilMundur_3015() {

	        // jika kosong
	        if (tail_3015 == null) {
	            System.out.println("Playlist kosong");
	            return;
	        }

	        Lagu_2511533015 curr_3015 = tail_3015;

	        System.out.println("Playlist Mundur:");

	        while (curr_3015 != null) {

	            System.out.println(
	                    curr_3015.getJudul_3015()
	                    + " - "
	                    + curr_3015.getPenyanyi_3015()
	            );

	            curr_3015 = curr_3015.prev_3015;
	        }
	    }

	    // main program
	    public static void main(String[] args) {

	        // membuat object playlist
	        Musik_2511533015 playlist_3015 =
	                new Musik_2511533015();

	        // menambah lagu
	        playlist_3015.tambahLagu_3015(
	                "Hati-Hati di Jalan",
	                "Tulus"
	        );

	        playlist_3015.tambahLagu_3015(
	                "Melukis Senja",
	                "Budi Doremi"
	        );

	        playlist_3015.tambahLagu_3015(
	                "Komang",
	                "Raim Laode"
	        );

	        System.out.println();

	        // tampil maju
	        playlist_3015.tampilMaju_3015();

	        System.out.println();

	        // tampil mundur
	        playlist_3015.tampilMundur_3015();

	        System.out.println();

	        // hapus lagu awal
	        playlist_3015.hapusLaguAwal_3015();

	        System.out.println();

	        // tampil playlist
	        playlist_3015.tampilMaju_3015();

	        System.out.println();

	        // hapus lagu akhir
	        playlist_3015.hapusLaguAkhir_3015();

	        System.out.println();

	        // tampil playlist
	        playlist_3015.tampilMaju_3015();
	    }
	}
