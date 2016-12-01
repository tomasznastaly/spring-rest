package com.example.services;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Worker {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;
    private String office;
    private int salary;

    public Worker() {}

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Long getId() {
        return id;
    }

    public String getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

}
