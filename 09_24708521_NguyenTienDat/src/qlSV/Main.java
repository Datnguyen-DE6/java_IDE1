package qlSV;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();

		// Thêm sẵn 1 dữ liệu mẫu để kiểm tra
		dssv.themSinhVien(new SinhVienChinhQuy("SV01", "Nguyễn Tiến Đạt", LocalDate.of(2006, 1, 10), "DHTI18A", 3, MonHoc.JAVA, 200000));

		int choice;
		do {
			System.out.println("\n========== QUẢN LÝ SINH VIÊN ==========");
			System.out.println("1. Thêm sinh viên chính quy");
			System.out.println("2. Xuất danh sách sinh viên");
			System.out.println("3. Tìm kiếm sinh viên theo mã");
			System.out.println("4. Xóa sinh viên theo mã");
			System.out.println("0. Thoát chương trình");
			System.out.print("Nhập lựa chọn của bạn: ");
			
			try {
				choice = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				choice = -1;
			}

			switch (choice) {
				case 1:
					System.out.print("Nhập mã SV: ");
					String ma = scanner.nextLine();
					System.out.print("Nhập tên SV: ");
					String ten = scanner.nextLine();
					LocalDate ngay = LocalDate.now();
					System.out.print("Nhập lớp: ");
					String lop = scanner.nextLine();
					System.out.print("Nhập số tín chỉ: ");
					int stc = Integer.parseInt(scanner.nextLine());

					// Chọn môn học từ enum MonHoc
					System.out.println("Chọn môn học:");
					System.out.println("1. JAVA (Lập trình Java)");
					System.out.println("2. CSDL (Cơ sở dữ liệu)");
					System.out.println("3. CNPM (Công nghệ phần mềm)");
					System.out.println("4. MMT (Mạng máy tính)");
					System.out.print("Nhập lựa chọn môn học (1-4): ");
					int chonMH = Integer.parseInt(scanner.nextLine());
					
					MonHoc mh = MonHoc.JAVA;
					switch (chonMH) {
						case 1: mh = MonHoc.JAVA; break;
						case 2: mh = MonHoc.CSDL; break;
						case 3: mh = MonHoc.CNPM; break;
						case 4: mh = MonHoc.MMT; break;
						default: System.out.println("Lựa chọn không hợp lệ, mặc định chọn JAVA.");
					}

					System.out.print("Nhập số tiền học bổng: ");
					double hocBong = Double.parseDouble(scanner.nextLine());

					if (dssv.themSinhVien(new SinhVienChinhQuy(ma, ten, ngay, lop, stc, mh, hocBong))) {
						System.out.println("Thêm sinh viên thành công!");
					} else {
						System.out.println("Thêm thất bại: Mã sinh viên bị trùng!");
					}
					break;
				case 2:
					System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
					dssv.inDanhSach();
					break;
				case 3:
					System.out.print("Nhập mã SV cần tìm: ");
					String maTim = scanner.nextLine();
					SinhVien sv = dssv.timKiemTheoMa(maTim);
					if (sv != null) {
						System.out.println("Tìm thấy: " + sv);
					} else {
						System.out.println("Không tìm thấy sinh viên có mã: " + maTim);
					}
					break;
				case 4:
					System.out.print("Nhập mã SV cần xóa: ");
					String maXoa = scanner.nextLine();
					if (dssv.xoaSinhVien(maXoa)) {
						System.out.println("Xóa sinh viên thành công!");
					} else {
						System.out.println("Xóa thất bại: Không tìm thấy mã sinh viên.");
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