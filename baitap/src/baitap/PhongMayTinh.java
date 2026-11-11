package baitap;

public class PhongMayTinh extends PhongHoc {
    private int soLuongMay;

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soLuongMay) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soLuongMay = soLuongMay;
    }

    public int getSoLuongMay() { return soLuongMay; }
    public void setSoLuongMay(int soLuongMay) { this.soLuongMay = soLuongMay; }

    @Override
    public boolean datChuan() {

        boolean duDienTichMay = (this.dienTich / this.soLuongMay) >= 1.5;
        return duAnhSang() && duDienTichMay;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Loại: Máy tính  | Số máy: %-3d      | Đạt chuẩn: %-5s",
                soLuongMay, datChuan() ? "ĐẠT" : "KHÔNG");
    }
}
