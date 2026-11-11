package tienDat24708521;

public class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongLyThuyet(String maPhong, String dayNha,
                         double dienTich, int soBongDen,
                         boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    public void setCoMayChieu(boolean coMayChieu) {
        this.coMayChieu = coMayChieu;
    }

    @Override
    public boolean datChuan() {
        return duAnhSang() && coMayChieu;
    }

    @Override
    public String toString() {
        return "Phong ly thuyet: " + super.toString()
                + ", Co may chieu: " + coMayChieu
                + ", Dat chuan: " + datChuan();
    }
}

