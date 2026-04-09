package pekan3_2511533015;
import java.util.Stack;
public class NilaiMaksimum_2511533015 {
	public static int max_3015 (Stack <Integer> s_3015) {
		Stack<Integer> backup_3015 = new Stack <Integer>();
		int maxValue_3015 = s_3015.pop ();
		backup_3015.push (maxValue_3015);
		while (!s_3015.isEmpty()) {
			int next = s_3015.pop();
			backup_3015.push(next);
			maxValue_3015 = Math.max (maxValue_3015, next);
			}
		while (!backup_3015.isEmpty()) {
			s_3015.push (backup_3015.pop());
		}
		return maxValue_3015;
		}
	public static void main (String[] args) {
		Stack <Integer> s_3015 = new  Stack <Integer>();
		s_3015.push (70);
		s_3015.push (12);
		s_3015.push (20);
		System.out.println("isi stack " +s_3015);
		System.out.println("Stack Teratas"+ s_3015.peek());
		System.out.println("Nilai maksimum"+ max_3015 (s_3015));
	}

}
