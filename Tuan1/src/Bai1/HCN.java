package Bai1;

public class HCN {
	private double chieuDai;
    private double chieuRong;

    public HCN() {
        this.chieuDai = 5.0;
        this.chieuRong = 2.0;
    }

    public HCN(double chieuDai, double chieuRong) {
        setChieuDai(chieuDai);
        setChieuRong(chieuRong);
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai > 0) {
            this.chieuDai = chieuDai;
        } else {
            this.chieuDai = 0.0;
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong > 0) {
            this.chieuRong = chieuRong;
        } else {
            this.chieuRong = 0.0;
        }
    }

    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return String.format("Hình chữ nhật [Chiều dài: %.2f | Chiều rộng: %.2f | Chu vi: %.2f | Diện tích: %.2f]", 
                chieuDai, chieuRong, tinhChuVi(), tinhDienTich());
    }

    public static void main(String[] args) {

        double dai = 10.5;
        double rong = 5.0;

        HCN hcn = new HCN();

        System.out.println("=== CHƯƠNG TRÌNH TÍNH CHU VI & DIỆN TÍCH HÌNH CHỮ NHẬT ===");
        System.out.println("Chiều dài: " + hcn.getChieuDai());
        System.out.println("Chiều rộng: " + hcn.getChieuRong());
        System.out.printf("Chu vi: %.2f\n", hcn.tinhChuVi());
        System.out.printf("Diện tích: %.2f\n", hcn.tinhDienTich());
        
    }
}
