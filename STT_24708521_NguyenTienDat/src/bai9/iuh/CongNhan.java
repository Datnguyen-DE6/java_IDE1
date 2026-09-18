package bai9.iuh;

public class CongNhan {
	private String maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;
	private double luong;
	private double donGia;
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) throws Exception {
		if (mSoSP == 0) {
			throw new Exception("mSoSP phai lon hon khong");
		}
		this.mSoSP = mSoSP;
	}
	
	public CongNhan(String maCN, String mHo, String mTen, int mSoSP, double luong, double donGia) {
		super();
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
		this.luong = luong;
		this.donGia = donGia;
	}
	public CongNhan() {
	}
	
	public double tinhLuong() {
		double donGia = 0;
		double luong = 0;
		if (this.mSoSP >= 600) {
			donGia = 0.65;
			luong = mSoSP * donGia;
		}
		if (this.mSoSP >= 400 & this.mSoSP <= 599 ) {
			donGia = 0.6;
			luong = mSoSP * donGia;
		}
		if (this.mSoSP >= 200 & this.mSoSP <= 399 ) {
			donGia = 0.55;
			luong = mSoSP * donGia;
		}
		if (this.mSoSP >= 1 & this.mSoSP <= 99 ) {
			donGia = 0.5;
			luong = mSoSP * donGia;
		}
		return luong;
	}

	@Override
	public String toString() {
		return String.format("%-10s,%-10s,%-10s,%-10d,%-10.2f",maCN,mHo,mTen,mSoSP,luong = mSoSP * donGia) ;
	}
}
