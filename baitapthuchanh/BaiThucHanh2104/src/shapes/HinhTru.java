package shapes;

// import java.util.Scanner;

// public class HinhTru extends Htron {
//     public float chieuCao;

//     public HinhTru() {
//         Ten = "hinh tru";
//     }

//     public void nhapChieuCao() {
//         nhapBanKinh();
//         System.out.println("chieu cao =");
//         Scanner sc = new Scanner(System.in);
//         chieuCao = sc.nextFloat();
//     }

//     public void tinhTheTich() {
//         tinhDienTich();
//         TheTich = DienTich * chieuCao;
//     }
// }

public class HinhTru extends HinhHoc {
    private double banKinhDay;
    private double chieuCao;

    public double getBanKinhDay() {
        return banKinhDay;
    }

    public void setBanKinhDay(double banKinhDay) {
        this.banKinhDay = banKinhDay;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return 2 * Math.PI * banKinhDay * (banKinhDay + chieuCao);
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinhDay + (2 * Math.PI * chieuCao);
    }
}
