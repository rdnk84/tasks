package task10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FilesIO {

    public static void main(String[] args) {
        String pathToWrite1 = "files/fileToWrite.txt";
        String pathToWrite2 = "files/newFileToWrite.txt";

        String pathToRead = "files/texts.txt";
        String pathInputFile1 = "files/inputFile1.txt";
        String pathInputFile2 = "files/inputFile2.txt";

        String text = "I think the real answer is that it completely depends on what your inputs look like.";


//        stringsList();
        writeToFile(text, pathToWrite1);
//        writeFromTwoFiles();
//       changesInText();
//        String str = "The story of 10?//]]-= beautiful Snow White, the seven dwarfs and the evil Queen.";
//        String newStr = str.replaceAll("[^A-Za-zА-Яа-я0-9]", "\\$");
//        System.out.println(newStr);
    }

    public static List<String> stringsList(ArrayList<String> strArr, String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
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

    public static void writeToFile(String inputText, String path) {
        byte[] inputBytes = inputText.getBytes(StandardCharsets.UTF_8);
        try (OutputStream os = new FileOutputStream(path) {
        }) {
            os.write(inputBytes);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeFromTwoFiles(String inputPath1, String inputPath2, String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath, true));
             BufferedReader reader1 = new BufferedReader(new FileReader(inputPath1)); BufferedReader reader2 = new BufferedReader(new FileReader(inputPath2))) {
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

    public static void changesInText(String inputPath, String outputPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath)); BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
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
