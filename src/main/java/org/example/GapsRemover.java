package org.example;
import java.io.*;

public class GapsRemover {
    public void removeGaps(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            File file = new File("changed_file.txt");
            String filename2 = file.getName();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename2))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    line = line.replaceAll("\\s+", " ");
                    writer.write(line);
                    writer.newLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
