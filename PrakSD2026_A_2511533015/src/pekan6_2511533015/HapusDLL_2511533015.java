package pekan6_2511533015;

public class HapusDLL_2511533015 {
	//fungsi menghapus node awal
	public static NodeDLL_2511533015 delHead_3015 (NodeDLL_2511533015 head_3015) {
		if (head_3015==null) {
			return null;}
			NodeDLL_2511533015 temp = head_3015;
			head_3015 = head_3015.next_3015;
			if (head_3015 != null) {
				head_3015.prev_3015 = null; }
			return head_3015;
		}
	//fungsi menghapus di akhir
	public static NodeDLL_2511533015 delLast_3015 (NodeDLL_2511533015 head_3015) {
		if (head_3015 == null) {
			return null;
		}
		if (head_3015.next_3015 == null) {
			return null;
		}
		NodeDLL_2511533015 curr_3015 = head_3015;
		while (curr_3015.next_3015 != null) {
			curr_3015 = curr_3015.next_3015;
		}
		//update pointer previous node
		if (curr_3015.prev_3015 != null) {
			curr_3015.prev_3015.next_3015 = null; }
		return head_3015;
		}
		//fungsi menghapus node posisi tertentu
	public static NodeDLL_2511533015 delPos_3015 (NodeDLL_2511533015 head_3015, int pos) {
		//jika DLL kosong
		if (head_3015 == null) {
			return head_3015;}
		NodeDLL_2511533015 curr_3015 = head_3015;
		//telusuri sampai ke node yang akan dihapus
		for (int i = 1; curr_3015 != null && i<pos ; ++i) {
			curr_3015 = curr_3015.next_3015;
		}
		//jika posisi tidak ditemukan
		if (curr_3015 == null) {
			return head_3015;
		}
		//update pointer
		if (curr_3015.prev_3015 != null) {
			curr_3015.prev_3015.next_3015 = curr_3015.next_3015;}
		if (curr_3015.next_3015 != null) {
			curr_3015.next_3015.prev_3015 = curr_3015.prev_3015;}
		//jika yang dihapus head
		if (head_3015 == curr_3015) {
			head_3015 = curr_3015.next_3015;
		}
		return head_3015;
	}
	//fungsi mencetak DLL
	public static void printList_3015 (NodeDLL_2511533015 head_3015) {
		NodeDLL_2511533015 curr_3015 = head_3015;
		while (curr_3015 != null) {
			System.out.print(curr_3015.data_3015 + "<-> ");
			curr_3015 = curr_3015.next_3015;
		}
		System.out.println();
	}
	public static void main (String [] args) {
		//buat sebuah DLL
		NodeDLL_2511533015 head_3015 = new NodeDLL_2511533015 (1);
		head_3015.next_3015 = new NodeDLL_2511533015 (2);
		head_3015.next_3015.prev_3015 = head_3015;
		head_3015.next_3015.next_3015 = new NodeDLL_2511533015 (3);
		head_3015.next_3015.next_3015.prev_3015 = head_3015.next_3015;
		head_3015.next_3015.next_3015.next_3015 = new NodeDLL_2511533015 (4);
		head_3015.next_3015.next_3015.next_3015.prev_3015 = head_3015.next_3015.next_3015;
		head_3015.next_3015.next_3015.next_3015.next_3015 = new NodeDLL_2511533015 (5);
		head_3015.next_3015.next_3015.next_3015.next_3015.prev_3015 = head_3015.next_3015.next_3015.next_3015;
		
		System.out.print("DLL Awal: ");
		printList_3015 (head_3015);
		
		System.out.print ("Setelah head dihapus: ");
		head_3015 = delHead_3015 (head_3015);
		printList_3015 (head_3015);
		
		System.out.print ("Setelah node terakhir dihapus: ");
		head_3015 = delLast_3015 (head_3015);
		printList_3015 (head_3015);
		
		System.out.print ("menghapus node ke 2: ");
		head_3015 = delPos_3015 (head_3015, 2);
		printList_3015 (head_3015);
	}
}