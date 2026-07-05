public abstract class MenuItem {

    private String nama;
    private double harga;
    private int stok;

    public MenuItem(String nama, double harga, int stok) {
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
}

    public String getNama() {
    return nama;
}

public double getHarga() {
    return harga;
}

public int getStok() {
    return stok;
}

    public void setStok(int stok) {
    this.stok = stok;
}

    public void setHarga(double harga) {
    this.harga = harga;
}
    
    public void kurangiStok(int jumlah) throws StokTidakCukupException {
    if (jumlah > stok) {
        throw new StokTidakCukupException("Stok tidak cukup untuk " + nama + ". Sisa stok: " + stok);
    }
    stok = stok - jumlah;
}

    public abstract double hitungHargaAkhir(int jumlah);

    public abstract String getDeskripsi();
}
