package ru.geekbrains.homework2;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(String value, int y, int x) {
        super("\nНекорректный тип данных.\nЗначение: '" + value + "'\nИндекс элемента в массиве: [" + y + "][" + x + "]");

    }
}