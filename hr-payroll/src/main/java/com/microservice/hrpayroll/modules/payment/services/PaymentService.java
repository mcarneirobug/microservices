package com.microservice.hrpayroll.modules.payment.services;

import com.microservice.hrpayroll.model.Payment;

public interface PaymentService {

    Payment getPayment(long workerId, int days);

}
