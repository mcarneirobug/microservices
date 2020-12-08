package com.microservice.hrpayroll.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Worker implements Serializable {

    private static final long serialVersionUID = -2170372414320003375L;

    private Long id;

    private String name;

    private Double dailyIncome;

}
