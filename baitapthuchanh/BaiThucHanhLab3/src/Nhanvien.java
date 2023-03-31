import java.util.Scanner;

public class Nhanvien {
    public String HoTen;
    public int Tuoi;
    public final double HeSoLuong = 1.3;
    public int LuongCoBan = 1490000;
    public Double Luong;
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin() {
        System.out.println("nhap ten: ");
        HoTen = sc.nextLine();
        System.out.println("nhap tuoi: ");
        Tuoi = sc.nextInt();
    }

    public void TinhLuong() {
        Luong = LuongCoBan * HeSoLuong;
        System.out.println("Luong nhan vien = " + Luong);
    }

    public void HienThiThongTin() {
        System.out.println("Ho ten: " + HoTen);
        System.out.println("tuoi: " + Tuoi);
        System.out.println("Luong: " + Luong);
    }
}
