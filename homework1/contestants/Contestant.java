package ru.geekbrains.java.javaone.homework1.contestants;

import ru.geekbrains.java.javaone.homework1.obstacleCourse.Obstacle;

//Создаем интерфейс "участник соревнования".
public interface Contestant {

    //Инициализируем методы для действий участников (переопределим их в каждом классе участников)
    int run();
    int jump();

    //Создаем методы для выполнения действия
     default boolean attempt(Obstacle obstacle) {
        return obstacle.result(this);
     }

     //и вывода результата
     default boolean attemptResult(Obstacle obstacle) {
         return attempt(obstacle);
         }
    }

