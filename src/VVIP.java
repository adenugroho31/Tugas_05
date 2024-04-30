// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    public VVIP(double harga) {
        super(harga);
    }

    // Implementasi method untuk menghitung harga total tiket VVIP
    @Override
    public double hitungTotalHarga(int jumlah, String tahap) {
        // Jika pembelian pada tahap presale, berikan diskon 20%
        if (tahap.equals("Presale")) {
            return (getHarga() * 0.8) * jumlah;
        } else {
            return getHarga() * jumlah;
        }
    }
}