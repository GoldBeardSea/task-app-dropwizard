package server.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TasksObj {
    private String id;
    private String taskInfo;
    private String date;
    private Boolean completed;

    public TasksObj(){}

    public TasksObj(String id, String taskString, String date, Boolean completed) {
        this.id = id;
        this.taskInfo = taskString;
        this.date = date;
        this.completed = completed;
    }

    @JsonProperty
    public String getId() {
        return id;
    }

    @JsonProperty
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty
    public String getTaskInfo() {
        return taskInfo;
    }

    @JsonProperty
    public void setTaskInfo(String taskInfo) {
        this.taskInfo = taskInfo;
    }

    @JsonProperty
    public String getDate() {
        return date;
    }

    @JsonProperty
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty
    public Boolean getCompleted() {
        return completed;
    }

    @JsonProperty
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", Task=" + taskInfo + ", Date ="
                + date + ", completed=" + completed + "]";
    }
}
