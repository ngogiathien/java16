package baitapngay1905;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class slide113 {
    public static void main(String[] args) {
        HashSet<String> TraiCays = new HashSet<String>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("----Nhập số trái cây cần thêm: \n");
        int n = scanner.nextInt();
        scanner.nextLine();
        //nhập trái cây
        for (int i = 0; i < n; i++) {
            System.out.printf("Tên trái cây thứ %d:\n", i + 1);
            String name = scanner.next();
            TraiCays.add(name);
        }
        //hiển thị danh sách trái cây
        System.out.println("----danh sách trái cây: ");
        for(String traicay: TraiCays){
            System.out.println(traicay);
        }
        //tìm kiếm trái cây
        System.out.print("----Nhập tên trái cây cần tìm: ");
        String searchName = scanner.next();
        boolean foundSeach = false;
        for (String traicay : TraiCays) {
            if (traicay.equals(searchName)) {
                System.out.println("có tìm tháy trái cây: " + traicay);
                foundSeach = true;
            }
        }
        if (!foundSeach) {
            System.out.println("Không tìm thấy trái cây có tên \"" + searchName + "\"");
        }
        // xóa trái cây
        System.out.print("----Nhập tên trái cây cần xóa: ");
        String DeleteName = scanner.next();
        boolean foundDelete = false;
        for (String traicay : TraiCays) {
            if (traicay.equals(DeleteName)) {
                TraiCays.remove(DeleteName);
                System.out.println("đã xóa trái cây: " + traicay);
                foundDelete = true;
            }
        }
        if (!foundDelete) {
            System.out.println("Không tìm thấy trái cây có tên \"" + DeleteName + "\"");
        }
//Tạo 1 List mới có cùng kiểu dữ liệu với HashSet và thêm các phần tử của List này
//List này vào trong HashSet ban đầu 
        ArrayList<String> linkedTraiCays = new ArrayList<String>();
        System.out.print("----Nhập số trái cây cần thêm: ");
        int a = scanner.nextInt();
        //nhập trái cây
        for (int i = 0; i < a; i++) {
            System.out.printf("Tên trái cây thứ %d:\n", i + 1);
            String arrname = scanner.next();
            linkedTraiCays.add(arrname);
        }
        TraiCays.addAll(linkedTraiCays);
        //khai báo Iterator
     Iterator<String> iterator = linkedTraiCays.iterator();
     System.out.println("các phần tử trong arraylist là: ");
     while(iterator.hasNext()){
        System.out.print(iterator.next()+ "\t");
     }
     
    }

}
