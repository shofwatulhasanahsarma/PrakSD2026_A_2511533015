package pekan3_2511533015;

public class stackArray_2511533015 {
	static final int MAX_3015 = 1000;
	int top_3015;
	int a [] = new int [MAX_3015];
	boolean isEmpty_3015 ()
	{
		return (top_3015 < 0);
	}
	stackArray_2511533015 ()
	{
		top_3015 = -1;
	}
	boolean push_3015 (int x)
	{
		if (top_3015 >= (MAX_3015 - 1)) {
			System.out.println ("Stack Overflow");
			return false;
			}else {
				a [++top_3015] = x;
				System.out.println (x + " dimasukkan dalam stack");
				return true;
			}
	}
	int pop_3015 ()
	{
		if (top_3015 < 0 ) {
			System.out.println ("Stack Underflow");
			return 0;
			}else {
				int x= a [top_3015--];
				return x;
			}
		}
	int peek_3015()
	{
		if (top_3015 < 0) {
			System.out.println ("Stack Underflow");
			return 0;
		}
		else {
			int x = a [top_3015];
			return x;
		}
	}
	void print () {
		for (int i = top_3015; i>-1; i--) {
			System.out.print(" " + a [i]);
		}
	}
}
