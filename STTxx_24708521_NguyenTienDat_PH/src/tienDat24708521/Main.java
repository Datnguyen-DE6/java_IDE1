package tienDat24708521;


public class Main {
    public static void main(String[] args) {
        QuanLyDanhSachPhongHoc ql =
                new QuanLyDanhSachPhongHoc();

        // Them cac phong hoc
        ql.themPhong(new PhongLyThuyet(
                "LT01", "A", 60, 6, true));

        ql.themPhong(new PhongMayTinh(
                "MT01", "B", 120, 12, 70));

        ql.themPhong(new PhongThiNghiem(
                "TN01", "C", 50, 5,
                "Hoa hoc", 30, true));

        ql.themPhong(new PhongLyThuyet(
                "LT02", "A", 40, 2, false));

        System.out.println("=== TOAN BO DANH SACH ===");
        ql.xuatDanhSach();

        System.out.println("\n=== TIM PHONG MT01 ===");
        PhongHoc p = ql.timPhong("MT01");
        System.out.println(p != null ? p : "Khong tim thay");

        System.out.println("\n=== PHONG DAT CHUAN ===");
        ql.lietKePhongDatChuan();

        System.out.println("\n=== TANG DAN THEO DAY NHA ===");
        ql.sapXepTangTheoDayNha();
        ql.xuatDanhSach();

        System.out.println("\n=== GIAM DAN THEO DIEN TICH ===");
        ql.sapXepGiamTheoDienTich();
        ql.xuatDanhSach();

        System.out.println("\n=== TANG DAN THEO SO BONG DEN ===");
        ql.sapXepTangTheoSoBongDen();
        ql.xuatDanhSach();

        System.out.println("\n=== CAP NHAT SO MAY TINH ===");
        System.out.println(
                ql.capNhatSoMayTinh("MT01", 80)
                ? "Cap nhat thanh cong"
                : "Cap nhat that bai");

        System.out.println("\n=== PHONG CO TU 60 MAY TRO LEN ===");
        ql.lietKePhongMayTinhTu60May();

        System.out.println("\n=== XOA PHONG LT02 ===");
        System.out.println(
                ql.xoaPhong("LT02", true)
                ? "Xoa thanh cong"
                : "Khong xoa duoc");

        System.out.println("\n=== TONG SO PHONG ===");
        System.out.println(ql.tinhTongSoPhong());
    }
}

