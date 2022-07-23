package dev.lucasgrey.tdd.impl;

import dev.lucasgrey.tdd.PaymentService;
import dev.lucasgrey.tdd.model.PaymentModel;

import java.util.UUID;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public PaymentModel CreatePayment(Float paymentAmount) {
        //Validate
        if (paymentAmount < 1f) {
            throw new IllegalArgumentException("Payment amount cannot be zero!");
        }

        PaymentModel paymentModel = new PaymentModel();
        paymentModel.setPaymentAmount(paymentAmount);
        paymentModel.setPaymentId(UUID.randomUUID().toString());
        return paymentModel;
    }

}
