package com.microservice.hrpayroll.modules.payment.services.impl;

import com.microservice.hrpayroll.model.Payment;
import com.microservice.hrpayroll.modules.payment.services.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }
}
