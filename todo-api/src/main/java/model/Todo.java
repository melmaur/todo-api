package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean completed;

    // Empty constructor required by JPA
    public Todo() {}

    // Constructor
    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    // Getters
    public Long getId()            { return id; }
    public String getTitle()       { return title; }
    public String getDescription() { return description; }
    public boolean isCompleted()   { return completed; }

    // Setters
    public void setTitle(String title)             { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setCompleted(boolean completed)    { this.completed = completed; }
}
