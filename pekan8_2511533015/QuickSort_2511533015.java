package pekan8_2511533015;

public class QuickSort_2511533015 {

	static void swap_3015(int[] arr_3015, int i_3015, int j_3015) {
		int temp_3015 = arr_3015[i_3015];
		arr_3015[i_3015] = arr_3015[j_3015];
		arr_3015[j_3015] = temp_3015;
	}

	// Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	static void medianOfThree_3015(int[] arr_3015, int low_3015, int high_3015) {

		int mid_3015 = low_3015 + (high_3015 - low_3015) / 2;

		// Urutkan elemen low, mid, dan high
		if (arr_3015[low_3015] > arr_3015[mid_3015]) {
			swap_3015(arr_3015, low_3015, mid_3015);
		}

		if (arr_3015[low_3015] > arr_3015[high_3015]) {
			swap_3015(arr_3015, low_3015, high_3015);
		}

		if (arr_3015[mid_3015] > arr_3015[high_3015]) {
			swap_3015(arr_3015, mid_3015, high_3015);
		}

		// Pindahkan median ke posisi high sebagai pivot
		swap_3015(arr_3015, mid_3015, high_3015);
	}

	static int partition_3015(int[] arr_3015, int low_3015, int high_3015) {

		// Panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_3015(arr_3015, low_3015, high_3015);

		int pivot_3015 = arr_3015[high_3015];
		int i_3015 = low_3015 - 1;

		for (int j_3015 = low_3015; j_3015 <= high_3015 - 1; j_3015++) {

			// Jika elemen saat ini lebih kecil dari pivot
			if (arr_3015[j_3015] < pivot_3015) {
				i_3015++;
				swap_3015(arr_3015, i_3015, j_3015);
			}
		}

		swap_3015(arr_3015, i_3015 + 1, high_3015);
		return i_3015 + 1;
	}

	static void quickSort_3015(int[] arr_3015, int low_3015, int high_3015) {

		if (low_3015 < high_3015) {

			int pi_3015 = partition_3015(arr_3015, low_3015, high_3015);

			quickSort_3015(arr_3015, low_3015, pi_3015 - 1);
			quickSort_3015(arr_3015, pi_3015 + 1, high_3015);
		}
	}

	public static void printArr_3015(int[] arr_3015) {

		for (int i_3015 = 0; i_3015 < arr_3015.length; i_3015++) {
			System.out.print(arr_3015[i_3015] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args_3015) {

		int[] arr_3015 = { 10, 7, 8, 9, 1, 5 };
		int N_3015 = arr_3015.length;

		System.out.print("Data sebelum diurutkan: ");
		printArr_3015(arr_3015);

		quickSort_3015(arr_3015, 0, N_3015 - 1);

		System.out.print("Data Terurut quicksort: ");
		printArr_3015(arr_3015);
	}
}