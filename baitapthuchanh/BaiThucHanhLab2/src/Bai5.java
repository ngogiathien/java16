import java.util.Scanner;

public class Bai5 {
    // Viết chương trình nhập vào các số nguyên và tính tổng các số đó, nếu tổng lớn
    // hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã
    // nhập.

    public static void main(String[] args) throws Exception {
        int a, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("hay nhap a:");
        a = sc.nextInt();
        while(tong< 100){
        System.out.printf(" tong chua > = 100,hay nhap them a:");
            a = sc.nextInt();
            tong +=a;
        };
        System.out.printf("tong la: %d",tong);
    }
}
