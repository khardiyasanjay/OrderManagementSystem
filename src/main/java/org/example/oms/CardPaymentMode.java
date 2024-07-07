package org.example.oms;

public class CardPaymentMode implements PaymentMode{
    @Override
    public boolean makePayment() {
        return true;
    }
}
