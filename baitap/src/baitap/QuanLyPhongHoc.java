package baitap;

import java.util.*;

public class QuanLyPhongHoc {
    private List<PhongHoc> dsPhong;

    public QuanLyPhongHoc() {
        dsPhong = new ArrayList<>();
    }

    public boolean themPhong(PhongHoc p) {
        if (timKiem(p.getMaPhong()) != null) {
            return false; // Trùng mã phòng
        }
        dsPhong.add(p);
        return true;
    }

    public PhongHoc timKiem(String maPhong) {
        for (PhongHoc p : dsPhong) {
            if (p.getMaPhong().equalsIgnoreCase(maPhong)) {
                return p;
            }
        }
        return null;
    }

    public void xuatToanBo() {
        if (dsPhong.isEmpty()) {
            System.out.println("Danh sách phòng học trống.");
            return;
        }
        for (PhongHoc p : dsPhong) {
            System.out.println(p);
        }
    }

    public List<PhongHoc> getDanhSachDatChuan() {
        List<PhongHoc> dsDatChuan = new ArrayList<>();
        for (PhongHoc p : dsPhong) {
            if (p.datChuan()) {
                dsDatChuan.add(p);
            }
        }
        return dsDatChuan;
    }

    public void sapXepTangTheoDayNha() {
        Collections.sort(dsPhong, Comparator.comparing(PhongHoc::getDayNha));
    }

    public void sapXepGiamTheoDienTich() {
        Collections.sort(dsPhong, Comparator.comparing(PhongHoc::getDienTich).reversed());
    }

    public void sapXepTangTheoSoBongDen() {
        Collections.sort(dsPhong, Comparator.comparingInt(PhongHoc::getSoBongDen));
    }

    public boolean capNhatSoMayTinh(String maPhong, int soMayMoi) {
        PhongHoc p = timKiem(maPhong);
        if (p != null && p instanceof PhongMayTinh) {
            ((PhongMayTinh) p).setSoLuongMay(soMayMoi);
            return true;
        }
        return false;
    }

    public boolean xoaPhong(String maPhong) {
        PhongHoc p = timKiem(maPhong);
        if (p != null) {
            dsPhong.remove(p);
            return true;
        }
        return false;
    }

    public int tongSoPhong() {
        return dsPhong.size();
    }

    public List<PhongMayTinh> getDanhSachPhongMay60() {
        List<PhongMayTinh> kếtQuả = new ArrayList<>();
        for (PhongHoc p : dsPhong) {
            if (p instanceof PhongMayTinh) {
                PhongMayTinh pm = (PhongMayTinh) p;
                if (pm.getSoLuongMay() == 60) {
                    kếtQuả.add(pm);
                }
            }
        }
        return kếtQuả;
    }
}