package ru.geekbrains.java.javaone.homework1.obstacleCourse;

import ru.geekbrains.java.javaone.homework1.contestants.Contestant;

//Создаём класс "беговая дорожка", внедряющий функциональность интерфейса "препятствие"
public class Track implements Obstacle{
    //Инициализируем целочисленную константу для длины дорожки
    private final int length;

    //Создаём конструктор класса
    public Track(int length) {
    this.length = length;
}
    //Переопределяем метод проверки прохождения препятствия
    @Override
    public boolean result(Contestant contestant) {
        if (contestant.run() >= length) {
            System.out.println("Участник успешно преодолел дистанцию!");
            return true;
        }
        else {
            System.out.println("Участник сошел с беговой дорожки.");
            return false;
        }
    }
}
