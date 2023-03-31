import java.util.Scanner;

import java.util.Scanner;

public class HinhTruTron {

    public double banKinh;
    public double chuVi;
    public double dienTich;
    public final double PI = 3.14;
    public double chieuCao;
    public double theTich;
    Scanner sc = new Scanner(System.in);

    public void nhapBanKinh() {
        System.out.println("Nhap ban kinh:");

        banKinh = sc.nextDouble();
    }

    public void nhapChieuCao() {
        System.out.println("Nhap chieu cao:");
        chieuCao = sc.nextDouble();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
        System.out.println("Chu vi =" + chuVi);
    }

    public void tinhDienTich() {
        dienTich = 2 * PI * banKinh * (banKinh + chieuCao);
        System.out.println("Dien tich =" + dienTich);

    }

    public void tinhTheTich() {
        theTich = PI * banKinh * banKinh * chieuCao;
        System.out.println("The tich =" + theTich);

    }

    public void hienThiThongTin() {
        System.out.println("Ban kinh: " + banKinh);
        System.out.println("Chieu cao: " + chieuCao);
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
        System.out.println("The tich: " + theTich);
    }
}
