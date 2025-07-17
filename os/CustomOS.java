import java.util.Scanner;

public class CustomOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Custom Operating System 2002 ---");
            System.out.println("1. Scheduler");
            System.out.println("2. File System");
            System.out.println("3. Text Editor");
            System.out.println("4. Calculator");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    scheduler.Scheduler.runScheduler();
                    break;
                case 2:
                    filesystem.FileSystem.runFileSystem();
                    break;
                case 3:
                    editor.TextEditor.runEditor();
                    break;
                case 4:
                    calculator.Calculator.runCalculator();
                    break;
                case 5:
                    System.out.println("Exiting Custom OS. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}