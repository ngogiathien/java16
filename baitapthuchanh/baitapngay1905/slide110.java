package baitapngay1905;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class slide110 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập dãy số
        System.out.print("nhập số phần tử: ");
        int n =scanner.nextInt();
        for(int i= 0; i<n ;i++){
            System.out.printf("nhap phan tu thu %d \n", i+1);
            int input = scanner.nextInt();
            numbers.add(input);
        }

        // Tìm số nguyên lớn nhất
        int maxNumber = findMaxNumber(numbers);
        System.out.println("Số nguyên lớn nhất trong dãy: " + maxNumber);

        // Nhập vào số nguyên để xoá
        System.out.print("Nhập vào số nguyên để xoá khỏi dãy: ");
        int numberToDelete = scanner.nextInt();
        deleteNumber(numbers, numberToDelete);

        // Sắp xếp dãy số
        sortNumbers(numbers);

        // In dãy số sau khi sắp xếp
        System.out.println("Dãy số sau khi sắp xếp:");
        printNumbers(numbers);
    }

    // Tìm số nguyên lớn nhất trong dãy
    public static int findMaxNumber(ArrayList<Integer> numbers) {
        int maxNumber = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    // Xoá các phần tử có giá trị bằng numberToDelete khỏi dãy
    public static void deleteNumber(ArrayList<Integer> numbers, int numberToDelete) {
        numbers.removeIf(number -> number == numberToDelete);
    }

    // Sắp xếp dãy số
    public static void sortNumbers(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
    }
    
    // In dãy số ra màn hình
    public static void printNumbers(ArrayList<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
