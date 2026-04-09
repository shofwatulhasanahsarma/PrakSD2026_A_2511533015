package pekan3_2511533015;
import java.util.Scanner;
import java.util.Stack;
public class StackPostfix_2511533015 {
	public static int postfixEvaluate(String expression) {
		Stack <Integer> s_3015 = new Stack <Integer>();
		Scanner input_3015 = new Scanner (expression);
		while (input_3015.hasNext ()) {
			if (input_3015.hasNextInt ()) {// an operand (integer)
				s_3015.push (input_3015.nextInt ());
			}else {
				String operator_3015 = input_3015.next ();
				int operand2_3015 = s_3015.pop();
				int operand1_3015 = s_3015.pop();
				if (operator_3015.equals ("+")) {
					s_3015.push(operand1_3015 + operand2_3015);
				}else if (operator_3015.equals ("-")) {
					s_3015.push(operand1_3015 - operand2_3015);
				}else if (operator_3015.equals ("*")) {
					s_3015.push(operand1_3015 * operand2_3015);
				}else {
					s_3015.push(operand1_3015 / operand2_3015);
				}
			}
		}
		input_3015.close ();
		return s_3015.pop ();
	}
	public static void main (String[] args) {
		System.out.println ("hasil postfix= " + postfixEvaluate ("5 2 4 * + 7 - "));
		
	}
}
