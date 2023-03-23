import java.util.Scanner;

public class Bai1 {
    // Nhập vào 2 số bất kỳ từ bàn phím và thực hiện các yêu cầu sau:
    // 1. Tính tổng, hiệu, tích, thương, chia lấy dư của 2 số đó.
    // 2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
    public static void main(String[] args) throws Exception {
        float a, b, du;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap so thu nhat:");
        a = sc.nextFloat();
        System.out.printf("nhap so thu hai:");
        b = sc.nextFloat();
        System.out.printf("tong la: %f \n", a + b);
        System.out.printf("hieu la: %f \n", a - b);
        System.out.printf("tich la: %f  \n", a * b);
        System.out.printf("thuong la: %f  \n", a / b);
        if(a>b){
            System.out.printf("%f lon hon %f", a,b);
        }
        else if(a<b){
            System.out.printf("%f lon hon %f", b,a);
        }
        else{
            System.out.printf("2 so bang nhau");
        }
    }
}
