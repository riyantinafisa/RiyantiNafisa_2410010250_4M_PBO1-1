public class Pelanggan {

    private String nama;
    private boolean isMember;

    public Pelanggan(String nama, boolean isMember) {
        this.nama = nama;
        this.isMember = isMember;
    }

    public String getNama() {
        return nama;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }

    public double getPersenDiskon() {
        if (isMember) {
            return 0.10;
        }
        return 0.0;
    }

}
