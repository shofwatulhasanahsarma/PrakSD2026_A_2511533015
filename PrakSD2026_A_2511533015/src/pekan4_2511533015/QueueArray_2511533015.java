package pekan4_2511533015;

public class QueueArray_2511533015{
	int front_3015, rear_3015, size_3015;
	int capacity_3015;
	int array_3015[];
	
	public QueueArray_2511533015 (int capacity) {
		this.capacity_3015 = capacity;
		front_3015 = this.size_3015 = 0;
		rear_3015 = capacity -1;
		array_3015 = new int [this.capacity_3015];
	}
	boolean inFull_3015 (QueueArray_2511533015 queue) {
		return (queue.size_3015 == queue.capacity_3015);
	}
	boolean isEmpty_3015 (QueueArray_2511533015 queue) {
		return (queue.size_3015 == 0);
	}
	void enqueue_3015 (int item) {
		if (inFull_3015 (this))
			return;
		this.rear_3015 = (this.rear_3015 + 1) % this.capacity_3015;
		this.array_3015 [this.rear_3015] = item;
		this.size_3015 = this.size_3015 +1;
		System.out.println (item +" enqueued to queue");
	}
	int dequeue_3015 () {
		if (isEmpty_3015 (this))
			return Integer.MIN_VALUE;
		int item = this.array_3015 [this.front_3015];
		this.front_3015 = (this.front_3015 + 1)% this.capacity_3015;
		this.size_3015 = this.size_3015 - 1;
		return item;
	}
	int front_3015 () {
		if (isEmpty_3015 (this))
			return Integer .MIN_VALUE;
		return this.array_3015 [this.front_3015];
	}
	int rear_3015 () {
		if (isEmpty_3015 (this))
			return Integer.MIN_VALUE;
		return this.array_3015 [this.rear_3015];
	}
	//mencetak elemen antrian
	void display_3015 () {
		int i;
		if (front_3015 == rear_3015) {
			System.out.printf ("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i = front_3015; i < rear_3015; i++) {
			System.out.printf (" %d <--", array_3015 [i]);
		}
		return;
	}
}