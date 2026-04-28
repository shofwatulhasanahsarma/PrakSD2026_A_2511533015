package pekan4_2511533015;
import java.util.Queue;
import java.util.LinkedList;
public class QueueLinkedList_2511533015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q_3015= new LinkedList<>();
		//tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i = 0; i < 6; i++)
			q_3015.add(i);
		//menampilkan isi antrian.
		System.out.println ("Elemen Antrian " + q_3015);
		//untuk menghapus kepala antrian.
		int hapus = q_3015.remove();
		System.out.println ("Hapus elemen = " + hapus);
		System.out.println (q_3015);
		//untuk melihat antrian terdepan
		int depan = q_3015.peek();
		System.out.println ("Kepala Antrian = " + depan);
		int banyak = q_3015.size ();
		System.out.println ("Size Antrian = " + banyak);

	}

}
