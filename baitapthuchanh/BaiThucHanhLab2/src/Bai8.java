import java.util.Scanner;

public class Bai8 {
    // Viết chương trình nhập vào một dãy số gồm n số nguyên từ bàn phím. Tính và in
    // ra màn hình trung bình cộng của n số nguyên đã nhập
    public static void main(String[] args) throws Exception {
        int n, tong = 0, a, tbc;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap n:");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap so thu %d:", i+1);
            a = sc.nextInt();
            tong += a;
        }
        tbc = tong/n;
        System.out.println("tbc= "+tbc);
    }
}
