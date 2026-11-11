package bai7;

public class DanhSachHangHoa {
	private HangHoa[] danhSach;
    private int count;

    public DanhSachHangHoa(int capacity) {
        danhSach = new HangHoa[capacity];
        count = 0;
    }

    public boolean themHangHoa(HangHoa h) {
        if (count >= danhSach.length) {
            System.out.println("Danh sách đã đầy!");
            return false;
        }
        if (timKiemTheoMa(h.getMaHang()) != null) {
            System.out.println("Thêm thất bại: Mã hàng đã tồn tại!");
            return false;
        }
        danhSach[count++] = h;
        return true;
    }

    public void inToanBo() {
        if (count == 0) {
            System.out.println("Danh sách hàng hóa trống!");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + danhSach[i].toString());
        }
    }

    public void inTheoLoai() {
        System.out.println("\n--- 1. HÀNG THỰC PHẨM ---");
        for (int i = 0; i < count; i++) {
            if (danhSach[i] instanceof HangThucPham) {
                System.out.println(danhSach[i]);
            }
        }

        System.out.println("\n--- 2. HÀNG ĐIỆN MÁY ---");
        for (int i = 0; i < count; i++) {
            if (danhSach[i] instanceof HangDienMay) {
                System.out.println(danhSach[i]);
            }
        }

        System.out.println("\n--- 3. HÀNG SÀNH SỨ ---");
        for (int i = 0; i < count; i++) {
            if (danhSach[i] instanceof HangSanhSu) {
                System.out.println(danhSach[i]);
            }
        }
    }

    public HangHoa timKiemTheoMa(String maHang) {
        for (int i = 0; i < count; i++) {
            if (danhSach[i].getMaHang().equalsIgnoreCase(maHang)) {
                return danhSach[i];
            }
        }
        return null;
    }

    public void sapXepTheoTenTangDan() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (danhSach[i].getTenHang().compareToIgnoreCase(danhSach[j].getTenHang()) > 0) {
                    HangHoa temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách theo tên tăng dần!");
    }

    public void sapXepTheoSoLuongTonGiamDan() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (danhSach[i].getSoLuongTon() < danhSach[j].getSoLuongTon()) {
                    HangHoa temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách theo số lượng tồn giảm dần!");
    }

    public void xuatThucPhamKhoBan() {
        System.out.println("\n--- DANH SÁCH THỰC PHẨM KHÓ BÁN ---");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (danhSach[i] instanceof HangThucPham && danhSach[i].danhGiaMucDoBanBuon().equals("Khó bán")) {
                System.out.println(danhSach[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có thực phẩm nào khó bán.");
        }
    }

    public boolean xoaHangHoa(String maHang) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (danhSach[i].getMaHang().equalsIgnoreCase(maHang)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;

        for (int i = index; i < count - 1; i++) {
            danhSach[i] = danhSach[i + 1];
        }
        danhSach[count - 1] = null;
        count--;
        return true;
    }

    public boolean suaDonGia(String maHang, double donGiaMoi) {
        HangHoa h = timKiemTheoMa(maHang);
        if (h != null) {
            h.setDonGia(donGiaMoi);
            return true;
        }
        return false;
    }
}
