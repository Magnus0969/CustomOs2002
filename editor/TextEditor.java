package editor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * A simple console-based text editor.
 */
public class TextEditor {

    public static void runEditor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Simple Text Editor ---");

        while (true) {
            System.out.println("1. Create new file");
            System.out.println("2. Open existing file");
            System.out.println("3. Exit Editor");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    createNewFile(sc);
                    break;
                case 2:
                    openExistingFile(sc);
                    break;
                case 3:
                    System.out.println("Exiting editor...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void createNewFile(Scanner sc) {
        System.out.print("Enter file name (with .txt extension): ");
        String fileName = sc.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Start typing (type 'EXIT' on a new line to save and exit):");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("EXIT")) break;
                writer.write(line + System.lineSeparator());
            }
            System.out.println("File saved as " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    private static void openExistingFile(Scanner sc) {
        System.out.print("Enter file name to open: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        try {
            System.out.println("\n--- File Contents ---");
            Files.lines(file.toPath()).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}