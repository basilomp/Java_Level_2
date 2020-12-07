package ru.geekbrains.homework2;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(int validY, int validX, int rows, int cols) {
        super("\nНекорректная размерность массива!\nМассив должен иметь рамер: " + validY + "x" + validX + "\nРазмер текущего массива: " + rows + "x" + cols);
    }
}
