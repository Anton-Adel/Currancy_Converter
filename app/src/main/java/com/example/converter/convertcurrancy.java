package com.example.converter;

public class convertcurrancy {
    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    public float convertToDollar() {
        return (float) (amount / 19.8);
    }
    public float convertTopounds() {
        return (float) (amount * 19.8);
    }
}
