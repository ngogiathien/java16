import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("nhap so phan tu cua array:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap so phan tu thu" + i + " : ");
            number = sc.nextInt();
            arrlist.add(number);
        }
        int max = arrlist.get(0);
        for (int i = 0; i < arrlist.size() - 1; i++)
            for (int j = i + 1; j < arrlist.size(); j++) {
                if (arrlist.get(i) > arrlist.get(j)) // nếu có nghịch thế thì đổi chỗ
                {
                    int temp = arrlist.get(i);
                    arrlist.set(i, arrlist.get(j));
                    arrlist.set(j, temp);
                }
            }

    }
}
