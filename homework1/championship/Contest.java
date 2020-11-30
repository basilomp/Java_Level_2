package ru.geekbrains.java.javaone.homework1.championship;

import ru.geekbrains.java.javaone.homework1.contestants.Contestant;
import ru.geekbrains.java.javaone.homework1.obstacleCourse.Obstacle;

//Создаем класс для подготовки соревнования
public class Contest {
    private Contestant[] contestantArray; //Создаем массив участников
    private Obstacle[] obstacleArray; //Создаем массив препятствий


    public void setContestantArray(Contestant... contestantArray) {
        this.contestantArray = contestantArray;
    }

    public void setObstacleArray(Obstacle... obstacleArray) {
        this.obstacleArray = obstacleArray;
    }

    //Создаем метод для прохождения препятствия каждым участником и возвращения результата
    private boolean pass(Contestant contestant) {
        for (Obstacle obstacle : obstacleArray) {
            if (!contestant.attemptResult(obstacle))
                return false;
        }
        return true;
    }

    //Создаем метод для вывода информации
    public void start() {
        for (Contestant contestant : contestantArray) {
            boolean win = pass(contestant);
            if (win)
                System.out.println("Участник успешно прошел все испытания.");
            else
                System.out.println("Участник сошел с дорожки.");
            
        }
    }
}
