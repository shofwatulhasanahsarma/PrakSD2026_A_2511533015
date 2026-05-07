package tugaspekan5_2511533015;

public class Pasien_2511533015 {
	//atribut pasien
	private String namaPasien_3015;
	private String keluhan_3015;
	private int nomorAntrian_3015;
	
	//pointer ke node berikutnya
	Pasien_2511533015 next_3015;
	
	//construktor
	public Pasien_2511533015 (String namaPasien_3015,String keluhan_3015, int nomorAntrian_3015) {
		this.namaPasien_3015 = namaPasien_3015;
		this.keluhan_3015 = keluhan_3015;
		this.nomorAntrian_3015 = nomorAntrian_3015;
		this.next_3015 = null;
	}
	
	//getter
	public String getNamaPasien_3015() {
		return namaPasien_3015;
	}
	
	public String getKeluhan_3015() {
		return keluhan_3015;
	}
	
	public int getNomorAntrian_3015() {
		return nomorAntrian_3015;
	}
	
	public Pasien_2511533015 getNext_3015() {
		return next_3015;
	}
	
	//setter
	public void setNamaPasien_3015 (String namaPasien_3015) {
		this.namaPasien_3015 = namaPasien_3015;
	}
	
	public void setKeluhan_3015 (String keluhan_3015) {
		this.keluhan_3015 = keluhan_3015;
	}
	
	public void setNomorAntrian_3015 (int nomorAntrian_3015) {
		this.nomorAntrian_3015 = nomorAntrian_3015;
	}
	
	public void setNext_3015 (Pasien_2511533015  next_3015) {
		this.next_3015 = next_3015;
	}
}
