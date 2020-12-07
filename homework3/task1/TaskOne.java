package ru.geekbrains.java2.homework3.task1;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.


import java.util.*;

public class TaskOne {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("position");
        wordList.add("miscreant");
        wordList.add("wring");
        wordList.add("exultant");
        wordList.add("elated");
        wordList.add("miscreant");
        wordList.add("authority");
        wordList.add("exultant");
        wordList.add("wring");
        wordList.add("remake");
        wordList.add("remake");
        wordList.add("spend");
        wordList.add("miscreant");
        wordList.add("elated");
        wordList.add("wring");
        wordList.add("wandering");
        wordList.add("remake");
        wordList.add("nation");
        wordList.add("wring");
        wordList.add("elated");

        Set<String> wordSet = new TreeSet<>(wordList);
        System.out.println(wordSet);
        for (String word : wordSet) {
            System.out.println(word + ": " + Collections.frequency(wordList, word));

        }


    }
}