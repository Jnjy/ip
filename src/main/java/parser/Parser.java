package parser;

import command.*;
import dukeException.*;
import storage.TaskList;

public class Parser {

    private final String request;
    private final TaskList tasks;
    private String response;

    /**
     * Constructor for Parser.Request class
     * @param request request by the user
     * @param tasks task array to store the tasks added by the user
     */
    public Parser(String request, TaskList tasks) {
        this.request = request;
        this.tasks = tasks;
        processRequest();
    }

    /**
     * Function to process the user's request and get the response
     */
    public Command processRequest() {
        String[] req = this.request.split(" ");
        String command = req[0];
        switch (command) {
            case "list":
                return new ListCommand();
            case "mark":
                return new MarkCommand(this.request);
            case "unmark":
                return new UnmarkCommand(this.request);
            case "todo":
                return new AddTodoCommand(this.request);
            case "deadline":
                return new AddDeadlineCommand(this.request);
            case "event":
                return new AddEventCommand(request);
            case "delete":
                return new RemoveCommand(request);
            default:
                throw new UnknownCommandException();
        }
    }

    @Override
    public String toString() {
        return response;
    }
}
