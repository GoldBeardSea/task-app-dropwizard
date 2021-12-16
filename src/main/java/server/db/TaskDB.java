package server.db;

import server.core.TasksObj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TaskDB {

    public static HashMap<String, TasksObj> tasks = new HashMap<>();
    static{
        tasks.put("1", new TasksObj("1", "Learn React", "12-16-2021", false));
        tasks.put("2", new TasksObj("2", "Go For a Walk", "12-16-2021", false));
        tasks.put("3", new TasksObj("3", "Think of Refactoring", "12-16-2021", false));
    }

    public static List<TasksObj> getTasks(){
        return new ArrayList<TasksObj>(tasks.values());
    }

    public static TasksObj getTask(String id){
        return tasks.get(id);
    }

    public static TasksObj createTask(TasksObj task) {
        tasks.put(task.getId(), task);
        return task;
    }

    public static void updateTask(Boolean completed, TasksObj task){
        task.setCompleted(completed);
        tasks.put(task.getId(), task);
    }

    public static void removeTask(String id){
        tasks.remove(id);
    }
    
}
