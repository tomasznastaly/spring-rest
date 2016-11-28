package com.example.services;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class WorkerServiceImpl implements WorkerService {
    private ArrayList<Worker> workers;

    public ArrayList<Worker> findAllWorkers() {
        return workers;
    }

    public Page findAllWorkersByPage(int page, int pageSize) {
        int size = workers.size();
        Double numberOfPages = Math.ceil(size/pageSize);
        int numberOfPagesAsInt = numberOfPages.intValue();
        ArrayList<Worker> workersOnPage = new ArrayList<>();
        for (int i = 0; i < size; i++) {

        }
        return new Page(page, pageSize, workersOnPage, numberOfPagesAsInt);
    }

    public Worker findById(int id) {
        for (Worker worker : workers){
            if (worker.getId() == id){
                return worker;
            }
        }
        return null;
    }

    @PostConstruct
    private void setUp() {
        workers = populateDummyWorkers();
    }

    private ArrayList<Worker> populateDummyWorkers() {
        ArrayList<Worker> workers = new ArrayList<Worker>();
        workers.add(new Worker(1, "Ksawery", "P", "GL", 210));
        workers.add(new Worker(2, "Bartosz", "M", "GD", 230));
        workers.add(new Worker(3, "Sebasian", "M", "GL", 280));
        workers.add(new Worker(4, "Piotr", "P", "GL", 290));
        workers.add(new Worker(5, "Damian", "P", "GD", 270));
        workers.add(new Worker(6, "Wojtek", "P", "GD", 290));
        workers.add(new Worker(7, "Jan", "M", "GD", 210));
        workers.add(new Worker(8, "Mateusz", "P", "KO", 220));
        workers.add(new Worker(9, "Weronika", "P", "GD", 250));
        workers.add(new Worker(10, "Gabriela", "P", "GD", 250));
        workers.add(new Worker(11, "Alina", "M", "KO", 220));
        workers.add(new Worker(12, "Aleksander", "M", "GD", 300));
        workers.add(new Worker(13, "Krzysztof", "M", "GD", 240));
        workers.add(new Worker(14, "Marcin", "P", "KO", 240));
        workers.add(new Worker(15, "Agata", "P", "KO", 230));
        workers.add(new Worker(16, "Magda", "M", "GL", 210));

        return workers;
    }
}
