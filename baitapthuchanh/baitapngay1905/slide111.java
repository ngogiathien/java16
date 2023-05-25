package baitapngay1905;
import java.util.LinkedList;
import java.util.Scanner;

public class slide111 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của danh sách
        System.out.print("Nhập số phần tử của danh sách: ");
        int n = scanner.nextInt();

        // Nhập các số nguyên dương vào danh sách
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên dương thứ " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num > 0) {
                numbers.add(num);
            } else {
                System.out.println("Số không hợp lệ, vui lòng nhập lại.");
                i--;
            }
        }

        // Tính trung bình cộng của các số chẵn
        double average = calculateEvenAverage(numbers);

        // Hiển thị kết quả
        System.out.println("Trung bình cộng của các số chẵn: " + average);
    }

    // Tính trung bình cộng của các số chẵn
    public static double calculateEvenAverage(LinkedList<Integer> numbers) {
        int sum = 0;
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
                count++;
            }
        }

        if (count > 0) {
            return (double) sum / count;
        } else {
            System.out.println("không có số nguyên dương nào!");
            return 0;
        }
    }
}
