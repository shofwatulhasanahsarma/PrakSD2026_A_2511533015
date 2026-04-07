package tugaspekan1_2511533015;

public class Mobil_2511533015 {

    // atribut
    String nama, merk;
    int tahun, cc, harga;

    // constructor
    public Mobil_2511533015(String nama, int tahun, int cc, int harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // toString
    @Override
    public String toString() {
        return nama + " | " + tahun + " | " + cc + "cc | Rp" + harga + " | " + merk;
    }

    // GETTER
    public String getNama() { return nama; }
    public int getCc() { return cc; }
    public int getHarga() { return harga; }
    public int getTahun() { return tahun; }
    public String getMerk() { return merk; }

    // SETTER
    public void setNama(String nama) { this.nama = nama; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setCc(int cc) { this.cc = cc; }
    public void setHarga(int harga) { this.harga = harga; }
    public void setMerk(String merk) { this.merk = merk; }

    // ARRAY GARASI
    private static int length = 0;
    private static Mobil_2511533015[] garasi = new Mobil_2511533015[0];

    // TAMBAH MOBIL
    public static void tambahMobil(Mobil_2511533015 mobil) {
        length++;
        Mobil_2511533015[] temp = new Mobil_2511533015[length];

        for (int i = 0; i < length - 1; i++) {
            temp[i] = garasi[i];
        }

        temp[length - 1] = mobil;
        garasi = temp;
    }

    // HAPUS MOBIL
    public static void hapusMobil(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Index tidak valid!");
            return;
        }

        Mobil_2511533015[] temp = new Mobil_2511533015[length - 1];
        int j = 0;

        for (int i = 0; i < length; i++) {
            if (i != index) {
                temp[j] = garasi[i];
                j++;
            }
        }

        length--;
        garasi = temp;
    }

    // TAMPILKAN MOBIL
    public static void tampilkanMobil() {
        if (length == 0) {
            System.out.println("Data kosong!");
            return;
        }

        for (int i = 0; i < length; i++) {
            System.out.println(i + ". " + garasi[i]);
        }
    }
}