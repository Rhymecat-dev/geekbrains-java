package level_two.lesson_three;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {

    private HashMap<String, Set<String>> phoneBook = new HashMap<>();

    public void addToPhoneBook(String surname, String phoneNumber) {
        Set<String> phone = phoneBook.getOrDefault(surname, new HashSet<>());
        phone.add(phoneNumber);
        phoneBook.put(surname, phone);
    }

    public Set<String> getPerson(String surname) {
        return phoneBook.get(surname);
    }
}
