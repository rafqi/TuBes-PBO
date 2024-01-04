// Peminjaman.java
import java.util.Scanner;

public class Peminjaman implements Transaksi {
    int idPeminjaman;
    double jumlahUang;
    String tanggalPeminjaman;
    String tanggalPengembalian;
    String status;

    // Constructor
    public Peminjaman(int idPeminjaman, double jumlahUang, String tanggalPeminjaman, String tanggalPengembalian, String status) {
        this.idPeminjaman = idPeminjaman;
        this.jumlahUang = jumlahUang;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
        this.status = status;
    }

    // Implementasi dari antarmuka Transaksi
    @Override
    public void displayInfo() {
        System.out.println("Informasi Peminjaman:");
        System.out.println("ID Peminjaman: " + idPeminjaman);
        System.out.println("Jumlah Uang: " + jumlahUang);
        System.out.println("Tanggal Peminjaman: " + tanggalPeminjaman);
        System.out.println("Tanggal Pengembalian: " + tanggalPengembalian);
        System.out.println("Status: " + status);
    }

    // Method untuk mengisi data dari input
    public static Peminjaman inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID Peminjaman: ");
        int idPeminjaman = scanner.nextInt();
        System.out.print("Jumlah Uang: ");
        double jumlahUang = scanner.nextDouble();
        System.out.print("Tanggal Peminjaman: ");
        scanner.nextLine();  // Menangkap newline setelah nextDouble
        String tanggalPeminjaman = scanner.nextLine();
        System.out.print("Tanggal Pengembalian: ");
        String tanggalPengembalian = scanner.nextLine();
        System.out.print("Status: ");
        String status = scanner.nextLine();

        return new Peminjaman(idPeminjaman, jumlahUang, tanggalPeminjaman, tanggalPengembalian, status);
    }
}
