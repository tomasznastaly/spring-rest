package com.example.controllers;

import com.example.services.Worker;
import com.example.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Worker> getWorkersByPage(Pageable pageable) {
        Page<Worker> workerPage = workerService.findAll(pageable);
        return workerPage;
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

    @RequestMapping(
            value = "/api/workers/{id}",
            method = RequestMethod.DELETE)
    public void deleteWorker(@PathVariable Long id) {
        workerService.delete(id);
    }

//    @RequestMapping(
//            value = "/api/work ers/{id}",
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