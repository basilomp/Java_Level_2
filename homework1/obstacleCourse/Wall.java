package ru.geekbrains.java.javaone.homework1.obstacleCourse;

import ru.geekbrains.java.javaone.homework1.contestants.Contestant;

//Создаём класс "стена", внедряющий функциональность интерфейса "препятствие"
public class Wall implements Obstacle{
    //Инициализируем целочисленную константу для высоты
    private final int height;

    //Создаем конструктор класса
    public Wall(int height){
        this.height = height;
    }

    //Переопределяем метод проверки прохождения препятствия
    @Override
    public boolean result(Contestant contestant) {
        if (contestant.jump() >= height) {
            System.out.println("Участник перепрыгнул препятствие.");
            return true;
    }   else {
            System.out.println("Участник не сумел перепрыгнуть препятствие.");
            return false;}
}
}
