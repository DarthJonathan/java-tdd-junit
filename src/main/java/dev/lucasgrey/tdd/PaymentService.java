package dev.lucasgrey.tdd;

import dev.lucasgrey.tdd.model.PaymentModel;

public interface PaymentService {

    PaymentModel CreatePayment(Float paymentAmount);

}
