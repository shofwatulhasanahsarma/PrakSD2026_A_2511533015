package latihan_2511533015;

import java.util.*;

// Kelas Buku
class Buku {
    private String judul;
    private String pengarang;
    private String isbn;

    public Buku(String judul, String pengarang, String isbn) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
    }

    // Getter
    public String getJudul() { return judul; }
    public String getPengarang() { return pengarang; }
    public String getIsbn() { return isbn; }

    // Setter
    public void setJudul(String judul) { this.judul = judul; }
    public void setPengarang(String pengarang) { this.pengarang = pengarang; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String toString() {
        return judul + " | " + pengarang + " | " + isbn;
    }
}

// Kelas Perpustakaan
class Perpustakaan {
    LinkedList<Buku> peminjaman = new LinkedList<>();
    Queue<Buku> pengembalian = new LinkedList<>();
    Stack<Buku> stackPengembalian = new Stack<>();

    public void tambahBuku(Buku buku) {
        peminjaman.add(buku);
    }

    public void pinjamBuku() {
        if (!peminjaman.isEmpty()) {
            Buku buku = peminjaman.removeFirst();
            pengembalian.add(buku);
            System.out.println("Dipinjam: " + buku);
        } else {
            System.out.println("Tidak ada buku tersedia");
        }
    }

    public void kembalikanBuku() {
        if (!pengembalian.isEmpty()) {
            Buku buku = pengembalian.poll();
            stackPengembalian.push(buku);
            System.out.println("Dikembalikan: " + buku);
        } else {
            System.out.println("Tidak ada buku yang dipinjam");
        }
    }

    public void tampilkanBuku() {
        System.out.println("Daftar Buku:");
        for (Buku b : peminjaman) {
            System.out.println(b);
        }
    }
}
