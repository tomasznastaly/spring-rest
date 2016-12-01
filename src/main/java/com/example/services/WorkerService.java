package com.example.services;
import java.util.ArrayList;
import java.util.List;

public interface WorkerService {
    List<Worker> findAll();
    Worker findOne(Long id);
}
