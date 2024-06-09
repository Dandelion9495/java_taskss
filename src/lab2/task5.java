package lab2;
import java.io.*;
import java.util.*;

public class task5 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("использование: java Exercise12_11 string filename");
            System.exit(1);
        }
        String stringToRemove = args[0];
        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("файл " + args[1] + " не существует");
            System.exit(2);
        }
        StringBuilder content = new StringBuilder();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String line = input.nextLine();
                content.append(line.replaceAll(stringToRemove, "")).append(System.lineSeparator());
            }
        }
        try (PrintWriter output = new PrintWriter(file)) {
            output.print(content.toString());
        }
    }
}