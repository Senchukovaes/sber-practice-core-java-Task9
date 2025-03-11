package org.example;

import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        GapsRemover remover = new GapsRemover();
//        //remover.removeGaps("Borodino.txt");
//
//        NamesSorter sorter = new NamesSorter();
//        //sorter.sortNames("listNames.txt");
//
//        Hero.Weapon sword = new Hero.Weapon( "sword", 13);
//        Hero.Armor leatherArmor = new Hero.Armor("gold", 20);
//
//        Hero hero = new Hero("Stiven", 10, sword, leatherArmor);
//
//        // сохраняем объект в файл
//        try {
//            // открываем потоки
//            FileOutputStream fileOut = new FileOutputStream("hero.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            // записываем объект в файл
//            out.writeObject(hero);
//            // закрываем потоки
//            out.close();
//            fileOut.close();
//
//            System.out.println("Объект сохранён в файл hero.ser");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // загрузка объекта из файла
        try {
            // открываем потоки для чтения из файла
            FileInputStream fileIn = new FileInputStream("hero.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            // восстанавливаем объет из файла
            Hero hero = (Hero) in.readObject();
            // закрываем потоки
            in.close();
            fileIn.close();

            System.out.println("Объект восстановлен" + hero);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}