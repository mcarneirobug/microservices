package com.microservice.hrpayroll.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 6874442986518258930L;

    private String name;

    private Double dailyIncome;

    private Integer days;

    public double getTotal() {
        return days * dailyIncome;
    }

}
