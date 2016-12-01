package com.example.controllers;

import com.example.exceptions.WorkerNotFound;
import com.example.services.Page;
import com.example.services.Worker;
import com.example.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

//    @RequestMapping(
//            value = "/api/workers",
//            params = {"page", "size"},
//            produces = "application/json",
//            method = RequestMethod.GET)
//    public Page getWorkersByPage(@RequestParam(value="page") int page,
//                                 @RequestParam(value="size") int size) {
//        return workerService.findAllWorkersByPage(page, size);
//    }

//    @RequestMapping(
//            value = "/api/workers/{character}",
//            produces = "application/json",
//            method = RequestMethod.GET)
//    public List<Worker> getWorkersOnChar(@PathVariable String character) {
//
//        List<Worker> workerList = workerService.findAllWorkers()
//                .stream()
//                .filter(filteredWorker -> filteredWorker.getName().startsWith(character))
//                .collect(Collectors.toList());
//
//            return workerList;
//    }

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