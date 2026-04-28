package pekan4_2511533015;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
public class IterasiQueue_2511533015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q_3015= new LinkedList <>();
		
		q_3015.add ("Praktikum");
		q_3015.add ("Struktur");
		q_3015.add ("Data");
		q_3015.add ("Dan");
		q_3015.add ("Algoritma");
		Iterator<String> iterator = q_3015.iterator ();
		while (iterator.hasNext ()) {
			System.out.print (iterator.next () + " ");
		}
	}
}
