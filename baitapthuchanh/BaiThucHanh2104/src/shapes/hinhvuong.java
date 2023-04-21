package shapes;

import java.util.Scanner;

// public class hinhvuong extends hinhchunhat{
//     public hinhvuong(){
//         Ten = "hinh vuong";
//     }
//     public void nhapCanh(){
//         System.out.println("nhap canh =");
//         Scanner sc = new Scanner(System.in);
//         dai = rong = sc.nextFloat();
//     }
// }


public class hinhvuong extends HinhHoc {
    private double canh;
    
    public double getCanh() {
        return canh;
    }
    
    public void setCanh(double canh) {
        this.canh = canh;
    }
    
    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
    @Override
    public double tinhChuVi() {
        return canh * 4;
    }
}
