package com.microservice.hrworker.modules.fake;


import com.microservice.hrworker.model.Worker;
import com.microservice.hrworker.modules.worker.request.WorkerRequest;
import com.microservice.hrworker.modules.worker.response.WorkerResponse;

public class FakeWorker {

    public static Worker generate() {
        final var worker = new Worker();
        worker.setId(1L);
        worker.setName("Worker");
        worker.setDailyIncome(200.0);

        return worker;
    }

    public static WorkerResponse generateWorkerResponse() {
        final var workerResponse = new WorkerResponse();
        workerResponse.setId(1L);
        workerResponse.setName("Worker");
        workerResponse.setDailyIncome(200.0);

        return workerResponse;
    }

    public static WorkerRequest generateWorkerRequest() {
        final var workerRequest = new WorkerRequest();
        workerRequest.setName("Worker");
        workerRequest.setDailyIncome(200.0);

        return workerRequest;
    }
}
