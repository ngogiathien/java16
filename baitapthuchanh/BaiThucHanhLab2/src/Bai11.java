import java.util.Scanner;

public class Bai11 {
    // Viết chương trình thực hiện các công việc sau:
    // Nhập liệu cho mảng A có n phần tử nguyên từ bàn phím. Sắp xếp mảng số đã nhập
    // tăng dần theo giá trị của các phần tử có trong mảng. In ra màn hình mảng số
    // ban đầu và mảng đã sắp xếp theo thứ tự tăng dần.
    public static void main(String[] args) throws Exception {
        int n, temp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap so luong phan tu trong mang ( phai lon hon 0):");
            n = sc.nextInt();
        } while (n <= 0);
        int arr[] = new int[n];
        int arrbandau[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhap phan tu thu %d = ", i);
            int a = sc.nextInt();
            arr[i] = a;
            arrbandau[i] = a;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.print("mang ban dau: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arrbandau[i] + " ");
        }
        System.out.print("\n mang theo thu tu tang dan: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
