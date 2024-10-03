package model;

public class TimKiemModel {
    private String vanBan, tuKhoa, ketQua;

    public TimKiemModel() {
        this.vanBan = "";
        this.tuKhoa = "";
        this.ketQua = "";

    }

    public String getVanBan() {
        return vanBan;
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public String getTuKhoa() {
        return this.tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public String getKetQua() {
        return this.ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public void timKiem() {
        int dem = 0;
        String[] mang = this.vanBan.split(" |\n");

        for (String string : mang) {
            if (string.equals(this.tuKhoa)) {
                dem++;
                System.out.println(dem);
            }
        }
        this.ketQua = "Kết quả: có " + dem + " " + this.tuKhoa;
    }

}
