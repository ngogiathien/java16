import java.util.HashMap;
import java.util.Map;

public class EmailContactManager implements ContactManager {
    private Map<String, String> contacts;

    public EmailContactManager() {
        contacts = new HashMap<String, String>();
    }

    @Override
    public void addContact(String name, String email) {
        contacts.put(name, email);
    }

    @Override
    public void updateContact(String name, String newEmail) {
        if (contacts.containsKey(name)) {
            contacts.put(name, newEmail);
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
