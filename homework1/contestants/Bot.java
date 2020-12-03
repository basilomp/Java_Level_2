package ru.geekbrains.java.javaone.homework1.contestants;

//Создаём класс "робот", внедряющий функциональность интерфейса "участник соревнования"
public class Bot implements Contestant {

    //Инициализируем переменные, которые передадутся в конструктор класса
    private final String name;
    private final int runLength;
    private final int jumpHeight;

    //Создаем конструктор класса
    public Bot(String name, int runLength, int jumpHeight) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int run() {
        System.out.println("Робот " + this.name + " пытается пробежать " + this.runLength + " м.");;
        return runLength;
    }

    @Override
    public int jump() {
        System.out.println("Робот " + this.name + " пытается прыгнуть на высоту " + this.jumpHeight + " м.");
        return jumpHeight;
    }
}
