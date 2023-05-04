import java.util.ArrayList;
import java.util.Scanner;

public class slide22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo một ArrayList rỗng có kiểu là Integer
        ArrayList<Integer> list = new ArrayList<>();

        // Nhập số lượng phần tử của danh sách từ bàn phím
        System.out.print("Nhập số lượng phần tử của danh sách: ");
        int n = scanner.nextInt();

        // Nhập các phần tử của danh sách từ bàn phím
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int element = scanner.nextInt();
            list.add(element);
        }

        // Tìm phần tử lớn nhất trong danh sách
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        // In ra phần tử lớn nhất trong danh sách
        System.out.println("Phần tử lớn nhất trong danh sách là: " + max);
    }
}
