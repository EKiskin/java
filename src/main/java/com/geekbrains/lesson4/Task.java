package com.geekbrains.lesson4;

public class Task {
    private int id;
    private String name;
    private String owner;
    private String executor;
    private String description;
    private String status;

    public Task() {
        id = 0;
    }

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Task(int id, String name, String owner, String executor, String description, String status) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.executor = executor;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name+": "+description;
    }
}
