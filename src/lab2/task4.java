package  lab2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        String sourceFileName = args[0];
        String targetFileName = args[1];
        String oldStr = args[2];
        String newStr = args[3];

        try {
            Scanner input = new Scanner(new File(sourceFileName));

            PrintWriter output = new PrintWriter(targetFileName);

            while (input.hasNextLine()) {
                String line = input.nextLine();

                String modifiedLine = line.replaceAll(oldStr, newStr);

                output.println(modifiedLine);
            }


            input.close();
            output.close();

            System.out.println("Replacement complete.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
