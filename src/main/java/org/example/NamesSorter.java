package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class NamesSorter {
    public void sortNames(String filename) {
        ArrayList<String> names = new ArrayList<>();
        String filename2 = "sorted_names.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] splitNames = line.split(",");
                for (String name : splitNames) {
                    names.add(name.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // сортируем список с именами
        Collections.sort(names);

        // записываем отсротированные имена в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename2))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
