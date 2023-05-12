import java.util.LinkedList;

public class slide37 {
    public static void main(String[] args) {
        // Khởi tạo một LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Thêm các phần tử vào LinkedList
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // In ra kích thước của LinkedList
        System.out.println("LinkedList size: " + list.size());

        // Lấy phần tử đầu tiên của LinkedList
        String firstElement = list.getFirst();
        System.out.println("First element: " + firstElement);

        // Lấy phần tử cuối cùng của LinkedList
        String lastElement = list.getLast();
        System.out.println("Last element: " + lastElement);

        // Xóa phần tử đầu tiên của LinkedList
        list.removeFirst();

        // Xóa phần tử cuối cùng của LinkedList
        list.removeLast();

        // In ra toàn bộ các phần tử còn lại của LinkedList
        System.out.println("Remaining elements: " + list);
    }
}
