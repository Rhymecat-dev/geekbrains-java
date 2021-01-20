package level_two.lesson_two;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] stringArray = {{"1", "1", "3", "10"}, {"3", "1", "1", "9", }, {"1", "2", "3", "1"}, {"1", "2", "3", "10"}};
        verifyArray(stringArray);
    }

    public static int verifyArray(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int row = 0;
        for (String[] s : stringArray) {
            if (stringArray.length == 4 && s.length == 4) {
                for (String value : s) {
                    try {
                        sum += Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Incorrect data '" + value + "' in row " + row + " and column " + Arrays.asList(s).indexOf(value));
                    }
                }
                row++;
            } else {
                throw new MyArraySizeException("Wrong size array! Array's size is " + stringArray.length + ". Rows size is " + s.length);
            }
        }
        return sum;
    }
}