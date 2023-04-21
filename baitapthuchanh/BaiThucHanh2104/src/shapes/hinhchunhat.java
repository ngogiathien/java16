package shapes;

import java.util.Scanner;

// public class hinhchunhat extends HinhHoc {
//     public float dai;
//     public float rong;

//     public hinhchunhat() {
//         Ten = "hinh chu nhat";
//     }

//     public void nhapChieuDai() {
//         System.out.println("chieu dai =");
//         Scanner sc = new Scanner(System.in);
//         dai = sc.nextFloat();
//     }

//     public void nhapChieuRong() {
//         System.out.println("chieu rong =");
//         Scanner sc = new Scanner(System.in);
//         rong = sc.nextFloat();
//     }

//     public void tinhChuVi() {
//         Chuvi = 2 * (dai + rong);
//     }

//     public void tinhDienTich() {
//         DienTich = dai * rong;
//     }
// }

public class hinhchunhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
}
