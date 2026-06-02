package pekan8_2511533015;

public class ShellSort_2511533015 {

	public static void ShellSort_2511533015(int[] A_3015) {
		int n_3015 = A_3015.length;
		int gap_3015 = n_3015 / 2;

		while (gap_3015 > 0) {
			for (int i_3015 = gap_3015; i_3015 < n_3015; i_3015++) {
				int temp_3015 = A_3015[i_3015];
				int j_3015 = i_3015;

				while (j_3015 >= gap_3015 && A_3015[j_3015 - gap_3015] > temp_3015) {
					A_3015[j_3015] = A_3015[j_3015 - gap_3015];
					j_3015 = j_3015 - gap_3015;
				}

				A_3015[j_3015] = temp_3015;
			}
			gap_3015 = gap_3015 / 2;
		}
	}

	public static void main(String[] args_3015) {

		int[] data_3015 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};

		System.out.print("Sebelum: ");
		printArray_3015(data_3015);

		ShellSort_2511533015(data_3015);

		System.out.print("Sesudah (Shell Sort): ");
		printArray_3015(data_3015);
	}

	public static void printArray_3015(int[] arr_3015) {
		for (int i_3015 : arr_3015) {
			System.out.print(i_3015 + " ");
		}
		System.out.println();
	}
}