// RiwayatPeminjaman.java
import java.util.Scanner;

public class RiwayatPeminjaman implements Transaksi {
    int idRiwayat;
    int idPeminjaman;
    double jumlahUang;
    String namaPeminjam;
    String alamatPeminjam;
    String nomorTeleponPeminjam;

    // Constructor
    public RiwayatPeminjaman(int idRiwayat, int idPeminjaman, double jumlahUang, String namaPeminjam, String alamatPeminjam, String nomorTeleponPeminjam) {
        this.idRiwayat = idRiwayat;
        this.idPeminjaman = idPeminjaman;
        this.jumlahUang = jumlahUang;
        this.namaPeminjam = namaPeminjam;
        this.alamatPeminjam = alamatPeminjam;
        this.nomorTeleponPeminjam = nomorTeleponPeminjam;
    }

    // Implementasi dari antarmuka Transaksi
    @Override
    public void displayInfo() {
        System.out.println("ID Riwayat: " + idRiwayat);
        System.out.println("ID Peminjaman: " + idPeminjaman);
        System.out.println("Jumlah Uang: " + jumlahUang);
        System.out.println("Nama Peminjam: " + namaPeminjam);
        System.out.println("Alamat Peminjam: " + alamatPeminjam);
        System.out.println("Nomor Telepon Peminjam: " + nomorTeleponPeminjam);
    }

    // Method untuk mengisi data dari input
    public static RiwayatPeminjaman inputData(int idPeminjaman, double jumlahUang, String namaPeminjam, String alamatPeminjam, String nomorTeleponPeminjam) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID Riwayat: ");
        int idRiwayat = scanner.nextInt();

        return new RiwayatPeminjaman(idRiwayat, idPeminjaman, jumlahUang, namaPeminjam, alamatPeminjam, nomorTeleponPeminjam);
    }
}
