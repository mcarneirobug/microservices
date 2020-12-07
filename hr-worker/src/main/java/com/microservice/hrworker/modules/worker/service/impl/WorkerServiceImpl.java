package com.microservice.hrworker.modules.worker.service.impl;

import com.microservice.hrworker.modules.worker.mapper.WorkerMapper;
import com.microservice.hrworker.modules.worker.response.WorkerResponse;
import com.microservice.hrworker.modules.worker.service.WorkerService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public List<WorkerResponse> findAll() {

        final var worker = this.workerRepository.findAll();

        return worker
                .stream()
                .map(WorkerMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public WorkerResponse getById(Long id) throws NotFoundException {

        final var worker = this.workerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Error: Não foi encontrado um Worker para o Id informado."));

        return WorkerMapper.toResponse(worker);
    }
}
