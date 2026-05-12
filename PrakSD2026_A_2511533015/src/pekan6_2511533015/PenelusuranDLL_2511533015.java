package pekan6_2511533015;

public class PenelusuranDLL_2511533015 {
	//fungsi penelusuran maju
	static void forwardTraversal (NodeDLL_2511533015 head_3015) {
		//memulai penelusuran dari head
		NodeDLL_2511533015 curr_3015 = head_3015;
		//lanjutkan sampai akhir
		while (curr_3015 != null) {
			//print data
			System.out.print (curr_3015.data_3015 + " <-> ");
			//pindah ke node berikutnya
			curr_3015 = curr_3015.next_3015;
		}
		//print spasi
		System.out.println ();
	}
		//fungsi penelusuran mundur
		static void backwardTraversal (NodeDLL_2511533015 tail) {
			//mulai dari akhir
			NodeDLL_2511533015 curr_3015 = tail;
			//lanjut sampai head
			while (curr_3015 != null) {
				//cetak data
				System.out.print (curr_3015.data_3015 + " <-> ");
				//pindah ke node sebelumnya
				curr_3015 = curr_3015.prev_3015;
			}
			//cetak spasi
			System.out.println ();
		}
		public static void main (String [] args) {
					//cetak DLL
					NodeDLL_2511533015 head_3015 = new NodeDLL_2511533015 (1);
					NodeDLL_2511533015 second_3015 = new NodeDLL_2511533015 (2);
					NodeDLL_2511533015 third_3015 = new NodeDLL_2511533015 (3);
					
					head_3015.next_3015 = second_3015;
					second_3015.prev_3015 = head_3015;
					second_3015.next_3015 = third_3015;
					third_3015.prev_3015 = second_3015;
					
					System.out.println ("Penelusuran maju: ");
					forwardTraversal (head_3015);
					
					System.out.println ("Penelusuran mundur: ");
					backwardTraversal (third_3015);
				}

}
