package baitap;

public class CongNhan {

	public int getMSoSP1() {

		return 0;
	}


	    private String maCN;
	    private String mHo;
	    private String mTen;
	    private int mSoSP;

	    public CongNhan() {
	        this.maCN = "";
	        this.mHo = "";
	        this.mTen = "";
	        this.mSoSP = 1;
	    }

	    public CongNhan(String maCN, String mHo, String mTen, int mSoSP) {
	        this.maCN = maCN;
	        this.mHo = mHo;
	        this.mTen = mTen;
	        setMSoSP(mSoSP);
	    }

	    public String getMaCN() {
	        return maCN;
	    }

	    public void setMaCN(String maCN) {
	        this.maCN = maCN;
	    }

	    public String getMHo() {
	        return mHo;
	    }

	    public void setMHo(String mHo) {
	        this.mHo = mHo;
	    }

	    public String getMTen() {
	        return mTen;
	    }

	    public void setMTen(String mTen) {
	        this.mTen = mTen;
	    }

	    public int getMSoSP() {
	        return mSoSP;
	    }

	    public void setMSoSP(int mSoSP) {
	        if (mSoSP > 0) {
	            this.mSoSP = mSoSP;
	        } else {
	            this.mSoSP = 1; 
	        }
	    }

	    public double getDonGia() {
	        if (mSoSP >= 600) {
	            return 0.65;
	        } else if (mSoSP >= 400) {
	            return 0.6;
	        } else if (mSoSP >= 200) {
	            return 0.55;
	        } else {
	            return 0.5;
	        }
	    }

	    public double tinhLuong() {
	        return mSoSP * getDonGia();
	    }

	    @Override
	    public String toString() {
	        return String.format("Mã CN: %-8s | Họ tên: %-18s | Số SP: %-5d | Đơn giá: %.2f | Lương: %,.2f",
	                maCN, mHo + " " + mTen, mSoSP, getDonGia(), tinhLuong());
	    }
	}


