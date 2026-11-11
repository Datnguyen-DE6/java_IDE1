package tienDat24708521;

import java.util.ArrayList;
import java.util.Comparator;

public class QuanLyDanhSachPhongHoc {
    private ArrayList<PhongHoc> ds;

    // Khoi tao danh sach
    public QuanLyDanhSachPhongHoc() {
        ds = new ArrayList<>();
    }

    // Them phong neu ma phong chua ton tai
    public boolean themPhong(PhongHoc p) {
        if (p == null || timPhong(p.getMaPhong()) != null) {
            return false;
        }
        ds.add(p);
        return true;
    }

    // Tim phong theo ma phong
    public PhongHoc timPhong(String maPhong) {
        for (PhongHoc p : ds) {
            if (p.getMaPhong().equalsIgnoreCase(maPhong)) {
                return p;
            }
        }
        return null;
    }

    // Xuat toan bo danh sach
    public void xuatDanhSach() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach phong hoc rong!");
            return;
        }

        for (PhongHoc p : ds) {
            System.out.println(p);
        }
    }

    // Liet ke cac phong dat chuan
    public void lietKePhongDatChuan() {
        for (PhongHoc p : ds) {
            if (p.datChuan()) {
                System.out.println(p);
            }
        }
    }

    // Sap xep tang dan theo day nha
    public void sapXepTangTheoDayNha() {
        ds.sort(Comparator.comparing(
                PhongHoc::getDayNha,
                String.CASE_INSENSITIVE_ORDER));
    }

    // Sap xep giam dan theo dien tich
    public void sapXepGiamTheoDienTich() {
        ds.sort(Comparator.comparingDouble(
                PhongHoc::getDienTich).reversed());
    }

    // Sap xep tang dan theo so bong den
    public void sapXepTangTheoSoBongDen() {
        ds.sort(Comparator.comparingInt(
                PhongHoc::getSoBongDen));
    }

    // Cap nhat so may tinh theo ma phong
    public boolean capNhatSoMayTinh(String maPhong,
                                    int soMayTinhMoi) {
        PhongHoc p = timPhong(maPhong);

        if (!(p instanceof PhongMayTinh)
                || soMayTinhMoi < 0) {
            return false;
        }

        PhongMayTinh pmt = (PhongMayTinh) p;
        pmt.setSoMayTinh(soMayTinhMoi);
        return true;
    }

    // Xoa phong: chi xoa khi da xac nhan
    public boolean xoaPhong(String maPhong,
                            boolean xacNhan) {
        if (!xacNhan) {
            return false;
        }

        PhongHoc p = timPhong(maPhong);
        if (p == null) {
            return false;
        }

        return ds.remove(p);
    }

    // Tinh tong so phong hoc
    public int tinhTongSoPhong() {
        return ds.size();
    }

    // Lay danh sach phong may tinh co it nhat 60 may
    public void lietKePhongMayTinhTu60May() {
        for (PhongHoc p : ds) {
            if (p instanceof PhongMayTinh) {
                PhongMayTinh pmt = (PhongMayTinh) p;

                if (pmt.getSoMayTinh() >= 60) {
                    System.out.println(pmt);
                }
            }
        }
    }
}

