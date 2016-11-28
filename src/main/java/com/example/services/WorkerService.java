package com.example.services;
import java.util.ArrayList;

public interface WorkerService {
    ArrayList<Worker> findAllWorkers();
    Page findAllWorkersByPage(int page, int size);
    Worker findById(int id);
}
