package com.example.ex_1;

import java.util.Date;

public class ToDO {
    private String title;
    private String description;
    private int priority;
    private Date dueDate;

    ToDO(String title, String description, int priority, Date dueDate) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDueDate() {
        return dueDate;
    }
}
