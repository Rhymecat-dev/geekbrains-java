package level_one;

import java.util.Random;
import java.util.Scanner;

public class LessonThree {

    public static void main(String[] args) {
        fixAStatement("Предложение      один  Теперь предложение два  Тут предложение     три");
        guessTheNumber();
    }

    public static String fixAStatement(String statement) {
        String trimmedStatement = statement.replaceAll(" +", " ");
        StringBuilder stringBuilder = new StringBuilder(trimmedStatement);
        for (int i = 1; i < trimmedStatement.length(); i++) {
            if (trimmedStatement.charAt(i) >= 'А' && trimmedStatement.charAt(i) <= 'Я') {
                stringBuilder.setCharAt(i - 1, '.');
            }
        }
        trimmedStatement = stringBuilder.toString();
        for (int j = 1; j < trimmedStatement.length(); j++) {
            if (trimmedStatement.charAt(j) == '.') {
                stringBuilder.insert(j + 1, ' ');
                trimmedStatement = stringBuilder.toString();
            }
        }
        return stringBuilder.append(".").toString();
    }

    public static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите сыграть? 1 – да / 0 – нет");
        int option = scanner.nextInt();
        do {
            if (option == 1) {
                Random random = new Random();
                int randomInt = random.nextInt(10);
                System.out.println("Введите число: ");
                int number = scanner.nextInt();
                if (number == randomInt) {
                    System.out.println("Вы угадали!");
                } else {
                    int attempt = 1;
                    while (attempt != 3) {
                        if (number < randomInt) {
                            System.out.println("Число " + number + " меньше загаданного. Повторите попытку: ");
                        } else {
                            System.out.println("Число " + number + " больше загаданного. Повторите попытку: ");
                        }
                        number = scanner.nextInt();
                        attempt++;
                    }
                    System.out.println("Вы не угадали!");
                }
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                option = scanner.nextInt();
            } else if (option == 0) {
                scanner.close();
            }
        } while (option != 0);
    }
}