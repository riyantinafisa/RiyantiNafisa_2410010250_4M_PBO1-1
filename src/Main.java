import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<MenuItem> daftarMenu = new ArrayList<>();
        daftarMenu.add(new Minuman("Es Kopi Susu", 12000, 30, "Sedang"));
        daftarMenu.add(new Minuman("Es Teh Manis", 5000, 30, "Kecil"));
        daftarMenu.add(new Makanan("Indomie Telur", 10000, 30, "Berat"));
        daftarMenu.add(new Makanan("Kentang Goreng", 8000, 30, "Ringan"));
        daftarMenu.add(new Makanan("Tahu Goreng", 10000, 30, "Sedang"));

        System.out.println("===== DAFTAR MENU WARKOP DIGITAL =====");
    for (int i = 0; i < daftarMenu.size(); i++) {
    MenuItem item = daftarMenu.get(i);
    System.out.println((i + 1) + ". " + item.getDeskripsi());
}
        System.out.println("=======================================");

        System.out.print("Masukkan nama Anda: ");
    String nama = scanner.nextLine();

        System.out.print("Apakah Anda member? (y/n): ");
    String jawabanMember = scanner.nextLine();
    boolean isMember = jawabanMember.equalsIgnoreCase("y");

        Pelanggan pelanggan = new Pelanggan(nama, isMember);
        Pesanan pesanan = new Pesanan(pelanggan);

        boolean lanjut = true;
    while (lanjut) {
    System.out.print("\nPilih nomor menu (1-" + daftarMenu.size() + "): ");
    int pilihan = Integer.parseInt(scanner.nextLine());

    System.out.print("Jumlah: ");
    int jumlah = Integer.parseInt(scanner.nextLine());

    try {
        MenuItem itemDipilih = daftarMenu.get(pilihan - 1);
        pesanan.tambahItem(itemDipilih, jumlah);
        System.out.println(itemDipilih.getNama() + " berhasil ditambahkan ke pesanan.");
    } catch (StokTidakCukupException e) {
        System.out.println("Gagal menambahkan pesanan: " + e.getMessage());
    }

    System.out.print("Mau pesan lagi? (y/n): ");
    String jawabanLagi = scanner.nextLine();
    lanjut = jawabanLagi.equalsIgnoreCase("y");
}

        System.out.println();
        pesanan.cetakStruk();

        scanner.close();
}
}
