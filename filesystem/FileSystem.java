package filesystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Simulates a basic in-memory file system.
 */
public class FileSystem {
    private static Map<String, File> files = new HashMap<>();

    public static void runFileSystem() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- File System Menu ---");
            System.out.println("1. Create File");
            System.out.println("2. View File");
            System.out.println("3. Edit File");
            System.out.println("4. Delete File");
            System.out.println("5. List Files");
            System.out.println("6. Exit File System");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter file name: ");
                    String name = sc.nextLine();
                    if (files.containsKey(name)) {
                        System.out.println("File already exists.");
                    } else {
                        files.put(name, new File(name));
                        System.out.println("File created successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter file name to view: ");
                    name = sc.nextLine();
                    File fileToView = files.get(name);
                    if (fileToView != null) {
                        System.out.println(fileToView);
                    } else {
                        System.out.println("File not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter file name to edit: ");
                    name = sc.nextLine();
                    File fileToEdit = files.get(name);
                    if (fileToEdit != null) {
                        System.out.println("Enter content to append: ");
                        String content = sc.nextLine();
                        fileToEdit.appendContent(content + "\n");
                        System.out.println("Content added.");
                    } else {
                        System.out.println("File not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter file name to delete: ");
                    name = sc.nextLine();
                    if (files.remove(name) != null) {
                        System.out.println("File deleted.");
                    } else {
                        System.out.println("File not found.");
                    }
                    break;

                case 5:
                    System.out.println("--- File List ---");
                    if (files.isEmpty()) {
                        System.out.println("No files available.");
                    } else {
                        for (String fileName : files.keySet()) {
                            System.out.println("- " + fileName);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting File System...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}