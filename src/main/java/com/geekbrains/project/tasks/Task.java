package com.geekbrains.project.tasks;

public class Task {
    public enum Status {
        OPENED("открыта", 1),
        IN_WORK("в работе", 2),
        CLOSED("закрыта", 3);
        private String name;
        private int order;
        Status(String name, int order){
            this.name = name;
            this.order = order;
        }

        @Override
        public String toString() {
            return name;
        }

        public String getName() {
            return name;
        }

        public int getOrder() {
            return order;
        }
    }
    private int id;
    private String name;
    private String owner;
    private String executor;
    private String description;
    private Status status;

    public Task() {
        id = 0;
    }

    public Task(int id, String name, Status status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Task(int id, String name, String owner, String executor, String description, Status status) {
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

   public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "id="+id+" name="+name+" status="+status;
    }
}
