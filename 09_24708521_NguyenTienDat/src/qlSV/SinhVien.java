package qlSV;

import java.time.LocalDate;

public abstract class SinhVien {
	protected String maSV;
	protected String tenSV;
	protected LocalDate ngaysinh;
	protected String lop;
	protected int soTinChi;
	protected MonHoc monhoc;

	public SinhVien() {
		super();
	}

	public SinhVien(String maSV, String tenSV, LocalDate ngaysinh, String lop, int soTinChi, MonHoc monhoc) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.ngaysinh = ngaysinh;
		this.lop = lop;
		this.soTinChi = soTinChi;
		this.monhoc = monhoc;
	}
	
	// Phương thức trừu tượng tính thành tiền (học phí) để các lớp con tự định nghĩa
	public abstract double thanhTien();

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public LocalDate getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}

	public MonHoc getMonhoc() {
		return monhoc;
	}

	public void setMonhoc(MonHoc monhoc) {
		this.monhoc = monhoc;
	}

	@Override
	public String toString() {
		return "Mã SV: " + maSV + ", Tên SV: " + tenSV + ", Ngày sinh: " + ngaysinh + ", Lớp: " + lop + ", Số tín chỉ: " + soTinChi + ", Môn học: [" + monhoc + "]";
	}
}