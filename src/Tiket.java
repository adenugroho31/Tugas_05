// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    private double harga;

    public Tiket(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    // Method abstrak untuk menghitung harga total
    public abstract double hitungTotalHarga(int jumlah, String tahap);
}