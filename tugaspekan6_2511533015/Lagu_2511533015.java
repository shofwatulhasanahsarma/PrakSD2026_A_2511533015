package tugaspekan6_2511533015;

//kelas node lagu
public class Lagu_2511533015 {
	//atribut lagu
	private String judul_3015;
	private String penyanyi_3015;
	
	//pointer next dan prev
	Lagu_2511533015 next_3015;
	Lagu_2511533015 prev_3015;
	
	//constructor
	public Lagu_2511533015 (String judul_3015, String penyanyi_3015) {
		this.judul_3015 = judul_3015;
		this.penyanyi_3015 = penyanyi_3015;
		this.next_3015 = null;
		this.prev_3015 = null;
	}
	
	//getter judul
	public String getJudul_3015() {
		return judul_3015;
	}
	
	//getter penyanyi
	public String getPenyanyi_3015() {
		return penyanyi_3015;
	}
	
	//setter penyanyi
	public void setPenyanyi_3015 (String penyanyi_3015) {
		this.penyanyi_3015 = penyanyi_3015;
	}

}
