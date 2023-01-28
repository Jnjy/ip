package task;

public class Todo extends Task {

    /**
     * Constructor to create new task
     *
     * @param task new task to be added
     */
    public Todo(String task) {
        super(task);
    }

    /**
     * Convert the Todo task into data from for storage into file.
     * @return String representation of the data.
     */
    public String toData() {
        String status = this.completed ? "1" : "0";
        return "T | " + status + " |" + this.task;
    }

    @Override
    public String toString() {
        String statusIcon = this.completed ? "X" : " ";
        return "[T][" + statusIcon + "]" + this.task;
    }
}