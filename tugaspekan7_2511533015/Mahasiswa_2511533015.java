package tugaspekan7_2511533015;

public class Mahasiswa_2511533015 {
		private String nama_3015;
	    private String nim_3015;
	    private String prodi_3015;

	    // Constructor
	    public Mahasiswa_2511533015(String nama_3015, String nim_3015, String prodi_3015) {
	        this.nama_3015 = nama_3015;
	        this.nim_3015 = nim_3015;
	        this.prodi_3015 = prodi_3015;
	    }

	    // Getter dan Setter
	    public String getNama_3015() {
	        return nama_3015;
	    }

	    public void setNama_3015(String nama_3015) {
	        this.nama_3015 = nama_3015;
	    }

	    public String getNim_3015() {
	        return nim_3015;
	    }

	    public void setNim_3015(String nim_3015) {
	        this.nim_3015 = nim_3015;
	    }

	    public String getProdi_3015() {
	        return prodi_3015;
	    }

	    public void setProdi_3015(String prodi_3015) {
	        this.prodi_3015 = prodi_3015;
	    }

	    @Override
	    public String toString() {
	        return nama_3015 + " - " + nim_3015 + " - " + prodi_3015;
	    }
	}
