package bai9.iuh;

import java.util.Iterator;

public class DanhSachCongNhan {
	private CongNhan[] ds;
	private int count;
	
	public DanhSachCongNhan(int n) {
		this.ds = new CongNhan[n];
		this.count = 0;
	}
	public boolean themCN(CongNhan cn) {
		if (count < ds.length) {
			ds[count] = cn;
			count++;
			return true;
		}
		return false;
	}
	public void xuatDSCN() {
		if (count == 0) {
			System.out.println("Danh sach trong");
		}
		for (int i = 0 ; i< count;i++) {
			System.out.println(ds[i]);;
		}
	}
	public int soLuongCN() {
		int sum = 0;
		for (int i = 0 ; i< count;i++) {
			sum = i;
		}
		System.out.println("So luong nhan vien la");
		return  sum;
	}
	
	public void xuatDS() {
		
	}
}
