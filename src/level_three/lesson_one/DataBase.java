package level_three.lesson_one;

import java.sql.*;

public class DataBase {

    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;

    public static void setConnection() throws ClassNotFoundException, SQLException {
        connection = null;
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:chat.db");
    }

    public static void createTable() throws SQLException {
        statement = connection.createStatement();
        statement.execute(
                "CREATE TABLE if not exists 'users'" +
                        "('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text, 'password' text);");
    }

    public static void writeToDb() throws SQLException {
        statement.execute("INSERT INTO 'users' ('name', 'password') VALUES ('John', '122323')");
        statement.execute("INSERT INTO 'users' ('name', 'password') VALUES ('Nick', '122323')");
        statement.execute("INSERT INTO 'users' ('name', 'password') VALUES ('She', '122323')");
    }

    public static void verifyUserName(String login, String password) throws Exception {
        try {
            resultSet = statement.executeQuery(String.format("SELECT * FROM 'users' WHERE name = '%s'", login));
            if (resultSet.getString("name") != null) {
                if (resultSet.getString("password").equals(password)) {
                    System.out.println("You are successfully logged in!");
                } else {
                    throw new Exception("Password is incorrect!");
                }
            }
        } catch (Exception e) {
            throw new Exception("User not found!");
        }
    }

    public static void updateUserName(String login, String newLogin) throws Exception {
        try {
            resultSet = statement.executeQuery(String.format("SELECT * FROM 'users' WHERE name = '%s'", login));
            if (resultSet.getString("name").equals(login)) {
                statement.executeUpdate(String.format("UPDATE 'users' SET name = '%s' WHERE name = '%s'", newLogin, login));
                System.out.println("User Name was successfully changed!");
            }
        } catch (Exception e) {
            throw new Exception("User not found!");
        }
    }

    public static void checkNullValue(String name) throws Exception {
        if (name == null) {
            throw new Exception("Enter your Name");
        }
    }

    public static void closeDBConnection() throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
    }

}
