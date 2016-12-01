package com.example.services;
import com.example.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> findAll() {
        Iterable<Worker> workers = workerRepository.findAll();
        List<Worker> tempWorkers = new ArrayList<>();
        workers.forEach(worker -> tempWorkers.add(worker));
        return tempWorkers;
    }

    public Worker findOne(Long id) {
        Worker worker = workerRepository.findOne(id);
        return worker;
    }
}
