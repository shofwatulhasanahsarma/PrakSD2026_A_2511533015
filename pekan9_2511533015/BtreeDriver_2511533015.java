package pekan9_2511533015;

public class BtreeDriver_2511533015 {
	public static void main (String [] args) {
		//Membuat Pohon
		BTree_2511533015 tree = new BTree_2511533015 ();
		System.out.print ("Jumlah Simpul awal pohon: ");
		System.out.println (tree.countNodes());
		//Menambahkan simpul data 1
		Node_2511533015 root = new Node_2511533015 (1);
		//Menjadikan simpul 1 sebagai root 
		tree.setRoot (root);
		System.out.println ("Jumlah simpul jika hanya ada root");
		System.out.println (tree.countNodes ());
		Node_2511533015 node2 = new Node_2511533015 (2);
		Node_2511533015 node3 = new Node_2511533015 (3);
		Node_2511533015 node4 = new Node_2511533015 (4);
		Node_2511533015 node5 = new Node_2511533015 (5);
		Node_2511533015 node6 = new Node_2511533015 (6);
		Node_2511533015 node7 = new Node_2511533015 (7);
		Node_2511533015 node8 = new Node_2511533015 (8);
		Node_2511533015 node9 = new Node_2511533015(9);
		root.setLeft (node2);
		node2.setLeft (node4);
		node2.setRight (node5);
		node2.setRight (node8);
		root.setRight (node3);
		node3.setLeft (node6);
		node3.setRight (node7);
		node6.setLeft (node9);
		
		//set root
		tree.setCurrent (tree.getRoot());
		System.out.println ("menampilkan simpul terakhir: ");
		System.out.println (tree.getCurrent ().getData());
		System.out.println ("jumlah simpul: setelah simpul 7 ditambahkan" );
		System.out.println (tree.countNodes());
		System.out.println ("InOrder: ");
		tree.printInorder ();
		System.out.println ("\nPreorder: ");
		tree.printPreOrder ();
		System.out.println ("\nPostorder: ");
		tree.printPostOrder ();
		System.out.println ("\nmenampilkan simpul dalam bentuk pohon");
		tree.print ();
	}
}
