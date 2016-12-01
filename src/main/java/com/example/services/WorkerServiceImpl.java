package com.example.services;
import com.example.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.apache.catalina.security.SecurityUtil.remove;

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

    public Worker create(Worker worker) {
        if (worker.getId() != null) {
            return null;
        }

        Worker savedWorker = workerRepository.save(worker);
        return savedWorker;
    }

    public Worker update(Worker worker) {
        Worker workerPersisted = findOne(worker.getId());
        if (workerPersisted == null) {
            return null;
        }

        Worker updatedWorker = workerRepository.save(worker);
        return updatedWorker;
    }

    public void delete(Long id) {
        workerRepository.delete(id);
    }
}
