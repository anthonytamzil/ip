package chatter.command;

import chatter.Storage;
import chatter.task.Task;
import chatter.TaskList;
import chatter.Ui;

/**
 * Represents a chatter.command.Command class that is responsible for adding a chatter.task.Task object to chatter.TaskList.
 *
 * @author Anthony Tamzil
 * @version CS2103T Individual Project AY2023/24 Semester 1
 */
public class AddCommand extends Command {
    /** chatter.task.Task to be added to the list of Tasks. */
    private Task task;

    /**
     * Constructor for the chatter.command.AddCommand class to add a chatter.task.Task to the list of Tasks.
     *
     * @param task chatter.task.Task object to be added to the list.
     */
    public AddCommand(Task task) {
        this.task = task;
    }

    /**
     * Adds the task to the list of tasks, prints add task message and
     * stores the updated list in the local file.
     *
     * @param tasks chatter.TaskList class storing an ArrayList of chatter.task.Task objects.
     * @param ui chatter.Ui class to handle user interactions.
     * @param storage chatter.Storage class to read and store tasks by the user.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        tasks.addTask(task);
        ui.showAddedTask(task, tasks.getNumOfTasks());
        storage.saveFile(tasks.toStorageString());
    }
}