public class App {
    public static void main(String[] args) {
        PhoneContactManager phoneContactManager = new PhoneContactManager();
        
        // Thêm mới contact
        phoneContactManager.addContact("John Doe", "1234567890");
        phoneContactManager.addContact("Jane Smith", "0987654321");
        
        // Cập nhật số điện thoại của contact
        phoneContactManager.updateContact("John Doe", "5555555555");
        
        // Xoá contact
        phoneContactManager.removeContact("Jane Smith");
        
        // Tìm kiếm và in ra số điện thoại theo tên
        System.out.println(phoneContactManager.searchContact("John Doe")); // In ra "5555555555"
        System.out.println(phoneContactManager.searchContact("Jane Smith")); // In ra "Contact not found"
    }
}
