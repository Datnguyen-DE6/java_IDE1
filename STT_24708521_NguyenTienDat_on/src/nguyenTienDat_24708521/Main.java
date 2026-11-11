package nguyenTienDat_24708521;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DanhSachKhachHang dskh = new DanhSachKhachHang();

		dskh.themKhachHang(new KhachHangVN("KH01", "Nguyen Van An", LocalDate.of(2026, 5, 12), 150, 3000, "Sinh hoạt", 100));
		dskh.themKhachHang(new KhachHangNN("KH02", "David Miller", LocalDate.of(2026, 6, 15), 80, 5000, "USA"));

		int choice;
		do {
			System.out.println("\n========== QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN ==========");
			System.out.println("1. Thêm khách hàng mới");
			System.out.println("2. Xuất danh sách khách hàng");
			System.out.println("3. Tính tổng số lượng KW theo từng loại");
			System.out.println("4. Tính trung bình thành tiền khách hàng nước ngoài");
			System.out.println("0. Thoát chương trình");
			System.out.print("Nhập lựa chọn của bạn: ");
			
			try {
				choice = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				choice = -1;
			}

			switch (choice) {
				case 1:
					System.out.print("Nhập loại khách hàng (1: Việt Nam, 2: Nước ngoài): ");
					int loai = Integer.parseInt(scanner.nextLine());
					System.out.print("Nhập mã KH: ");
					String ma = scanner.nextLine();
					System.out.print("Nhập họ tên: ");
					String ten = scanner.nextLine();
					LocalDate ngay = LocalDate.now();
					System.out.print("Nhập số KW tiêu thụ: ");
					double sokw = Double.parseDouble(scanner.nextLine());
					System.out.print("Nhập đơn giá: ");
					double dongia = Double.parseDouble(scanner.nextLine());

					if (loai == 1) {
						System.out.print("Nhập đối tượng (Sinh hoạt/Kinh doanh/Sản xuất): ");
						String dt = scanner.nextLine();
						System.out.print("Nhập định mức: ");
						double dinhmuc = Double.parseDouble(scanner.nextLine());
						if (dskh.themKhachHang(new KhachHangVN(ma, ten, ngay, sokw, dongia, dt, dinhmuc))) {
							System.out.println("Thêm khách hàng Việt Nam thành công!");
						} else {
							System.out.println("Thêm thất bại: Mã khách hàng bị trùng!");
						}
					} else if (loai == 2) {
						System.out.print("Nhập quốc tịch: ");
						String quoctich = scanner.nextLine();
						if (dskh.themKhachHang(new KhachHangNN(ma, ten, ngay, sokw, dongia, quoctich))) {
							System.out.println("Thêm khách hàng nước ngoài thành công!");
						} else {
							System.out.println("Thêm thất bại: Mã khách hàng bị trùng!");
						}
					}
					break;
				case 2:
					System.out.println("\n--- DANH SÁCH HÀNG HÓA / KHÁCH HÀNG ---");
					dskh.inDanhSach();
					break;
				case 3:
					dskh.tinhTongSoLuongKW();
					break;
				case 4:
					dskh.tinhTrungBinhThanhTienNN();
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