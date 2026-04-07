package tugaspekan1_2511533015;

public class Driver_2511533015 {
    public static void main(String[] args) {

        Mobil_2511533015 a = new Mobil_2511533015("Avanza", 2020, 1300, 150000000, "Toyota");
        Mobil_2511533015 b = new Mobil_2511533015("Brio", 2022, 1200, 170000000, "Honda");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Mobil_2511533015.tambahMobil(a);
        Mobil_2511533015.tambahMobil(b);

        System.out.println("\nData Mobil:");
        Mobil_2511533015.tampilkanMobil();

        Mobil_2511533015.hapusMobil(0);

        System.out.println("\nSetelah dihapus:");
        Mobil_2511533015.tampilkanMobil();
    }
}