public class Makanan extends MenuItem {

    private String kategori;

public Makanan(String nama, double harga, int stok, String kategori) {
    super(nama, harga, stok);
    this.kategori = kategori;
}

    public String getKategori() {
    return kategori;
}

    @Override
public double hitungHargaAkhir(int jumlah) {
    double hargaSatuan = getHarga();
    if (kategori.equalsIgnoreCase("Berat")) {
        hargaSatuan += 1000;
    }
    return hargaSatuan * jumlah;
}

    @Override
public String getDeskripsi() {
    return getNama() + " (" + kategori + ") - Rp" + getHarga() + " - Stok: " + getStok();
}
}
