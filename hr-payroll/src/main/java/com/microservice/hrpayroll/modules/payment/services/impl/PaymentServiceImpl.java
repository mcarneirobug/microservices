package com.microservice.hrpayroll.modules.payment.services.impl;

import com.microservice.hrpayroll.model.Payment;
import com.microservice.hrpayroll.model.Worker;
import com.microservice.hrpayroll.modules.payment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Payment getPayment(long workerId, int days) {

        Map<String, String> uriVariable = new HashMap<>();
        uriVariable.put("id", ""+workerId);

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariable);

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
