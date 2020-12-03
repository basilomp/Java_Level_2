package ru.geekbrains.java.javaone.homework1.contestants;

//Создаём класс "кот", внедряющий функциональность интерфейса "участник соревнования"

public class Cat implements Contestant {

    //Инициализируем переменные, которые передадутся в конструктор класса
    private final String name;
    private final int runLength;
    private final int jumpHeight;

    //Создаем конструктор класса
    public Cat(String name, int runLength, int jumpHeight) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int run() {
        System.out.println("Кот " + this.name + " пытается пробежать " + runLength + " м.");
        return runLength;
    }

    @Override
    public int jump() {
        System.out.println("Кот " + this.name + " пытается прыгнуть на высоту " + jumpHeight + " м.");
        return jumpHeight;
    }
}
