package nguyenTienDat_24708521;

import java.time.LocalDate;

public abstract class KhachHang {
	protected String maKH;
	protected String hoTen;
	protected LocalDate ngayLHD;
	protected double soKW, donGia;

	public abstract double getThanhTien();

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getNgayLHD() {
		return ngayLHD;
	}

	public void setNgayLHD(LocalDate ngayLHD) {
		this.ngayLHD = ngayLHD;
	}

	public double getSoKW() {
		return soKW;
	}

	public void setSoKW(double soKW) {
		this.soKW = soKW;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public KhachHang(String maKH, String hoTen, LocalDate ngayLHD, double soKW, double donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayLHD = ngayLHD;
		this.soKW = soKW;
		this.donGia = donGia;
	}

	public KhachHang() {
		super();
	}

	@Override
	public String toString() {
		return "Mã KH: " + maKH + ", Họ tên: " + hoTen + ", Ngày LHD: " + ngayLHD + ", Số KW: " + soKW + ", Đơn giá: " + donGia;
	}
}