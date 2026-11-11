package baitap;

public class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, 
                           String chuyenNganh, int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    public boolean isCoBonRua() { return coBonRua; }

    @Override
    public boolean datChuan() {

        return duAnhSang() && this.coBonRua;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Loại: Thí nghiệm | Bồn rửa: %-5s    | Đạt chuẩn: %-5s",
                coBonRua ? "Có" : "Không", datChuan() ? "ĐẠT" : "KHÔNG");
    }
}
