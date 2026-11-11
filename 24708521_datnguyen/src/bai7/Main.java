package bai7;

import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachHangHoa ds = new DanhSachHangHoa(100);

        ds.themHangHoa(new HangThucPham("TP01", "Sữa tươi", 25000, 10, "Vinamilk", new Date(123, 0, 1), new Date(123, 0, 5)));
        ds.themHangHoa(new HangDienMay("DM01", "Tivi Sony", 12000000, 2, 24, 150));
        ds.themHangHoa(new HangSanhSu("SS01", "Bộ ấm chén", 150000, 60, "Bát Tràng", new Date(124, 0, 1)));

        int choice;
        do {
            System.out.println("\n========== QUẢN LÝ HÀNG HÓA SIÊU THỊ ==========");
            System.out.println("1. Thêm hàng hóa mới");
            System.out.println("2. In toàn bộ danh sách hàng hóa");
            System.out.println("3. In danh sách phân theo từng loại hàng");
            System.out.println("4. Tìm kiếm hàng hóa theo mã hàng");
            System.out.println("5. Sắp xếp hàng hóa theo tên tăng dần");
            System.out.println("6. Sắp xếp hàng hóa theo số lượng tồn giảm dần");
            System.out.println("7. Xuất các hàng thực phẩm khó bán");
            System.out.println("8. Xóa hàng hóa theo mã hàng");
            System.out.println("9. Sửa đơn giá hàng hóa theo mã hàng");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại hàng cần thêm (1: Thực phẩm, 2: Điện máy, 3: Sành sứ): ");
                    int loai = Integer.parseInt(scanner.nextLine());
                    
                    System.out.print("Nhập mã hàng: ");
                    String ma = scanner.nextLine();
                    System.out.print("Nhập tên hàng: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhập đơn giá: ");
                    double gia = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập số lượng tồn: ");
                    int sl = Integer.parseInt(scanner.nextLine());

                    if (loai == 1) {
                        System.out.print("Nhập nhà cung cấp: ");
                        String ncc = scanner.nextLine();

                        if (ds.themHangHoa(new HangThucPham(ma, ten, gia, sl, ncc, new Date(), new Date(System.currentTimeMillis() + 86400000L * 30)))) {
                            System.out.println("Thêm hàng thực phẩm thành công!");
                        }
                    } else if (loai == 2) {
                        System.out.print("Nhập thời gian bảo hành (tháng): ");
                        int bh = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập công suất (KW): ");
                        double cs = Double.parseDouble(scanner.nextLine());
                        if (ds.themHangHoa(new HangDienMay(ma, ten, gia, sl, bh, cs))) {
                            System.out.println("Thêm hàng điện máy thành công!");
                        }
                    } else if (loai == 3) {
                        System.out.print("Nhập nhà sản xuất: ");
                        String nsx = scanner.nextLine();
                        if (ds.themHangHoa(new HangSanhSu(ma, ten, gia, sl, nsx, new Date()))) {
                            System.out.println("Thêm hàng sành sứ thành công!");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- TOÀN BỘ DANH SÁCH HÀNG HÓA ---");
                    ds.inToanBo();
                    break;

                case 3:
                    ds.inTheoLoai();
                    break;

                case 4:
                    System.out.print("Nhập mã hàng cần tìm: ");
                    String maTim = scanner.nextLine();
                    HangHoa found = ds.timKiemTheoMa(maTim);
                    if (found != null) {
                        System.out.println("Tìm thấy: " + found);
                    } else {
                        System.out.println("Không tìm thấy hàng hóa có mã: " + maTim);
                    }
                    break;

                case 5:
                    ds.sapXepTheoTenTangDan();
                    ds.inToanBo();
                    break;

                case 6:
                    ds.sapXepTheoSoLuongTonGiamDan();
                    ds.inToanBo();
                    break;

                case 7:
                    ds.xuatThucPhamKhoBan();
                    break;

                case 8:
                    System.out.print("Nhập mã hàng cần xóa: ");
                    String maXoa = scanner.nextLine();
                    if (ds.xoaHangHoa(maXoa)) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Xóa thất bại (không tìm thấy mã hàng).");
                    }
                    break;

                case 9:
                    System.out.print("Nhập mã hàng cần sửa đơn giá: ");
                    String maSua = scanner.nextLine();
                    System.out.print("Nhập đơn giá mới: ");
                    double giaMoi = Double.parseDouble(scanner.nextLine());
                    if (ds.suaDonGia(maSua, giaMoi)) {
                        System.out.println("Cập nhật đơn giá thành công!");
                    } else {
                        System.out.println("Cập nhật thất bại (không tìm thấy mã hàng).");
                    }
                    break;

                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
