package dev.lucasgrey.tdd;

import dev.lucasgrey.tdd.impl.PaymentServiceImpl;
import dev.lucasgrey.tdd.model.PaymentModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PaymentServiceTest {

    private static PaymentService paymentService;

    @BeforeAll
    static void setup() {
        paymentService = new PaymentServiceImpl();
    }

    @Test
    public void createPaymentSuccess() {
        Float testAmount = 1f;
        PaymentModel res = paymentService.CreatePayment(testAmount);
        Assertions.assertNotNull(res);
        Assertions.assertEquals(res.getPaymentAmount(), testAmount);
        Assertions.assertNotNull(res.getPaymentId());
        Assertions.assertFalse(res.getPaymentId().isEmpty());
    }

    @Test
    public void paymentAmountCannotBeZero() {
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () -> paymentService.CreatePayment(0f));
        Assertions.assertEquals("Payment amount cannot be zero!", ex.getMessage());
    }



}
