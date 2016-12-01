package com.example.services;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Worker {
    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String office;
    @Column
    private int salary;

    public Worker(Long id, String name, String type, String office, int salary) {
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
