package bai7;

public class HangDienMay extends HangHoa {
	private int thoiGianBaoHanh; 
    private double congSuat;     

    public HangDienMay() {
        super();
        this.thoiGianBaoHanh = 0;
        this.congSuat = 0;
    }

    public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, 
                       int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, donGia, soLuongTon);
        setThoiGianBaoHanh(thoiGianBaoHanh);
        setCongSuat(congSuat);
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        if (thoiGianBaoHanh >= 0) this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public void setCongSuat(double congSuat) {
        if (congSuat >= 0) this.congSuat = congSuat;
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.10; 
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        if (soLuongTon < 3) {
            return "Bán được";
        }
        return "Không đánh giá";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | BH: %-3d tháng | Công suất: %-5.1f KW | Đánh giá: %s", 
                thoiGianBaoHanh, congSuat, danhGiaMucDoBanBuon());
    }
}

