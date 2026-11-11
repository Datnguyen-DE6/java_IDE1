package qlSV;

import java.time.LocalDate;

public class SinhVienChinhQuy extends SinhVien {
	private double hocBong; // Ví dụ thêm thuộc tính riêng cho sinh viên chính quy

	public SinhVienChinhQuy() {
		super();
	}

	public SinhVienChinhQuy(String maSV, String tenSV, LocalDate ngaysinh, String lop, int soTinChi, MonHoc monhoc, double hocBong) {
		super(maSV, tenSV, ngaysinh, lop, soTinChi, monhoc);
		this.hocBong = hocBong;
	}

	public double getHocBong() {
		return hocBong;
	}

	public void setHocBong(double hocBong) {
		this.hocBong = hocBong;
	}

	@Override
	public double thanhTien() {
		return (soTinChi * monhoc.getDonGia()) - hocBong;
	}

	@Override
	public String toString() {
		return super.toString() + ", Học bổng: " + hocBong + ", Thành tiền (Đã trừ học bổng): " + thanhTien();
	}
}