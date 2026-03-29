import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Done");
            System.out.println("4. Exit");
            System.out.println("again added that feature");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // 🔥 buffer clear (you mastered this)

            if (choice == 1) {
                System.out.print("Enter task title: ");
                String title = sc.nextLine();

                tasks.add(new Task(title));
            }

            else if (choice == 2) {
                for (int i = 0; i < tasks.size(); i++) {
                    tasks.get(i).displaytask(i);
                }
            }

            else if (choice == 3) {
                System.out.print("Enter task number: ");
                int index = sc.nextInt();

                tasks.get(index).markdone();
            }

            else if (choice == 4) {
                break;
            }
        }
    }
}