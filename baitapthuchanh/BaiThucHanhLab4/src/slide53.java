import java.util.HashSet;

public class slide53 {
    public static void main(String[] args) {
        // Tạo một HashSet rỗng có kiểu là String
        HashSet<String> set = new HashSet<>();

        // Thêm các phần tử vào HashSet
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // In ra HashSet trước khi thêm phần tử mới
        System.out.println("HashSet ban đầu: " + set);

        // Thêm một phần tử mới vào HashSet
        set.add("grape");

        // In ra HashSet sau khi thêm phần tử mới
        System.out.println("HashSet sau khi thêm phần tử mới: " + set);
    }
}

