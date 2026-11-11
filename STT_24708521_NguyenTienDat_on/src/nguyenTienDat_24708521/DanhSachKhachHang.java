package nguyenTienDat_24708521;

import java.util.ArrayList;
import java.util.List;

public class DanhSachKhachHang {
	private List<KhachHang> danhSach;

	public DanhSachKhachHang() {
		danhSach = new ArrayList<>();
	}

	public boolean themKhachHang(KhachHang kh) {
		for (KhachHang x : danhSach) {
			if (x.getMaKH().equalsIgnoreCase(kh.getMaKH())) {
				return false;
			}
		}
		danhSach.add(kh);
		return true;
	}

	public void inDanhSach() {
		if (danhSach.isEmpty()) {
			System.out.println("Danh sách khách hàng trống!");
			return;
		}
		for (KhachHang kh : danhSach) {
			System.out.println(kh);
		}
	}

	public void tinhTongSoLuongKW() {
		double tongKW_VN = 0;
		double tongKW_NN = 0;
		for (KhachHang kh : danhSach) {
			if (kh instanceof KhachHangVN) {
				tongKW_VN += kh.getSoKW();
			} else if (kh instanceof KhachHangNN) {
				tongKW_NN += kh.getSoKW();
			}
		}
		System.out.println("-> Tổng số lượng KW khách hàng Việt Nam: " + tongKW_VN);
		System.out.println("-> Tổng số lượng KW khách hàng Nước ngoài: " + tongKW_NN);
	}

	public void tinhTrungBinhThanhTienNN() {
		double tongTien = 0;
		int dem = 0;
		for (KhachHang kh : danhSach) {
			if (kh instanceof KhachHangNN) {
				tongTien += kh.getThanhTien();
				dem++;
			}
		}
		if (dem == 0) {
			System.out.println("-> Không có khách hàng nước ngoài nào trong danh sách.");
		} else {
			System.out.println("-> Trung bình thành tiền khách hàng nước ngoài: " + (tongTien / dem));
		}
	}
}