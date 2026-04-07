package pekan2_2511533015;

public class Mahasiswa_2511533015 {
	// TODO Auto-generated method stub
		String nim;
		String nama;
		String prodi;
		public Mahasiswa_2511533015 (String nim, String nama, String prodi){
			this.nim = nim;
			this.nama = nama;
			this.prodi = prodi;
			
		}
		@Override
		public String toString () {
			return "NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi;
		}
	}