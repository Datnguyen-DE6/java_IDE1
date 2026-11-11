package nguyenTienDat_24708521;

import java.time.LocalDate;

public class KhachHangVN extends KhachHang {
	private String doiTuong; 
	private double dinhMuc;

	public KhachHangVN() {
		super();
	}

	public KhachHangVN(String maKH, String hoTen, LocalDate ngayLHD, double soKW, double donGia, String doiTuong, double dinhMuc) {
		super(maKH, hoTen, ngayLHD, soKW, donGia);
		this.doiTuong = doiTuong;
		this.dinhMuc = dinhMuc;
	}

	public String getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}

	public double getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}

	@Override
	public double getThanhTien() {
		if (soKW <= dinhMuc) {
			return soKW * donGia;
		} else {
			return dinhMuc * donGia + (soKW - dinhMuc) * donGia * 2.5;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", Đối tượng: " + doiTuong + ", Định mức: " + dinhMuc + ", Thành tiền: " + getThanhTien();
	}
}