package ru.geekbrains.java.javaone.homework1.obstacleCourse;

import ru.geekbrains.java.javaone.homework1.contestants.Contestant;

//Создаем общий интерфейс для препятствий
public interface Obstacle {
    //Метод для проверки прохождения препятствия
    boolean result (Contestant contestant);
}
