package pekan5_2511533015;

public class PencarianSLL_2511533015 {
	static boolean searchKey (NodeSLL_2511533015 head, int key) {
		NodeSLL_2511533015 curr = head;
		while (curr != null ) {
			if (curr.data_3015 == key)
				return true;
			curr = curr.next_3015;}
		return false;}
	public static void traversal (NodeSLL_2511533015 head) {
		//mulai dari head
		NodeSLL_2511533015 curr = head;
		//telusuri sampai pointer null
		while (curr != null) {
			System.out.print (" " + curr.data_3015);
			curr= curr.next_3015;}
		System.out.println ();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeSLL_2511533015 head = new NodeSLL_2511533015 (14);
		head.next_3015 = new NodeSLL_2511533015 (21);
		head.next_3015.next_3015 = new NodeSLL_2511533015 (13);
		head.next_3015.next_3015.next_3015 = new NodeSLL_2511533015 (30);
		head.next_3015.next_3015.next_3015.next_3015 = new NodeSLL_2511533015 (10);
		System.out.print("Penelusuran SLL: ");
		traversal (head);
		// data yang akan dicari
		int key = 30;
		System.out.print ("cari data " +key + " - ");
		if (searchKey (head, key))
			System.out.println ("ketemu");
		else
			System.out.println("tidak ada");
	}
}
