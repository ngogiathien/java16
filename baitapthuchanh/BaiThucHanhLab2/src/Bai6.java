import java.util.Scanner;

public class Bai6 {
    // Viết chương trình nhập vào 1 số nguyên dương bất kỳ từ bàn phím. Sau đó tính
    // và in ra giai thừa của số đó.
    public static void main(String[] args) throws Exception {
        int a, giaithua=1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.printf("nhap so can tim:");
            a = sc.nextInt();
        }while(a<=0);
        
        for(int i=2; i<=a; i++){
            giaithua*=i;
        };
        
        System.out.println( giaithua);
    }
}
