package tienDat24708521;

public abstract class PhongHoc {
    protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    public PhongHoc(String maPhong, String dayNha,
                    double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    // Dieu kien chung: 10m2 cho mot bong den
    public boolean duAnhSang() {
        return soBongDen > 0
                && dienTich / soBongDen >= 10;
    }

    // Moi loai phong co dieu kien dat chuan rieng
    public abstract boolean datChuan();

    @Override
    public String toString() {
        return "Ma phong: " + maPhong
                + ", Day nha: " + dayNha
                + ", Dien tich: " + dienTich
                + ", So bong den: " + soBongDen;
    }
}

