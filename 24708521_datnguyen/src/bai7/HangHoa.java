package bai7;

public abstract class HangHoa {
	    protected String maHang;
	    protected String tenHang;
	    protected double donGia;
	    protected int soLuongTon;

	    public HangHoa() {
	        this.maHang = "";
	        this.tenHang = "xxx";
	        this.donGia = 0;
	        this.soLuongTon = 0;
	    }

	    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
	        setMaHang(maHang);
	        setTenHang(tenHang);
	        setDonGia(donGia);
	        setSoLuongTon(soLuongTon);
	    }

	    public String getMaHang() {
	        return maHang;
	    }

	    public void setMaHang(String maHang) {
	        if (maHang != null && !maHang.trim().isEmpty()) {
	            this.maHang = maHang;
	        }
	    }

	    public String getTenHang() {
	        return tenHang;
	    }

	    public void setTenHang(String tenHang) {
	        if (tenHang != null && !tenHang.trim().isEmpty()) {
	            this.tenHang = tenHang;
	        } else {
	            this.tenHang = "xxx";
	        }
	    }

	    public double getDonGia() {
	        return donGia;
	    }

	    public void setDonGia(double donGia) {
	        if (donGia >= 0) {
	            this.donGia = donGia;
	        }
	    }

	    public int getSoLuongTon() {
	        return soLuongTon;
	    }

	    public void setSoLuongTon(int soLuongTon) {
	        if (soLuongTon >= 0) {
	            this.soLuongTon = soLuongTon;
	        }
	    }


	    public abstract double tinhVAT();
	    public abstract String danhGiaMucDoBanBuon();

	    @Override
	    public String toString() {
	        return String.format("Mã hàng: %-10s | Tên hàng: %-15s | Đơn giá: %-10.2f | SL Tồn: %-5d", 
	                maHang, tenHang, donGia, soLuongTon);
	    }
	
}
