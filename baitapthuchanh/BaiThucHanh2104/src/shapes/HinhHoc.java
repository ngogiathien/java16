package shapes;

// public class HinhHoc
// {
//     public final float PI = 3.14f;
//     public String Ten;
//     public float Chuvi;
//     public float DienTich;
//     public float TheTich;

//     public void XuatTen(){
//         System.out.println("\n\n======" + Ten + "======");
//     }

//     public void InChuVi(){
//         System.out.println("chu vi = "+ Chuvi );
//     }
//     public void InDienTic(){
//         System.out.println("dien tich = "+ DienTich );
//     }
//     public void InTheTich(){
//         System.out.println("the tich = "+ TheTich );
//     }
// }

public abstract class HinhHoc {
    protected String ten;
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public abstract double tinhDienTich();
    public abstract double tinhChuVi();
}
