package baitap;

public abstract class PhongHoc {
    protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() { return maPhong; }
    public String getDayNha() { return dayNha; }
    public double getDienTich() { return dienTich; }
    public int getSoBongDen() { return soBongDen; }

    public void setSoBongDen(int soBongDen) { this.soBongDen = soBongDen; }

    public boolean duAnhSang() {
        return (this.dienTich / this.soBongDen) <= 10.0;
    }

    public abstract boolean datChuan();

    @Override
    public String toString() {
        return String.format("Mã phòng: %-8s | Dãy nhà: %-5s | Diện tích: %-6.1f m2 | Số bóng đèn: %-3d | Đủ ánh sáng: %-5s",
                maPhong, dayNha, dienTich, soBongDen, duAnhSang() ? "Có" : "Không");
    }
}
