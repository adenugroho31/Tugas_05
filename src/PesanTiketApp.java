import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        // Meminta input nama pembeli
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();
        
        // Meminta input tahap pembelian
        System.out.println("\nPilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int tahapPembelian = scanner.nextInt();
        
        // Bila input tahap pembelian yang tidak valid
        if (tahapPembelian != 1 && tahapPembelian != 2) {
            System.out.println("\nInput tidak valid!");
            scanner.close();
            return;
        }
        
        // Meminta input jenis tiket
        System.out.println("\nPilih jenis tiket:");
        if (tahapPembelian == 1) {
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
        } else {
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
        }

        int jenisTiket = scanner.nextInt();
       
        // Bila input jenis tiket yang tidak valid
        if ((tahapPembelian == 1 && (jenisTiket != 1 && jenisTiket != 2)) ||
            (tahapPembelian == 2 && (jenisTiket < 1 || jenisTiket > 3))) {
            System.out.println("\nInput tidak valid!");
            scanner.close();
            return;
        }
        
        // Meminta input jumlah tiket
        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
        int jumlah = scanner.nextInt();
        System.out.println();
        
        // Membuat objek pemesanan berdasarkan input pengguna
        Pemesanan pemesanan;
        if (tahapPembelian == 1) {
            if (jenisTiket == 1) {
                pemesanan = new Pemesanan(nama, "Presale", new VIP(150), jumlah);
            } else {
                pemesanan = new Pemesanan(nama, "Presale", new VVIP(200), jumlah);
            }
        } else {
            if (jenisTiket == 1) {
                pemesanan = new Pemesanan(nama, "Reguler", new Festival(100), jumlah);
            } else if (jenisTiket == 2) {
                pemesanan = new Pemesanan(nama, "Reguler", new VIP(150), jumlah);
            } else {
                pemesanan = new Pemesanan(nama, "Reguler", new VVIP(200), jumlah);
            }
        }
        
        // Mencetak nota pemesanan
        pemesanan.cetakNota();

        scanner.close();
    }
}