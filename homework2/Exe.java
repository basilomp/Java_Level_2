package ru.geekbrains.homework2;

public class Exe {
    private static final int Y_SIZE = 4;
    private static final int X_SIZE = 4;


    private static final String[][] VALID_ARRAY = new String[][]{
            {"56", "37", "92", "81"},
            {"28", "67", "14", "48" },
            {"38", "21", "88", "5" },
            {"90", "33", "87", "12" },
    };

    private static final String[][] INVALID_SIZE_ARRAY = new String[][]{
            {"56", "37", "92", "81"},
            {"28", "67", "14", "48" },
            {"38", "21", "88", "5" },
//            {"90", "33", "12" },
    };

    private static final String[][] INVALID_DATA_ARRAY = new String[][]{
            {"56", "37", "92", "81"},
            {"28", "a", "14", "48" },
            {"38", "21", "88", "5" },
            {"90", "33", "87", "12" },
    };

    public static void main(String[] args) {
        try {
//            int sum = arrayTotal(VALID_ARRAY);
//            int sum = arrayTotal(INVALID_SIZE_ARRAY);
            int sum = arrayTotal(INVALID_DATA_ARRAY);
            System.out.println("Сумма элементов массива = " + sum);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static void checkSize(String[][] array, int y, int x) throws MyArraySizeException {

        for (String[] strings : array) {
            if (strings.length != y) {
                throw new MyArraySizeException(Y_SIZE, X_SIZE, array.length, strings.length);}
            if (array.length != x)
            throw new MyArraySizeException(Y_SIZE, X_SIZE, array.length, strings.length);

            }
        }



    public static int arrayTotal(String[][] array) throws MyArraySizeException, MyArrayDataException {
        checkSize(array, Y_SIZE, X_SIZE);
        int total = 0;
        for (int y = 0; y < array.length; y++) {
            String[] arrayY = array[y];
            for (int x = 0; x < arrayY.length; x++) {
                String elementValue = arrayY[x];
                try {
                    total += Integer.parseInt(elementValue);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(elementValue, y, x);
                }
                
            }
        }
        return total;
    }
}

