import java.util.ArrayList;

public class Pesanan {

    private Pelanggan pelanggan;
    private ArrayList<MenuItem> daftarItem;
    private ArrayList<Integer> daftarJumlah;

    public Pesanan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
        this.daftarItem = new ArrayList<>();
        this.daftarJumlah = new ArrayList<>();
    }

    public void tambahItem(MenuItem item, int jumlah) throws StokTidakCukupException {
        item.kurangiStok(jumlah);
        daftarItem.add(item);
        daftarJumlah.add(jumlah);
    }

    public double hitungTotalSebelumDiskon() {
        double total = 0;
        for (int i = 0; i < daftarItem.size(); i++) {
            MenuItem item = daftarItem.get(i);
            int jumlah = daftarJumlah.get(i);
            total += item.hitungHargaAkhir(jumlah);
        }
        return total;
    }

    public double hitungTotalAkhir() {
        double total = hitungTotalSebelumDiskon();
        double diskon = total * pelanggan.getPersenDiskon();
        return total - diskon;
    }

    public void cetakStruk() {
        System.out.println("===== STRUK WARKOP DIGITAL =====");
        System.out.println("Pelanggan: " + pelanggan.getNama());
        System.out.println("---------------------------------");
        for (int i = 0; i < daftarItem.size(); i++) {
            MenuItem item = daftarItem.get(i);
            int jumlah = daftarJumlah.get(i);
            System.out.println(jumlah + "x " + item.getDeskripsi());
        }
        System.out.println("---------------------------------");
        System.out.println("Total Akhir: Rp" + hitungTotalAkhir());
        System.out.println("=================================");
    }
}