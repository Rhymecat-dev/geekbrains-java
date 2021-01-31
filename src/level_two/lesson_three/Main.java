package level_two.lesson_three;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] wordsArray = {"cat", "dog", "table", "umbrella", "cat", "dog", "array", "mouse", "lamp"};

        HashMap<String, Integer> words = new HashMap<>();
        for (String word : wordsArray) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        System.out.println(words);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addToPhoneBook("Nobody", "654654654");
        phoneBook.addToPhoneBook("Nobody", "654654653");
        phoneBook.addToPhoneBook("Carpenter", "654654651");
        System.out.println(phoneBook.getPerson("Nobody"));
        System.out.println(phoneBook.getPerson("Carpenter"));
    }
}
