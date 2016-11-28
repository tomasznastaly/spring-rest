package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
public class WorkersController {

    ArrayList<Worker> workers;

    public WorkersController() {
        this.workers = new ArrayList<Worker>();
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
    }

    @RequestMapping(
            value = "/api/workers",
            produces = "application/json",
            method = RequestMethod.GET)
    public List<Worker> getWorkers() {
        return workers;
    }

    @RequestMapping(
            value = "/api/workers/{character}",
            produces = "application/json",
            method = RequestMethod.GET)
    public List<Worker> getWorkersOnChar(@PathVariable String character) {
        List<Worker> workerList = workers
                .stream()
                .filter(filteredWorker -> filteredWorker.getName().startsWith(character))
                .collect(Collectors.toList());

            return workerList;
    }

    @RequestMapping(
            value = "/api/workers/{id}",
            produces = "application/json",
            method = RequestMethod.GET)
    public Worker getWorker(@PathVariable int id) {
        Optional<Worker> worker = workers
                .stream()
                .filter(filteredWorker -> filteredWorker.getId() == id)
                .findFirst();

        if (worker.isPresent()) {
            return worker.get();
        } else {
            throw new WorkerNotFound(String.format("Worker with id %d not found", id));
        }
    }
}