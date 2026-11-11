package nguyenTienDat_24708521;

import java.time.LocalDate;

public class KhachHangNN extends KhachHang {
	private String quocTich;

	public KhachHangNN() {
		super();
	}

	public KhachHangNN(String maKH, String hoTen, LocalDate ngayLHD, double soKW, double donGia, String quocTich) {
		super(maKH, hoTen, ngayLHD, soKW, donGia);
		this.quocTich = quocTich;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	@Override
	public double getThanhTien() {
		return soKW * donGia;
	}

	@Override
	public String toString() {
		return super.toString() + ", Quốc tịch: " + quocTich + ", Thành tiền: " + getThanhTien();
	}
}