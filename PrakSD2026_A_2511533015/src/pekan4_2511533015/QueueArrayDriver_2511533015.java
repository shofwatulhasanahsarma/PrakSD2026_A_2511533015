package pekan4_2511533015;

public class QueueArrayDriver_2511533015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray_2511533015 queue_3015 = new QueueArray_2511533015 (1000);
		queue_3015.enqueue_3015 (10);
		queue_3015.enqueue_3015 (20);
		queue_3015.enqueue_3015 (30);
		queue_3015.enqueue_3015 (40);
		System.out.println ("Item di depan "+ queue_3015.front_3015());
		System.out.println ("Item paling belakang "+ queue_3015.rear_3015());
		System.out.println ("tampilan queue");
		queue_3015.display_3015();
		System.out.println();
		System.out.println (queue_3015.dequeue_3015 () + "dihapus dari queue");
		System.out.println ("Item di depan:" + queue_3015.front_3015());
		System.out.println ("Item di belakang:" + queue_3015.rear_3015());
		System.out.println ("Tampilan queue setelah satu fdata dihapus");
		queue_3015.display_3015();

	}
}
