package ru.geekbrains.java.javaone.homework1.championship;

import ru.geekbrains.java.javaone.homework1.contestants.Bot;
import ru.geekbrains.java.javaone.homework1.contestants.Cat;
import ru.geekbrains.java.javaone.homework1.contestants.Contestant;
import ru.geekbrains.java.javaone.homework1.contestants.Human;
import ru.geekbrains.java.javaone.homework1.obstacleCourse.Track;
import ru.geekbrains.java.javaone.homework1.obstacleCourse.Wall;

import java.util.Random;

public class ContestApp {
    public static void main(String[] args) {

        //Создаем экземпляр класс "соревнование" и запускаем его
        Contest contest = createContest();
        contest.start();
    }


    //Создаем метод для сборки трассы с препятствиями
    private static Contest createContest() {

        //Импортируем класс и создаем его экземпляр для генерации случайных значений параметров препятствий
        Random random = new Random();

        //Создаем участников
        Contestant bot = new Bot("HK-47", 2000, 2);
        Contestant cat = new Cat("Андрюха", 100, 4);
        Contestant human = new Human("Эдуардо", 700, 5);

        //Создаем препятствия
        Track track = new Track(random.nextInt(2500));
        Wall wall = new Wall(random.nextInt(4));

        //Создаем соревнование и собираем в него все созданные экземпляры класса.
        Contest contest = new Contest();
        contest.setContestantArray(bot, cat, human);
        contest.setObstacleArray(track, wall);
        return contest;
    }

    }

