package pekan5_2511533015;
public class TambahSLL_2511533015 {
	public static NodeSLL_2511533015 insertAtFront_3015 (NodeSLL_2511533015 head_3015,int value_3015) {
		NodeSLL_2511533015 new_node_3015 = new NodeSLL_2511533015 (value_3015);
		new_node_3015.next_3015 = head_3015;
		return new_node_3015;
	}
	//fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511533015 insertAtEnd_3015 (NodeSLL_2511533015 head_3015, int value_3015) {
		//buat sebuah node dengan sebuah nilai
		NodeSLL_2511533015 newNode_3015 = new NodeSLL_2511533015 (value_3015);
		//jika list kosong maka node jadi head
		if (head_3015 == null) {
			return newNode_3015;
		}
		//simpan head ke variabel sementara
		NodeSLL_2511533015 last_3015 = head_3015;
		//telusuri ke node akhir
		while (last_3015.next_3015 != null) {
			last_3015 = last_3015.next_3015;
		}
		//ubah pointer
		last_3015.next_3015 = newNode_3015;
		return head_3015;
	}
	static NodeSLL_2511533015 GetNode(int data_3015) {
		return new NodeSLL_2511533015 (data_3015);
	}
	static NodeSLL_2511533015 insertPos (NodeSLL_2511533015 headNode_3015, int position_3015, int value_3015) {
		NodeSLL_2511533015 head_3015 = headNode_3015;
		if (position_3015 < 1)
			System.out.print ("Invalid position");
		if (position_3015 == 1) {
			NodeSLL_2511533015 new_node_3015 = new NodeSLL_2511533015 (value_3015);
			new_node_3015.next_3015 = head_3015;
			return new_node_3015;
		} else {
			while (position_3015-- != 0) {
				if (position_3015 == 1) {
					NodeSLL_2511533015 newNode_3015 = GetNode (value_3015);
					newNode_3015.next_3015 = headNode_3015.next_3015;
					headNode_3015.next_3015 = newNode_3015;
					break;
				}
				headNode_3015 = headNode_3015.next_3015;
			}
			if (position_3015 !=1)
				System.out.print("Posisi di luat jangkauan");
		}
			return head_3015;
		}
		
			public static void printList (NodeSLL_2511533015 head_3015) {
				NodeSLL_2511533015 curr = head_3015;
				while (curr.next_3015 != null) {
					System.out.print (curr.data_3015+"-->");
					curr = curr.next_3015;}
				if (curr.next_3015==null) {
					System.out.print(curr.data_3015);}
					System.out.println();}
				public static void main (String [] args) {
					//buat linked list 2->3->4->5->6
					NodeSLL_2511533015 head = new NodeSLL_2511533015 (2);
					head.next_3015 = new NodeSLL_2511533015 (3);
					head.next_3015.next_3015 = new NodeSLL_2511533015 (5);
					head.next_3015.next_3015.next_3015 = new NodeSLL_2511533015 (6);
					//cetak list asli
					System.out.print("Senarai berantai awal: ");
					printList (head);
					//tambahkan node baru didepan
					System.out.print("tambah 1 simpul di depan: ");
					int data_3015 = 1;
					head= insertAtFront_3015 (head, data_3015);
					//cetak update list
					printList (head);
					//tambahkan node baru di belakang
					System.out.print ("tambah 1 simpul di belakang: ");
					int data2 = 7;
					head = insertAtEnd_3015 (head, data2);
					//cetak update list
					printList (head);
					System.out.print("tambah 1 simpul ke data 4:");
					int data3 = 4;
					int pos=4;
					head = insertPos (head,pos,data3);
					//cetak ipdate list
					printList (head);
				}
			}
