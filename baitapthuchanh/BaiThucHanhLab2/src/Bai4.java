import java.util.Scanner;

public class Bai4 {
    // Viết chương trình nhập vào một số nguyên từ 1 - 12 từ bàn phím và hiển thị ra
    // tháng tương ứng với số đó (nhập vào số 1 thì sẽ hiển thị ra là "Tháng 1“).
    public static void main(String[] args) throws Exception {
        int a;
        String thang;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("nhap so thang:");
            a = sc.nextInt();
        } while (a < 1 || a > 12);
        switch (a) {
            case 1:
                thang = "thang 1";
                break;
            case 2:
                thang = "thang 2";
                break;
            case 3:
                thang = "thang 3";
                break;
            case 4:
                thang = "thang 4";
                break;
            case 5:
                thang = "thang 5";
                break;
            case 6:
                thang = "thang 6";
                break;
            case 7:
                thang = "thang 7";
                break;
            case 8:
                thang = "thang 8";
                break;
            case 9:
                thang = "thang 9";
                break;
            case 10:
                thang = "thang 10";
                break;
            case 11:
                thang = "thang 11";
                break;
            case 12:
                thang = "thang 12";
                break;
            default:
                thang = " thang nhập vào không hợp lệ!";
                break;
        }
        System.out.println(thang);
    }
}
