package tienDat24708521;


public class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String maPhong, String dayNha,
                          double dienTich, int soBongDen,
                          String chuyenNganh, int sucChua,
                          boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public void setCoBonRua(boolean coBonRua) {
        this.coBonRua = coBonRua;
    }

    @Override
    public boolean datChuan() {
        return duAnhSang() && coBonRua;
    }

    @Override
    public String toString() {
        return "Phong thi nghiem: " + super.toString()
                + ", Chuyen nganh: " + chuyenNganh
                + ", Suc chua: " + sucChua
                + ", Co bon rua: " + coBonRua
                + ", Dat chuan: " + datChuan();
    }
}

