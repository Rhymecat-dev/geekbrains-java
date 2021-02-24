package level_three.lesson_one;

import java.util.Scanner;

public class Chat {

    public static void main(String[] args) throws Exception {
        DataBase.setConnection();
        DataBase.createTable();
        DataBase.writeToDb();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Login Name And Password: ");
        DataBase.verifyUserName(sc.next(), sc.next());

        System.out.println("Enter your current Login Name and a new Login Name for editing: ");
        DataBase.updateUserName(sc.next(), sc.next());
    }

}