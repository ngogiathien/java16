import java.util.Scanner;
public class HinhTron {
    public double banKinh;
    public double chuVi;
    public double dienTich;
    public final double PI = 3.14;
    Scanner sc = new Scanner(System.in);

    public void nhapBanKinh() {
        System.out.println("Nhap ban kinh: ");
        banKinh = sc.nextDouble();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
        System.out.println("Chu vi = " + chuVi);
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
        System.out.println(" Dien tich ="+dienTich);
    }

    public void hienThiThongTin() {
        System.out.println("Ban kinh: " + banKinh);
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
    }
}
