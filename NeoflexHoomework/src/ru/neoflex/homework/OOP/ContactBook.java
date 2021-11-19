package NeoflexHoomework.src.ru.neoflex.homework.OOP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContactBook {
    private static HashMap<String, HashSet<Long>> contacts = new HashMap<>();

    public static void addNewContact (String contactName, HashSet<Long> numbers) {
        if (!contacts.containsKey(contactName)) {
            contacts.put(contactName, numbers);
            System.out.println("Добавлен контакт: " + numbers.toString() + " - " + contactName);
        } else {
            System.out.println("Такой контакт уже существует");
        }
    }

    public static HashSet<Long> getContact (String contactName) {
        return contacts.get(contactName.toLowerCase());
    }

    public static HashMap<String, HashSet<Long>> getContactByPartOfName (String partOfName) {
        HashMap<String, HashSet<Long>> resultSearch = new HashMap<>();
        for(Map.Entry<String, HashSet<Long>> item : contacts.entrySet()){
            if (item.getKey().toLowerCase().contains(partOfName.toLowerCase())) {
                resultSearch.put(item.getKey(), item.getValue());
            }
        }
        return resultSearch;
    }
}
