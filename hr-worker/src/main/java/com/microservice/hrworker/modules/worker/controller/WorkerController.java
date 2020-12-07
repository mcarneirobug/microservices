package com.microservice.hrworker.modules.worker.controller;

import com.microservice.hrworker.modules.worker.response.WorkerResponse;
import com.microservice.hrworker.modules.worker.service.WorkerService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("workers")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @GetMapping
    public List<WorkerResponse> findAllWorkers() {
        return this.workerService.findAll();
    }

    @GetMapping("/{id}")
    public WorkerResponse get(@PathVariable("id") Long id) throws NotFoundException {
        return this.workerService.getById(id);
    }

}
