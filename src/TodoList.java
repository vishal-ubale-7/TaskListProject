
import java.util.ArrayList;     //ArrayList and List are used to store a list of tasks.
import java.util.List;
import java.util.Scanner;       //Scanner is used to take user input from the keyboard.



public class TodoList           // This is main class.
{
    private List<String> tasks;  //This creates a list named tasks to store multiple task names (as String).

    public TodoList()             // Constructor
    {
        tasks = new ArrayList<>(); //It initializes tasks as a new empty list.
    }

    public void addTask(String task)  // create add method
    {
        tasks.add(task);
    }

    public void removeTask(int index) //This method removes a task from the list by index.
    {
        if (index >= 0 && index<tasks.size())
        {
            tasks.remove(index);
        }
        else
        {
            System.out.println("Invalid index");
        }
    }

    public void listTasks()   //This method prints all tasks.
    {
        System.out.println("Task List:");
        for (int i = 0; i < tasks.size(); i++)
        {
            System.out.println(i + 1 + ". " + tasks.get(i));

        }
    }

    public static void main(String[] args)   // Main Method
    {
        TodoList todoList = new TodoList();   // Create object of TodoList.
        Scanner scanner = new Scanner(System.in); // Create a Scanner to take input from the user.

       while (true)
        {
            // Displays menu options to the user.
            System.out.println("\nChoose an action:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Task");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();     //Reads the user's menu choice
            scanner.nextLine(); // Consume the newline character

            switch (choice)   //Executes different actions depending on the user's choice
            {
                case 1:
                    System.out.println("Enter The Task: ");  // Add the new task
                    String task = scanner.nextLine();
                    todoList.addTask(task);
                    break;

                case 2:
                    System.out.println("Enter the index of task to remove");
                    int index = scanner.nextInt();
                    scanner.nextLine();// Consume the newline character
                    todoList .removeTask(index-1);   //index-1 is used because list index starts from 0.
                    break;

                case 3:
                   todoList.listTasks();  // Calls method to show all current tasks.
                   break;

                case 4:
                    System.out.println("Exiting..."); //Shows exit message and stops the program.
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option"); //If user enters any number other than 1–4, this message is shown.
            }
        }
    }
}


