package shapes;

import java.util.Scanner;
// public class Htron extends HinhHoc {
//     public float banKinh;

//     public Htron() {
//         Ten = "hinh tron";
//     }

//     public void nhapBanKinh() {
//         System.out.println("ban kinh =");
//         Scanner sc = new Scanner(System.in);
//         banKinh = sc.nextFloat();
//     }

//     public void tinhChuVi() {
//         Chuvi = 2 * PI * banKinh;
//     }

//     public void tinhDienTich() {
//         DienTich = PI * banKinh * banKinh;
//     }
// }

public class Htron extends HinhHoc {
    private double banKinh;

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}
