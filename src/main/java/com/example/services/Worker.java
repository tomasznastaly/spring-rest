package com.example.services;

public class Worker {
    private int id;
    private String name;
    private String type;
    private String office;
    private int salary;

    public Worker(int id, String name, String type, String office, int salary) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.office = office;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

}
