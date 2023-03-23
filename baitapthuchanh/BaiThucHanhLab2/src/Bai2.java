import java.util.Scanner;
public class Bai2 {
    // Viết chương trình kiểm tra số vừa nhập vào là số chẵn hay lẻ.

    public static void main(String[] args) throws Exception {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap so can tim:");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.printf("%d la so chan", a);
        }
        else{
            System.out.printf("%d la so le", a);
        }
    }
}
