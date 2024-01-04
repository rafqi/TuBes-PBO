// Pengguna.java
import java.util.Scanner;

public class Pengguna implements Transaksi {
    String nama;
    String alamat;
    String nomorTelepon;

    // Constructor
    public Pengguna(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    // Implementasi dari antarmuka Transaksi
    @Override
    public void displayInfo() {
        System.out.println("Informasi Pengguna:");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + nomorTelepon);
    }

    // Method untuk mengisi data dari input
    public static Pengguna inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Pengguna: ");
        String nama = scanner.nextLine();
        System.out.print("Alamat Pengguna: ");
        String alamat = scanner.nextLine();
        System.out.print("Nomor Telepon Pengguna: ");
        String nomorTelepon = scanner.nextLine();

        return new Pengguna(nama, alamat, nomorTelepon);
    }
}
