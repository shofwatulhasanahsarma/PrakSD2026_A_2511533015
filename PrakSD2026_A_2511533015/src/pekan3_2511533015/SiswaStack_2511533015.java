package pekan3_2511533015;
import java.util.ArrayList;
class Siswa_3015 {
	String nama_3015;
	int nim_3015;
	
	public Siswa_3015 (String nama_3015, int nim_3015) {
		this.nama_3015 = nama_3015;
		this.nim_3015 = nim_3015;
	}
	
	@Override
	public String toString () {
		return "Nim: " + nim_3015 + ", Nama: " + nama_3015;
	}

}
public class SiswaStack_2511533015 {
	private ArrayList <Siswa_3015> stack_3015;
	
	public SiswaStack_2511533015 () {
		stack_3015 = new ArrayList <>();
	}
	public void push_3015 (Siswa_3015 mhs) {
		stack_3015.add (mhs);
	}
	public Siswa_3015 pop() {
		if (!isEmpty_3015()) {
			return stack_3015.remove (stack_3015.size() - 1);
		}
		return null;
	}
	
	public Siswa_3015 peek() {
		if (!isEmpty_3015 ()) {
			return stack_3015.get (stack_3015.size() - 1) ;
		}
		return null;
		}
	
	public boolean isEmpty_3015() {
		return stack_3015.isEmpty();
	}
		
	public void tampilkanSiswa () {
		for (int i = stack_3015.size () - 1; i >= 0; i--) {
			System.out.println (stack_3015.get(i));
		}
	}
	public static void main (String[] args) {
		SiswaStack_2511533015 studentStack = new SiswaStack_2511533015 ();
		
		Siswa_3015 mhs1 = new Siswa_3015 ("Ali", 1);
		Siswa_3015 mhs2 = new Siswa_3015 ("Boby", 2);
		Siswa_3015 mhs3 = new Siswa_3015 ("Charles", 3);
		
		studentStack.push_3015(mhs1);
		studentStack.push_3015(mhs2);
		studentStack.push_3015(mhs3);
		
		System.out.println ("Siswa di dalam stack:");
		studentStack.tampilkanSiswa();
		
		System.out.println ("siswa teratas " + studentStack.peek ());
		System.out.println ("mengeluarkan siswa teratas dari stack: " + studentStack.pop());
		System.out.println ("daftar siswa setelah di pop :");
		studentStack.tampilkanSiswa ();
	}
}