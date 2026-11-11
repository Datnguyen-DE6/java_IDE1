package baitap;

import java.util.Scanner;

public class moi_Main {
    public static void main(String[] args) {
        QuanLyPhongHoc ql = new QuanLyPhongHoc();
        Scanner sc = new Scanner(System.in);

        ql.themPhong(new PhongLyThuyet("A101", "A", 60, 8, true));     // Đủ ánh sáng (60/8 = 7.5 <= 10) + Máy chiếu => ĐẠT
        ql.themPhong(new PhongLyThuyet("A102", "A", 60, 4, true));     // Thiếu ánh sáng (60/4 = 15 > 10) => KHÔNG ĐẠT
        ql.themPhong(new PhongMayTinh("B201", "B", 90, 10, 60));       // Đủ ánh sáng (90/10=9) + Mật độ (90/60 = 1.5) => ĐẠT
        ql.themPhong(new PhongMayTinh("B202", "B", 40, 5, 60));        // Mật độ (40/60 = 0.67 < 1.5) => KHÔNG ĐẠT
        ql.themPhong(new PhongThiNghiem("C301", "C", 50, 6, "Hóa", 30, true)); // ĐẠT

        int chon = 0;
        do {
            System.out.println("\n===== QUẢN LÝ PHÒNG HỌC =====");
            System.out.println("1. Xuất danh sách toàn bộ phòng học");
            System.out.println("2. Tìm kiếm phòng học theo mã");
            System.out.println("3. Xuất danh sách phòng học ĐẠT CHUẨN");
            System.out.println("4. Sắp xếp tăng dần theo Dãy nhà");
            System.out.println("5. Sắp xếp giảm dần theo Diện tích");
            System.out.println("6. Sắp xếp tăng dần theo Số bóng đèn");
            System.out.println("7. Cập nhật số máy tính cho phòng máy");
            System.out.println("8. Xóa một phòng học");
            System.out.println("9. Tính tổng số phòng học");
            System.out.println("10. Danh sách phòng máy có đúng 60 máy");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn chức năng: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    ql.xuatToanBo();
                    break;
                case 2:
                    System.out.print("Nhập mã phòng cần tìm: ");
                    String maTim = sc.nextLine();
                    PhongHoc p = ql.timKiem(maTim);
                    if (p != null) System.out.println(p);
                    else System.out.println("Không tìm thấy phòng học!");
                    break;
                case 3:
                    System.out.println("--- DANH SÁCH PHÒNG ĐẠT CHUẨN ---");
                    for (PhongHoc item : ql.getDanhSachDatChuan()) {
                        System.out.println(item);
                    }
                    break;
                case 4:
                    ql.sapXepTangTheoDayNha();
                    System.out.println("Đã sắp xếp tăng dần theo Dãy nhà.");
                    ql.xuatToanBo();
                    break;
                case 5:
                    ql.sapXepGiamTheoDienTich();
                    System.out.println("Đã sắp xếp giảm dần theo Diện tích.");
                    ql.xuatToanBo();
                    break;
                case 6:
                    ql.sapXepTangTheoSoBongDen();
                    System.out.println("Đã sắp xếp tăng dần theo Số bóng đèn.");
                    ql.xuatToanBo();
                    break;
                case 7:
                    System.out.print("Nhập mã phòng máy tính cần sửa: ");
                    String maPM = sc.nextLine();
                    System.out.print("Nhập số máy tính mới: ");
                    int soMay = Integer.parseInt(sc.nextLine());
                    if (ql.capNhatSoMayTinh(maPM, soMay)) System.out.println("Cập nhật thành công!");
                    else System.out.println("Không tìm thấy phòng máy tương ứng!");
                    break;
                case 8:
                    System.out.print("Nhập mã phòng cần xóa: ");
                    String maXoa = sc.nextLine();
                    PhongHoc pXoa = ql.timKiem(maXoa);
                    if (pXoa != null) {
                        System.out.print("Bạn có CHẮC CHẮN muốn xóa phòng " + maXoa + " không? (Y/N): ");
                        String xacNhan = sc.nextLine();
                        if (xacNhan.equalsIgnoreCase("Y")) {
                            ql.xoaPhong(maXoa);
                            System.out.println("Đã xóa thành công!");
                        } else {
                            System.out.println("Hủy thao tác xóa.");
                        }
                    } else {
                        System.out.println("Không tìm thấy mã phòng cần xóa!");
                    }
                    break;
                case 9:
                    System.out.println("Tổng số phòng học: " + ql.tongSoPhong());
                    break;
                case 10:
                    System.out.println("--- PHÒNG MÁY TÍNH CÓ 60 MÁY ---");
                    for (PhongMayTinh pm : ql.getDanhSachPhongMay60()) {
                        System.out.println(pm);
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);

        sc.close();
    }
}
