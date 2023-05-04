import java.util.HashSet;

public class slide55 {
    public static void main(String[] args) {
        // Tạo một HashSet có kiểu là Integer
        HashSet<Integer> set = new HashSet<>();

        // Thêm các phần tử vào HashSet
        set.add(1);
        set.add(2);
        set.add(3);

        // In ra HashSet trước khi xóa phần tử
        System.out.println("HashSet ban đầu: " + set);

        // Xóa một phần tử bất kỳ khỏi HashSet
        set.remove(2);

        // In ra HashSet sau khi xóa phần tử
        System.out.println("HashSet sau khi xóa phần tử: " + set);
    }
}
