package bai7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
    private Date ngayNhapKho;

    public HangSanhSu() {
        super();
        this.nhaSanXuat = "";
        this.ngayNhapKho = new Date();
    }

    public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, 
                      String nhaSanXuat, Date ngayNhapKho) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.nhaSanXuat = nhaSanXuat;
        
        Date now = new Date();
        if (ngayNhapKho != null && ngayNhapKho.before(now)) {
            this.ngayNhapKho = ngayNhapKho;
        } else {
            this.ngayNhapKho = now;
        }
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.10; // VAT 10%
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        // Số lượng tồn > 50 và thời gian lưu kho > 10 ngày -> bán chậm
        long diffInMillies = Math.abs(new Date().getTime() - ngayNhapKho.getTime());
        long diffDays = diffInMillies / (24 * 60 * 60 * 1000);
        
        if (soLuongTon > 50 && diffDays > 10) {
            return "Bán chậm";
        }
        return "Không đánh giá";
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + String.format(" | NSX: %-10s | Ngày nhập: %-10s | Đánh giá: %s", 
                nhaSanXuat, sdf.format(ngayNhapKho), danhGiaMucDoBanBuon());
    }
}

