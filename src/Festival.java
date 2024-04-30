// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    public Festival(double harga) {
        super(harga);
    }

    // Implementasi method untuk menghitung harga total tiket Festival
    @Override
    public double hitungTotalHarga(int jumlah, String tahap) {
        return getHarga() * jumlah;
    }
}