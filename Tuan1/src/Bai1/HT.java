package Bai1;

public class HT {
	private double banKinh;

    public HT() {
        this.banKinh = 0.0;
    }

    public HT(double banKinh) {
        setBanKinh(banKinh);
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh >= 0) {
            this.banKinh = banKinh;
        } else {
            this.banKinh = 0.0;
        }
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return String.format("Hình tròn [Bán kính: %.2f | Chu vi: %.2f | Diện tích: %.2f]", 
                banKinh, tinhChuVi(), tinhDienTich());
    }

    public static void main(String[] args) {
        double r = 5.0;

        HT ht = new HT(r);

        System.out.println("=== CHƯƠNG TRÌNH TÍNH CHU VI & DIỆN TÍCH HÌNH TRÒN ===");
        System.out.println("Bán kính: " + ht.getBanKinh());
        System.out.printf("Chu vi: %.2f\n", ht.tinhChuVi());
        System.out.printf("Diện tích: %.2f\n", ht.tinhDienTich());
    }
}
