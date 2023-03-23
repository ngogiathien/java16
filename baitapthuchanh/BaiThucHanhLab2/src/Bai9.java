import java.util.Scanner;

public class Bai9 {
    // Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả số, ký tự thường và ký
    // tự hoa từ bàn phím. Sau đó đếm và in ra số ký tự thường và ký tự hoa và số có
    // trong chuỗi đó.

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao chuoi: ");
        String str = sc.nextLine();

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("so ki tu thuong: " + lowercaseCount);
        System.out.println("so ki tu: " + uppercaseCount);
        System.out.println("so ki tu so: " + digitCount);
    }

}
