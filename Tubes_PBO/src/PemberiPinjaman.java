// PemberiPinjaman.java
import java.util.Scanner;

public class PemberiPinjaman implements Transaksi {
    String nama;
    double batasMaksimalPinjaman;

    // Constructor
    public PemberiPinjaman(String nama, double batasMaksimalPinjaman) {
        this.nama = nama;
        this.batasMaksimalPinjaman = batasMaksimalPinjaman;
    }

    // Implementasi dari antarmuka Transaksi
    @Override
    public void displayInfo() {
        System.out.println("Informasi Pemberi Pinjaman:");
        System.out.println("Nama: " + nama);
        System.out.println("Batas Maksimal Pinjaman: " + batasMaksimalPinjaman);
    }

    // Method untuk mengisi data dari input
    public static PemberiPinjaman inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Pemberi Pinjaman: ");
        String nama = scanner.nextLine();
        System.out.print("Batas Maksimal Pinjaman: ");
        double batasMaksimalPinjaman = scanner.nextDouble();

        return new PemberiPinjaman(nama, batasMaksimalPinjaman);
    }
}
