import java.util.HashMap;
import java.util.Map;

public class PhoneContactManager implements ContactManager {
    private Map<String, String> contacts;

    public PhoneContactManager() {
        contacts = new HashMap<String, String>();
    }

    @Override
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    @Override
    public void updateContact(String name, String newPhoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.put(name, newPhoneNumber);
        }
    }

    @Override
    public void removeContact(String name) {
        contacts.remove(name);
    }

    @Override
    public String searchContact(String name) {
        if (contacts.containsKey(name)) {
            return contacts.get(name);
        }
        return "Contact not found";
    }
}
