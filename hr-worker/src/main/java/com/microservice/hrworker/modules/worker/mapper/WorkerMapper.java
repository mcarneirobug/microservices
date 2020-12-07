package com.microservice.hrworker.modules.worker.mapper;

import com.microservice.hrworker.model.Worker;
import com.microservice.hrworker.modules.worker.request.WorkerRequest;
import com.microservice.hrworker.modules.worker.response.WorkerResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WorkerMapper {

    public static WorkerResponse toResponse(final Worker worker) {

        final var workerResponse = new WorkerResponse();
        workerResponse.setId(worker.getId());
        workerResponse.setName(worker.getName());
        workerResponse.setDailyIncome(worker.getDailyIncome());

        return workerResponse;
    }

    public static Worker to(final WorkerRequest workerRequest) {

        final var worker = new Worker();
        worker.setName(workerRequest.getName());
        worker.setDailyIncome(workerRequest.getDailyIncome());

        return worker;
    }
}
