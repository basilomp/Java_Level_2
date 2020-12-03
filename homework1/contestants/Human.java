package ru.geekbrains.java.javaone.homework1.contestants;

//Создаём класс "человек", внедряющий функциональность интерфейса "участник соревнования"
public class Human implements Contestant{

    //Инициализируем переменные, которые передадутся в конструктор класса
    private final String name;
    private final int runLength;
    private final int jumpHeight;

    //Создаем конструктор класса
    public Human(String name, int runLength, int jumpHeight) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }
    @Override
    public int run() {
        System.out.println("Человек " + name + " пытается пробежать " + runLength + " м.");
        return runLength;
    }

    @Override
    public int jump() {
        System.out.println("Человек " + name + " пытается прыгнуть на высоту " + jumpHeight + " м.");
        return jumpHeight;
    }
}
