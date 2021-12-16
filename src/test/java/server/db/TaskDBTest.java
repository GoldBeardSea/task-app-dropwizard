package server.db;

import org.junit.Test;
import server.core.TasksObj;

import static org.junit.Assert.*;

public class TaskDBTest {

    @Test
    public void getTasks() {
        TaskDB.createTask(new TasksObj( "4", "Test", "10-31-2021", false));
        assertEquals(TaskDB.getTasks().size(), 4);
    }

    @Test
    public void getTask() {
    }

    @Test
    public void createTask() {
    }

    @Test
    public void updateTask() {
    }

    @Test
    public void removeTask() {
    }
}