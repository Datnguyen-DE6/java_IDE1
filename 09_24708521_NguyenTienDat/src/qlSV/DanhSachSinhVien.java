package qlSV;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSinhVien {
	private List<SinhVien> danhSach;

	public DanhSachSinhVien() {
		danhSach = new ArrayList<>();
	}

	public boolean themSinhVien(SinhVien sv) {
		for (SinhVien x : danhSach) {
			if (x.getMaSV().equalsIgnoreCase(sv.getMaSV())) {
				return false; // Trùng mã
			}
		}
		danhSach.add(sv);
		return true;
	}

	public void inDanhSach() {
		if (danhSach.isEmpty()) {
			System.out.println("Danh sách sinh viên trống!");
			return;
		}
		for (SinhVien sv : danhSach) {
			System.out.println(sv);
		}
	}

	public SinhVien timKiemTheoMa(String maSV) {
		for (SinhVien sv : danhSach) {
			if (sv.getMaSV().equalsIgnoreCase(maSV)) {
				return sv;
			}
		}
		return null;
	}

	public boolean xoaSinhVien(String maSV) {
		SinhVien sv = timKiemTheoMa(maSV);
		if (sv != null) {
			danhSach.remove(sv);
			return true;
		}
		return false;
	}
}