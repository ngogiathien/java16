import java.util.Scanner;

public class Bai10 {
    // Viết chương trình nhập từ bàn phím một chuỗi không quá 80 ký tự và một ký tự
    // bất kỳ. Đếm và in ra màn hình số lần xuất hiện của ký tự đó trong chuỗi vừa
    // nhập.
    public static void main(String[] args) throws Exception {
        // Khai báo biến
        String string;
        char kitubatki;
        int count = 0;

        // Nhập chuỗi và ký tự bất kỳ từ bàn phím
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap chuoi khong qua 80 ki tu: ");
            string = scanner.nextLine();
        } while (string.length() > 80);
        System.out.print("nhap ki tu bat ki: ");
        kitubatki = scanner.next().charAt(0);
        // Đếm số lần xuất hiện của ký tự trong chuỗi
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == kitubatki) {
                count++;
            }
        }

        // In ra kết quả
        System.out.println("so lan xuat hien cua ki tu " + kitubatki + " trong chuoi la " + count);

    }

}
