package edu.escuelaing.ieti.dto;
public class TaskDto {
    private String name;
    private String description;
    private String assignedTo;
    private String dueDate;
    private String created;
    private Status status;
    enum Status{
        TODO, DOING, REVIEW, DONE
    }
    public TaskDto(String name, String description, String assignedTo, String dueDate, String created) {
        this.name = name;
        this.description = description;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = created;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}