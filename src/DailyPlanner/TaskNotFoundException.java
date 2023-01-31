package DailyPlanner;

public class TaskNotFoundException extends Exception {
    public TaskNotFoundException(Integer taskId) {
        super("Задача с id " + taskId + " не найдена.");
    }
}
