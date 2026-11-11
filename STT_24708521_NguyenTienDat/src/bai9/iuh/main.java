package bai9.iuh;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước tối đa (n) của danh sách công nhân: ");
        int n = scanner.nextInt();
        DanhSachCongNhan danhSach = new DanhSachCongNhan(n);

        System.out.print("Nhập số lượng công nhân muốn thêm vào ban đầu: ");
        int soLuongNhap = scanner.nextInt();
        scanner.nextLine(); // Xóa bộ đệm

        for (int i = 0; i < soLuongNhap; i++) {
            System.out.println("\nNhập thông tin cho công nhân thứ " + (i + 1) + ":");
            System.out.print("Mã công nhân: ");
            String maCN = scanner.nextLine();
            System.out.print("Họ công nhân: ");
            String mHo = scanner.nextLine();
            System.out.print("Tên công nhân: ");
            String mTen = scanner.nextLine();
            System.out.print("Số sản phẩm (>0): ");
            int mSoSP = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ đệm

            CongNhan cn = new CongNhan(maCN, mHo, mTen, mSoSP);
            if (danhSach.themCongNhan(cn)) {
                System.out.println("-> Thêm công nhân thành công!");
            } else {
                System.out.println("-> Danh sách đã đầy, không thể thêm nữa!");
                break;
            }
        }

        System.out.println("\n============================================================");
        danhSach.xuatDanhSach();

        System.out.println("\nTổng số lượng công nhân viên trong danh sách: " + danhSach.getSoLuongCongNhan());

        System.out.println();
        danhSach.xuatCongNhanTren200SP();

        System.out.println("\n----------------- SAU KHI SẮP XẾP SỐ SP GIẢM DẦN -----------------");
        danhSach.sapXepTheoSoSPGiamDan();
        danhSach.xuatDanhSach();

        scanner.close();
    }

}
