package com.todo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoItem {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Boolean complete;

}
