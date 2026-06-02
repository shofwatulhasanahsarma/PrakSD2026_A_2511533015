package pekan8_2511533015;

public class MergeSort_2511533015 {

	void merge_3015(int arr_3015[], int l_3015, int m_3015, int r_3015) {

		// Find sizes of two subarrays to be merged
		int n1_3015 = m_3015 - l_3015 + 1;
		int n2_3015 = r_3015 - m_3015;

		/* Create temp arrays */
		int L_3015[] = new int[n1_3015];
		int R_3015[] = new int[n2_3015];

		/* Copy data to temp arrays */
		for (int i_3015 = 0; i_3015 < n1_3015; ++i_3015)
			L_3015[i_3015] = arr_3015[l_3015 + i_3015];

		for (int j_3015 = 0; j_3015 < n2_3015; ++j_3015)
			R_3015[j_3015] = arr_3015[m_3015 + 1 + j_3015];

		int i_3015 = 0, j_3015 = 0;

		// Initial index of merged subarray array
		int k_3015 = l_3015;

		while (i_3015 < n1_3015 && j_3015 < n2_3015) {

			if (L_3015[i_3015] <= R_3015[j_3015]) {
				arr_3015[k_3015] = L_3015[i_3015];
				i_3015++;
			} else {
				arr_3015[k_3015] = R_3015[j_3015];
				j_3015++;
			}

			k_3015++;
		}

		/* Copy remaining elements of L[] if any */
		while (i_3015 < n1_3015) {
			arr_3015[k_3015] = L_3015[i_3015];
			i_3015++;
			k_3015++;
		}

		/* Copy remaining elements of R[] if any */
		while (j_3015 < n2_3015) {
			arr_3015[k_3015] = R_3015[j_3015];
			j_3015++;
			k_3015++;
		}
	}

	void sort_3015(int arr_3015[], int l_3015, int r_3015) {

		if (l_3015 < r_3015) {

			// Find the middle point
			int m_3015 = (l_3015 + r_3015) / 2;

			// Sort first and second halves
			sort_3015(arr_3015, l_3015, m_3015);
			sort_3015(arr_3015, m_3015 + 1, r_3015);

			// Merge the sorted halves
			merge_3015(arr_3015, l_3015, m_3015, r_3015);
		}
	}

	/* A utility function to print array */
	static void printArray_3015(int arr_3015[]) {

		int n_3015 = arr_3015.length;

		for (int i_3015 = 0; i_3015 < n_3015; ++i_3015)
			System.out.print(arr_3015[i_3015] + " ");

		System.out.println();
	}

	public static void main(String args_3015[]) {

		int arr_3015[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Sebelum Terurut");
		printArray_3015(arr_3015);

		MergeSort_2511533015 ob_3015 = new MergeSort_2511533015();
		ob_3015.sort_3015(arr_3015, 0, arr_3015.length - 1);

		System.out.println("\nSesudah Terurut menggunakan Merge Sort");
		printArray_3015(arr_3015);
	}
}