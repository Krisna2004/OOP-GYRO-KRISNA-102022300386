import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar penerbangan yang tersedia
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        daftarPenerbangan.add(new Penerbangan("GA001", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("QZ002", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        Penumpang penumpang = null;
        Penerbangan penerbanganTerpilih = null;

        while (true) {
            // Tampilkan menu
            System.out.println("\n====== EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            switch (menu) {
                case 1:
                    // Tampilkan daftar penerbangan
                    System.out.println("Daftar Penerbangan yang Tersedia:");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                        System.out.println();
                    }
                    break;

                case 2:
                    // Input data penumpang dan pilih penerbangan
                    System.out.println("\nSilakan isi data diri terlebih dahulu");
                    System.out.print("Masukkan NIK: ");
                    String NIK = scanner.nextLine();
                    System.out.print("Masukkan Nama Depan: ");
                    String namaDepan = scanner.nextLine();
                    System.out.print("Masukkan Nama Belakang: ");
                    String namaBelakang = scanner.nextLine();

                    penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

                    System.out.println("\nTerima Kasih telah mengisi Data Pelanggan. Silakan Pilih Tiket Penerbangan Yang Tersedia");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                        System.out.println();
                    }

                    System.out.print("\nPilih nomor penerbangan (ext : 1, 2, dst.): ");
                    int pilihan = scanner.nextInt();
                    scanner.nextLine(); // konsumsi newline
                    penerbanganTerpilih = daftarPenerbangan.get(pilihan - 1);

                    System.out.println("\nPesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
                    break;

                case 3:
                    // Tampilkan detail pesanan
                    if (penumpang == null || penerbanganTerpilih == null) {
                        System.out.println("Pembelian Tiket Tidak Ada");
                    } else {
                        System.out.println("\n====== Detail Tiket Penerbangan =======");
                        penumpang.tampilDaftarPenumpang();
                        penerbanganTerpilih.tampilDaftarPenerbangan();
                    }
                    break;

                case 4:
                    // Exit program
                    System.out.println("Terima kasih!");
                    return;

                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
}