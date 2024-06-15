import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String name, String description) {
        Task newTask = new Task(nextId++, name, description);
        tasks.add(newTask);
        System.out.println("Task added successfully: " + newTask);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void updateTask(int id, String name, String description) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setName(name);
                task.setDescription(description);
                System.out.println("Task updated successfully: " + task);
                return;
            }
        }
        System.out.println("Task with id " + id + " not found.");
    }

    public void deleteTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                System.out.println("Task deleted successfully: " + task);
                return;
            }
        }
        System.out.println("Task with id " + id + " not found.");
    }
}
