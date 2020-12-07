package com.microservice.hrworker.modules.worker.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerRequest implements Serializable {

    private static final long serialVersionUID = -2334093518424780089L;

    private String name;

    private Double dailyIncome;

}
