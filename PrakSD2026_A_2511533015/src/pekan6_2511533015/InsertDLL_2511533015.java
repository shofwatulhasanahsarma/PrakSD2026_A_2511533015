package pekan6_2511533015;

public class InsertDLL_2511533015 {
	//menambahkan node di awal DLL
	static NodeDLL_2511533015 insertBegin (NodeDLL_2511533015 head_3015, int data_3015) {
		//buat node baru
		NodeDLL_2511533015 new_node_3015 = new NodeDLL_2511533015 (data_3015);
		//jadikan pointer nextnya head
		new_node_3015.next_3015 = head_3015;
		//jadikan pointer prev head ke new node
		if (head_3015 != null) {
			head_3015.prev_3015 = new_node_3015;
		}
		return new_node_3015;
	}
	//fungsi menambahkan node di akhir
	public static NodeDLL_2511533015 insertEnd (NodeDLL_2511533015 head_3015, int newData_3015) {
		//buat node baru
		NodeDLL_2511533015 newNode_3015 = new NodeDLL_2511533015 (newData_3015);
		//jika dll null jadikan head
		if (head_3015 == null) {
			head_3015 = newNode_3015;
		}
		else {
			NodeDLL_2511533015 curr_3015 = head_3015;
			while (curr_3015.next_3015 != null) {
				curr_3015 = curr_3015.next_3015;
			}
			curr_3015.next_3015= newNode_3015;
			newNode_3015.prev_3015 = curr_3015;
		}
		return head_3015;
	}
	//menambahkan node di posisi tertentu
	public static NodeDLL_2511533015 insertAtPosition (NodeDLL_2511533015 head_3015, int pos, int new_data_3015) {
		//buat node baru
		NodeDLL_2511533015 new_node_3015 = new NodeDLL_2511533015 (new_data_3015);
		if (pos == 1) {
			new_node_3015.next_3015 = head_3015;
			if (head_3015 != null) {
				head_3015.prev_3015 = new_node_3015;}
			head_3015 = new_node_3015;
					return head_3015;
			}
		NodeDLL_2511533015 curr_3015 = head_3015;
		for (int i = 1; i < pos - 1 && curr_3015 != null; ++i) {
			curr_3015 = curr_3015.next_3015;}
			if (curr_3015 == null){
				System.out.println ("Posisi tidak ada");
				return head_3015;
		}
			new_node_3015.prev_3015 = curr_3015;
			new_node_3015.next_3015 = curr_3015.next_3015;
			curr_3015.next_3015 = new_node_3015;
			if (new_node_3015.next_3015 != null) {
				new_node_3015.next_3015.prev_3015 = new_node_3015;
			}
			return head_3015;
		}
	public static void printList (NodeDLL_2511533015 head_3015) {
		NodeDLL_2511533015 curr_3015 = head_3015;
		while (curr_3015 != null) {
			System.out.print(curr_3015.data_3015 + " <->");
			curr_3015 = curr_3015.next_3015;
		}
		System.out.println();
	}
public static void main (String[] args) {
	//membuat dll 2 <-> 3 <-> 5
	NodeDLL_2511533015 head_3015 = new NodeDLL_2511533015(2);
	head_3015.next_3015 = new NodeDLL_2511533015 (3);
	head_3015.next_3015.prev_3015 = head_3015;
	head_3015.next_3015.next_3015 = new NodeDLL_2511533015(5);
	head_3015.next_3015.next_3015.prev_3015 = head_3015.next_3015;
	head_3015.next_3015.next_3015.prev_3015 = head_3015.next_3015;
	//cetak DLL awal
	System.out.print("DLL Awal: ");
	printList(head_3015);
	//tambah 1 di awal
	head_3015 = insertBegin (head_3015,1);
	System.out.print(
			"simpul 1 ditambah di awal: ");
	printList (head_3015);
	//tambah 6 di akhir
	System.out.print(
			"simpul 6 ditambah di akhir: ");
	int data_3015 = 6;
	head_3015 = insertEnd (head_3015, data_3015);
	printList (head_3015);
	//menambahkan node 4 di posisi 4
	System.out.print("tambah node 4 di posisi 4: ");
	int data2_3015 = 4;
	int pos_3015 = 4;
	head_3015= insertAtPosition (head_3015, pos_3015, data2_3015);
	printList(head_3015);
}
}