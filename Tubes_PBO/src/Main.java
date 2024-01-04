import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Pengguna pengguna = null;
    private static PemberiPinjaman pemberiPinjaman = null;
    private static ArrayList<Peminjaman> riwayatPeminjamanList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Pengguna");
            System.out.println("2. Pemberi Pinjaman");
            System.out.println("3. Lakukan Pinjaman");
            System.out.println("4. Riwayat Pinjaman");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Input Pengguna
                    System.out.println("\nMasukkan Informasi Pengguna:");
                    pengguna = Pengguna.inputData();
                    break;
                case 2:
                    // Input Pemberi Pinjaman
                    System.out.println("\nMasukkan Informasi Pemberi Pinjaman:");
                    pemberiPinjaman = PemberiPinjaman.inputData();
                    break;
                case 3:
                    // Lakukan Pinjaman
                    if (pengguna == null || pemberiPinjaman == null) {
                        System.out.println("Harap masukkan informasi Pengguna dan Pemberi Pinjaman terlebih dahulu.");
                    } else {
                        System.out.println("\nMasukkan Informasi Peminjaman:");
                        Peminjaman peminjamanBaru = Peminjaman.inputData();

                        // Simpan riwayat peminjaman
                        System.out.println("Peminjaman berhasil dilakukan.");
                        riwayatPeminjamanList.add(peminjamanBaru);
                    }
                    break;
                case 4:
                    // Riwayat Pinjaman
                    if (!riwayatPeminjamanList.isEmpty()) {
                        System.out.println("\nInformasi Riwayat Peminjaman:");
                        for (Peminjaman riwayatPeminjaman : riwayatPeminjamanList) {
                            // Tambahkan informasi nama pengguna pada riwayat
                            System.out.println("Nama Pengguna: " + pengguna.nama);
                            riwayatPeminjaman.displayInfo();
                            System.out.println("------------");
                        }
                    } else {
                        System.out.println("Belum ada riwayat peminjaman.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih. Semoga Bermanfaat .");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
