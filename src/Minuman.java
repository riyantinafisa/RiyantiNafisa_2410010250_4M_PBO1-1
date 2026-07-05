public class Minuman extends MenuItem {

    private String ukuran;

    public Minuman(String nama, double harga, int stok, String ukuran) {
        super(nama, harga, stok);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public double hitungHargaAkhir(int jumlah) {
        double hargaSatuan = getHarga();
        if (ukuran.equalsIgnoreCase("Besar")) {
            hargaSatuan += 2000;
        }
        return hargaSatuan * jumlah;
    }

    @Override
    public String getDeskripsi() {
        return getNama() + " (" + ukuran + ") - Rp" + getHarga() + " - Stok: " + getStok();
    }
}