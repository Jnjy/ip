package command;

import storage.TaskList;

/**
 * Class use to handle command: view task list.
 * Allows user to view the task list.
 */
public class ListCommand extends Command {
    @Override
    public String execute(TaskList tasks) {
        if (tasks.numOfTask() == 0) {
            return "List is empty";
        }
        return tasks.getTaskList();
    }
}
