package com.example.services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public interface WorkerService {
    List<Worker> findAllWorkers();
    Worker findOne(Long id);
    Worker create(Worker worker);
    Worker update(Worker worker);
    void delete (Long id);
    Page<Worker> findAll(Pageable pageable);
}
