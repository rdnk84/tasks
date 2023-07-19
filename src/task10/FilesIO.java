package task10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FilesIO {

    public static void main(String[] args) {
//        stringsList();
        writeToFile("I think the real answer is that it completely depends on what your inputs look like. I created a JsFiddle to try a bunch of these and a couple of my own against various inputs. No matter how I look at the results, I see no clear winner.");
//        writeFromTwoFiles();
//       changesInText();
//        String str = "The story of 10?//]]-= beautiful Snow White, the seven dwarfs and the evil Queen.";
//        String newStr = str.replaceAll("[^A-Za-zА-Яа-я0-9]", "\\$");
//        System.out.println(newStr);
    }

    public static List<String> stringsList(ArrayList<String> strArr) {
        try (BufferedReader reader = new BufferedReader(new FileReader("files/texts.txt"))) {
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
        byte[] inputBytes = inputText.getBytes(StandardCharsets.UTF_8);
        try (OutputStream os = new FileOutputStream("files/fileToWrite.txt") {
        }) {
            os.write(inputBytes);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeFromTwoFiles() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/newFileToWrite.txt", true));
             BufferedReader reader1 = new BufferedReader(new FileReader("files/inputFile1.txt")); BufferedReader reader2 = new BufferedReader(new FileReader("files/inputFile2.txt"))) {
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
        try (BufferedReader reader = new BufferedReader(new FileReader("files/texts.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("files/fileToWrite.txt"))) {
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
