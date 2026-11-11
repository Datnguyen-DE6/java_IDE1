package bai7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa {
	private String nhaCungCap;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    public HangThucPham() {
        super();
        this.nhaCungCap = "";
        this.ngaySanXuat = new Date();
        this.ngayHetHan = this.ngaySanXuat;
    }

    public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, 
                        String nhaCungCap, Date ngaySanXuat, Date ngayHetHan) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.nhaCungCap = nhaCungCap;
        
        Date now = new Date();
        if (ngaySanXuat != null && ngaySanXuat.before(now)) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = now;
        }

        if (ngayHetHan != null && ngayHetHan.after(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = this.ngaySanXuat;
        }
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.05; // VAT 5%
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        // Còn tồn kho và hết hạn -> khó bán
        if (soLuongTon > 0 && new Date().after(ngayHetHan)) {
            return "Khó bán";
        }
        return "Không đánh giá";
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + String.format(" | NCC: %-10s | NSX: %-10s | HSD: %-10s | Đánh giá: %s", 
                nhaCungCap, sdf.format(ngaySanXuat), sdf.format(ngayHetHan), danhGiaMucDoBanBuon());
    }
}
