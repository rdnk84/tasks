package task10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FilesIO {

    public static void main(String[] args) {
//        stringsList();
//        writeToFile("Ещё один метод для получения текущего времени это System.nanoTime()");
//        writeFromTwoFiles();
       changesInText();
//        String str = "The story of 10?//]]-= beautiful Snow White, the seven dwarfs and the evil Queen.";
//        String newStr = str.replaceAll("[^A-Za-zА-Яа-я0-9]", "\\$");
//        System.out.println(newStr);
    }

    public static List<String> stringsList() {
        List<String> strArr = new ArrayList<>();
        File file = new File("files/texts.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                String[] strings = input.split(" ");
                for (String string : strings) {
                    strArr.add(string);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(strArr);
        return strArr;
    }

    public static void writeToFile(String inputText) {
        File file = new File("files/fileToWrite.txt");
        byte[] inputBytes = inputText.getBytes(StandardCharsets.UTF_8);
        try (OutputStream os = new FileOutputStream(file) {
        }) {
            os.write(inputBytes);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeFromTwoFiles() {
        File file1 = new File("files/inputFile1.txt");
        File file2 = new File("files/inputFile2.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/newFileToWrite.txt", true));
             BufferedReader reader1 = new BufferedReader(new FileReader(file1)); BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
            String input1;
            while ((input1 = reader1.readLine()) != null) {
                writer.write(input1);
            }
            String input2;
            while ((input2 = reader2.readLine()) != null) {
                writer.newLine();
                writer.write(input2);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void changesInText() {
        File file = new File("files/texts.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file)); BufferedWriter writer = new BufferedWriter(new FileWriter("files/fileToWrite.txt"))) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
                String changedText = input.replaceAll("[^A-Za-zА-Яа-я0-9]", "\\$");
                writer.write(changedText);
                System.out.println(changedText);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        ;
    }
}
