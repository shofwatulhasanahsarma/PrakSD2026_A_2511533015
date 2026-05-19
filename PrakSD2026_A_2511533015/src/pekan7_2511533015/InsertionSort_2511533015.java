package pekan7_2511533015;

public class InsertionSort_2511533015 {
	public static void insertionSort_3015 (int[] arr_3015) {
		int n_3015 = arr_3015.length;
		for (int i_3015 = 1; i_3015 < n_3015; i_3015++) {
			int key_3015 = arr_3015 [i_3015];
			int j_3015 = i_3015 - 1;
			while (j_3015 >= 0 && arr_3015 [j_3015] > key_3015) {
				arr_3015 [j_3015 + 1] = arr_3015 [j_3015];
				j_3015--;
			}
			arr_3015 [j_3015 + 1] = key_3015;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_3015 [] = {23, 78, 45, 8, 32, 56, 1};
		int n_3015 = arr_3015.length;
		System.out.printf ("array yang belum terurut: \n");
		for (int i_3015 = 0; i_3015 < n_3015; i_3015++)
			System.out.print(arr_3015 [i_3015] + " ");
		System.out.println ("");
		insertionSort_3015 (arr_3015);
		System.out.printf ("array yang terurut :\n");
		for (int i_3015 = 0; i_3015 < n_3015; i_3015++)
			System.out.print (arr_3015[i_3015] + " ");
		System.out.println ("");

	}

}
