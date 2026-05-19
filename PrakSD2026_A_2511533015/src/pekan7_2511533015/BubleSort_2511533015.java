package pekan7_2511533015;

public class BubleSort_2511533015 {
	public static void bubbleSort_3015 (int[] arr_3015) {
		int n_3015 = arr_3015. length;
		for (int i_3015 = 0; i_3015 < n_3015; i_3015++) {
			for (int j_3015 = 0; j_3015 < n_3015 - i_3015 - 1; j_3015++) {
				if (arr_3015[j_3015] > arr_3015 [j_3015 + 1]) {
					int temp_3015 = arr_3015[j_3015];
					arr_3015 [j_3015] = arr_3015 [j_3015 + 1];
					arr_3015 [j_3015 + 1] = temp_3015;
					// System.out.println ("data:"+arr[j] + "+arr [j+1]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_3015 [] = { 23, 78, 45, 8, 32, 56, 1};
		int n_3015 = arr_3015.length;
		System.out.print ("array yang belum terurut:");
		for (int i_3015 = 0; i_3015 < n_3015; i_3015++)
			System.out.print (arr_3015 [i_3015] + " ");
		System.out.println (" ");
		bubbleSort_3015 (arr_3015);
		System.out.println ("array yang terurut menggunakan BubleSort");
		for (int i_3015 = 0; i_3015 < n_3015; i_3015++)
			System.out.print (arr_3015[i_3015] + " ");
			System.out.println ("");
	}

}
