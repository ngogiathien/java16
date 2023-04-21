
public interface ContactManager {
    void addContact(String name, String phoneNumber);
    void updateContact(String name, String newPhoneNumber);
    void removeContact(String name);
    String searchContact(String name);
}
