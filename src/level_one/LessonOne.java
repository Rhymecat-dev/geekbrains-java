package level_one;

public class LessonOne {

    private int age = 100500;
    private byte byteVar = 50;
    private short shVar = 100;
    private long longVar = 9223372;
    private double doubleVar = 6.66;
    private float floatVar = 125.5f;
    private boolean isGood = true;
    private char charName = 'y';

    public static void main(String[] args) {
        calculateMathExpression(10, 5, 2, 0);
        checkSum(10, 20);
        checkInteger(1);
        checkNegativeNumeric(-10);
        sayHello("Noname");
        checkYear(200);
    }

    public static int calculateMathExpression(int a, int b, int c, int d) {
        int expression = 0;
        if (d != 0) {
            return a * (b + (c / d));
        }
        System.out.println("Yo can't divide by zero!");
        return expression;
    }

    public static boolean checkSum(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    public static void checkInteger(int a) {
        if (a >= 0) {
            System.out.println("The numeric " + a + " is positive");
        } else {
            System.out.println("The numeric" + a + " is negative");
        }
    }

    public static boolean checkNegativeNumeric(int a) {
        return a < 0;
    }

    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static boolean checkYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}