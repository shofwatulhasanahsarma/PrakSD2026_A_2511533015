reservepackage pekan4_2511533015;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseData_2511533015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q_3015 = new LinkedList <Integer>();
		q_3015.add (1);
		q_3015.add(2);
		q_3015.add(3); // [1, 2, 3]
		System.out.println ("sebelum reverse" + q_3015);
		Stack<Integer> s_3015 = new Stack <Integer> ();
		while (!q_3015.isEmpty ()) { // Q -> S
			s_3015.push(q_3015.remove());
		}
		while (!s_3015.isEmpty ()) { // S -> Q //
			q_3015.add (s_3015.pop());
		}
		System.out.println ("sesudah reverse= " + q_3015); // [3,2,1]

}
}
