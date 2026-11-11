package baitap;

public class DanhSachCongNhan {
	    private CongNhan[] ds;
	    private int n;          
	    private int capacity;   

	    public DanhSachCongNhan(int n2) {
			
		}

	    public boolean themCongNhan(CongNhan cn) {
	        if (n < capacity) {
	            ds[n] = cn;
	            n++;
	            return true;
	        }
	        return false; 
	    }

	    public void xuatDanhSach() {
	        if (n == 0) {
	            System.out.println("Danh sách công nhân trống!");
	            return;
	        }
	        System.out.println("-------------------- DANH SÁCH CÔNG NHÂN --------------------");
	        for (int i = 0; i < n; i++) {
	            System.out.println(ds[i].toString());
	        }
	    }

	    public int getSoLuongCongNhan() {
	        return n;
	    }

	    public void xuatCongNhanTren200SP() {
	        System.out.println("------------- CÔNG NHÂN LÀM TRÊN 200 SẢN PHẨM -------------");
	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            if (ds[i].getMSoSP() > 200) {
	                System.out.println(ds[i].toString());
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("Không có công nhân nào làm trên 200 sản phẩm.");
	        }
	    }

	    public void sapXepTheoSoSPGiamDan() {
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (ds[i].getMSoSP() < ds[j].getMSoSP()) {
	                    CongNhan temp = ds[i];
	                    ds[i] = ds[j];
	                    ds[j] = temp;
	                }
	            }
	        }
	    }
	}


