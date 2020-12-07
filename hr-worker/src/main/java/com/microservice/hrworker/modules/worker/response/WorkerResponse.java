package com.microservice.hrworker.modules.worker.response;

import com.microservice.hrworker.modules.worker.request.WorkerRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerResponse extends WorkerRequest {

    private Long id;

}
