package baitap;

public class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean isCoMayChieu() { return coMayChieu; }
    public void setCoMayChieu(boolean coMayChieu) { this.coMayChieu = coMayChieu; }

    @Override
    public boolean datChuan() {

        return duAnhSang() && this.coMayChieu;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Loại: Lý thuyết | Máy chiếu: %-5s | Đạt chuẩn: %-5s",
                coMayChieu ? "Có" : "Không", datChuan() ? "ĐẠT" : "KHÔNG");
    }
}
