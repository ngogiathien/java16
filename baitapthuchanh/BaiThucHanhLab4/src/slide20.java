import java.util.ArrayList;

public class slide20 {
    public static void main(String[] args) {
        // Tạo một ArrayList rỗng có kiểu là Integer
        ArrayList<Integer> list = new ArrayList<>();

        // Thêm phần tử vào danh sách
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // In ra số phần tử của danh sách
        System.out.println("Số phần tử của danh sách là: " + list.size());

        // In ra danh sách các phần tử
        System.out.println("Danh sách các phần tử là:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Xóa một phần tử khỏi danh sách
        list.remove(2);

        // In ra danh sách các phần tử sau khi xóa
        System.out.println("Danh sách các phần tử sau khi xóa:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Kiểm tra xem phần tử 2 có tồn tại trong danh sách không
        if (list.contains(2)) {
            System.out.println("Phần tử 2 tồn tại trong danh sách");
        } else {
            System.out.println("Phần tử 2 không tồn tại trong danh sách");
        }

        // Xóa toàn bộ danh sách
        list.clear();

        // Kiểm tra xem danh sách có rỗng không
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println("Danh sách không rỗng");
        }
    }
}

