package qlSV;

public enum MonHoc {
	JAVA("MH01", "Lập trình Java", 500000),
	CSDL("MH02", "Cơ sở dữ liệu", 450000),
	CNPM("MH03", "Công nghệ phần mềm", 600000),
	MMT("MH04", "Mạng máy tính", 400000);

	private final String maMH;
	private final String tenMH;
	private final double donGia;

	MonHoc(String maMH, String tenMH, double donGia) {
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.donGia = donGia;
	}

	public String getMaMH() {
		return maMH;
	}

	public String getTenMH() {
		return tenMH;
	}

	public double getDonGia() {
		return donGia;
	}

	@Override
	public String toString() {
		return "Mã MH: " + maMH + ", Tên MH: " + tenMH + ", Đơn giá: " + donGia;
	}
}