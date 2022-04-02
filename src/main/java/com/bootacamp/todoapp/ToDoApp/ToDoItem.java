package com.bootacamp.todoapp.ToDoApp;

import lombok.Data;

import java.util.Date;

@Data
public class ToDoItem {
    private String text;
    private Date dateCreated;
}
