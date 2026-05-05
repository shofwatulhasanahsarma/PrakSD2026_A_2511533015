package pekan5_2511533015;

public class HapusSLL_2511533015 {
	//fungsi untuk menghapus head
	public static NodeSLL_2511533015 deleteHead (NodeSLL_2511533015 head_3015) {
		//jika SLL kosong
		if (head_3015 == null)
			return null;
		//pindahkan head ke node berikutnya
		head_3015 = head_3015.next_3015;
		//return head baru
		return head_3015;
	}
	//fungsi menghapus node terakhir SLL
	public static NodeSLL_2511533015 removeLastNode (NodeSLL_2511533015 head_3015) {
		//jika list kosong, return null
		if (head_3015 == null) {
			return null;
		}
		//jika list satu node, hapus node dan return null
		if (head_3015.next_3015 == null) {
			return null;
		}
		//temukan node terakhir ke dua
		NodeSLL_2511533015 secondLast_3015 = head_3015;
		while (secondLast_3015.next_3015.next_3015 != null) {
			secondLast_3015 = secondLast_3015.next_3015;
		}
		//hapus node terakhir
		secondLast_3015.next_3015 = null;
		return head_3015;
	}
	//fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511533015 deleteNode (NodeSLL_2511533015 head_3015, int position_3015) {
		NodeSLL_2511533015 temp = head_3015;
		NodeSLL_2511533015 prev = null;
		//jika linked list null
		if (temp == null)
			return head_3015;
		//kasus 1: head dihapus
		if (position_3015 == 1) {
			head_3015 = temp.next_3015;
			return head_3015;}
		//kasus 2: menghapus node di tengah
		//telusuri ke node yang dihapus
			for (int i = 1; temp != null && i < position_3015; i++) {
				prev = temp;
				temp = temp.next_3015;}
			//jika ditemukan, hapus node
			if (temp != null) {
				prev.next_3015 = temp.next_3015;
			} else {
				System.out.println ("Data tidak ada");}
				return head_3015;
			}
			//fungsi mencetak SLL
			public static void printList (NodeSLL_2511533015 head_3015) {
				NodeSLL_2511533015 curr = head_3015;
				while (curr.next_3015 != null) {
					System.out.print (curr.data_3015 + "-->");
					curr = curr.next_3015;}
					if (curr.next_3015==null) {
						System.out.print(curr.data_3015);
					}
					System.out.println ();}
				//kelas main

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		NodeSLL_2511533015 head = new NodeSLL_2511533015 (1);
		head.next_3015 = new NodeSLL_2511533015 (2);
		head.next_3015.next_3015 = new NodeSLL_2511533015 (3);
		head.next_3015.next_3015.next_3015 = new NodeSLL_2511533015 (4);
		head.next_3015.next_3015.next_3015.next_3015 = new NodeSLL_2511533015 (5);
		head.next_3015.next_3015.next_3015.next_3015.next_3015 = new NodeSLL_2511533015 (6);
		//cetak list awal
		System.out.println ("list awal: ");
		printList (head);
		//hapus head
		head = deleteHead (head);
		System.out.println ("List setelah head dihapus: ");
		printList (head);
		//hapus node terakhir
		head = removeLastNode (head);
		System.out.println ("List setelah simpul terakhir di hapus: ");
		printList (head);
		//deleting node at position 2
		int position = 2;
		head = deleteNode (head, position);
		//print list after deletion
		System.out.println ("List setelah posisi 2 dihapus: ");
		printList (head);

	}
}
