import java.util.Scanner;

public class Bai12 {
    // Viết chương trình nhập vào các phần tử cho một ma trận 2 chiều, sau đó tìm và
    // hiển thị phần tử có giá trị lớn nhất trong ma trận đó.

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int row = input.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Nhap cac phan tu cua ma tran:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }

        int max = matrix[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("phan tu co gia tri lon nhat trong ma tran la: " + max);
    }
}
