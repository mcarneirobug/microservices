package com.microservice.hrworker.modules.worker.service;

import com.microservice.hrworker.modules.worker.response.WorkerResponse;
import javassist.NotFoundException;

import java.util.List;

public interface WorkerService {

    List<WorkerResponse> findAll();

    WorkerResponse getById(Long id) throws NotFoundException;

}
