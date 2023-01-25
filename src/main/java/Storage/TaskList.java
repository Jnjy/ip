package Storage;

import Task.Task;
import Task.Todo;
import Task.Event;
import Task.Deadline;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> tasks;

    /**
     * Constructor to create new Task.Task List
     */
    public TaskList() {
        this.tasks = new ArrayList<Task>();
    }

    /**
     * Add new task to current task list
     * @param task new task to be added into the task list
     */
    public void addTask(String task) {
        this.tasks.add(new Task(task));
    }

    /**
     * Add new task to current task list
     * @param task new task to be added into the task list
     * @return the Added Todo
     */
    public Todo addTodo(String task) {
        Todo todo = new Todo(task);
        this.tasks.add(todo);
        return todo;
    }

    /**
     * Add new deadline to current task list
     * @param task new task to be added
     * @param deadline the deadline of the task
     * @return the added Deadline
     */
    public Deadline addDeadline(String task, LocalDate dueDate) {
        Deadline taskDeadline = new Deadline(task, dueDate);
        this.tasks.add(taskDeadline);
        return taskDeadline;
    }

    /**
     * Add new event to current task list
     * @param task event task to be added
     * @param from start time of the event
     * @param to end time of the event
     * @return the added Event
     */
    public Event addEvent(String task, LocalDate from, LocalDate to) {
        Event event = new Event(task, from, to);
        this.tasks.add(event);
        return event;
    }

    /**
     * Get the specific task at given index, idx
     * @param idx Given index of the task in the list
     * @return Task.Task at index, idx
     */
    public Task getTask(Integer idx) {
        return tasks.get(idx);
    }

    /**
     * Delete task at specific index, idx
     * @param idx index of the task in the array to be deleted
     */
    public void deleteTask(Integer idx) {
        this.tasks.remove(idx.intValue());
    }

    /**
     * Getter method to get the task list
     * @return task list
     */
    public String getTaskList() {
        StringBuilder taskList = new StringBuilder();

        for (int i = 1; i <= this.tasks.size(); i++) {
            if (i == this.tasks.size()) {
                taskList.append(i + ": " + this.tasks.get(i - 1));
                break;
            }
            taskList.append(i + ": " + this.tasks.get(i - 1) + "\n");
        }

        return taskList.toString();
    }

    /**
     * Get the number of tasks in the list
     * @return number of tasks
     */
    public int numOfTask() {
        return this.tasks.size();
    }
}
