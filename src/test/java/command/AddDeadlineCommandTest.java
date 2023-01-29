package command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import storage.TaskList;

public class AddDeadlineCommandTest {

    private TaskList tasks;

    @BeforeEach
    public void init() {
        this.tasks = new TaskList();
    }

    @Test
    public void deadlineTest() {
        Command addDeadlineTest = new AddDeadlineCommand("deadline test /by 2023-01-29");
        addDeadlineTest.execute(tasks);
        String expected = "[D][ ] test (by: Jan 29 2023)";
        assertEquals(expected, tasks.getTask(0).toString());
    }

}
