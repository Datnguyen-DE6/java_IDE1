package CuaHangCD;

import java.util.Iterator;

public class CD {
	private String maCD;
	private String tuaCD;
	private String caSy;
	private int soBai;
	private float gia;
	public CD(String maCD, String tuaCD, String caSy, int soBai, float gia) {
	
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		this.soBai = soBai;
		this.gia = gia;
	}
	public CD() {
		
	}
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}
	public String getCaSy() {
		return caSy;
	}
	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}
	public int getSoBai() {
		return soBai;
	}
	public void setSoBai(int soBaiHat) throws Exception{
		if (soBaiHat == 0) {
			throw new Exception("So bai hat phai lon hon khong");
		}
		this.soBai = soBai;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public static void tieuDe() {
		System.out.println("In danh sach");
		for (int i = 0 ;i<100 ; i++) {
			System.out.print("-");
		}
		System.out.println();
		String s = String.format("|%10s|%10s|%10s|%10s|%10s|%10s|", "MaCD","TuaCD","CaSy","SoBaiHat","DonGia","ThanhTien");
		System.out.println(s);
		for (int i = 0 ;i<100 ; i++) {
			System.out.print("-");
		}
	}
	
	@Override
	public String toString() {
		return String.format("|%10s|%10s|%10s|%10d|%10.2f|%10.2f|", maCD,tuaCD,caSy,soBai,gia,gia*soBai);
	}
}
