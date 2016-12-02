package com.example.controllers;

import com.example.services.Worker;
import com.example.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    public WorkerController() {}

    @RequestMapping(
            value = "/api/workers",
            produces = "application/json",
            method = RequestMethod.GET)
    public List<Worker> getWorkers() {
        return workerService.findAll();
    }

    @RequestMapping(
            value = "/api/workers/{id}",
            produces = "application/json",
            method = RequestMethod.GET)
    public Worker getWorker(@PathVariable Long id) {
        return workerService.findOne(id);
    }

    @RequestMapping(
            value = "/api/workers/",
            produces = "application/json",
            consumes = "application/json",
            method = RequestMethod.POST)
    public Worker createWorker(@RequestBody Worker worker) {
        return workerService.create(worker);
    }

    @RequestMapping(
            value = "/api/workers/{id}",
            produces = "application/json",
            consumes = "application/json",
            method = RequestMethod.PUT)
    public Worker updateWorker(@RequestBody Worker worker) {
        return workerService.update(worker);
    }

//    @RequestMapping(
//            value = "/api/workers/{id}",
//            produces = "application/json",
//            method = RequestMethod.GET)
//    public Worker getWorker(@PathVariable int id) {
//        Optional<Worker> worker = workers
//                .stream()
//                .filter(filteredWorker -> filteredWorker.getId() == id)
//                .findFirst();
//
//        if (worker.isPresent()) {
//            return worker.get();
//        } else {
//            throw new WorkerNotFound(String.format("Worker with id %d not found", id));
//        }
//    }
}