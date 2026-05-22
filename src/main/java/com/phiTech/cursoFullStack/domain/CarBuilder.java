package com.phiTech.cursoFullStack.domain;

public class CarBuilder {
    private long id;
    private String brand;
    private String model;
    private String color;
    private String registerNumber;
    private int fecha;
    private int price;

    public CarBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }

    public CarBuilder setFecha(int fecha) {
        this.fecha = fecha;
        return this;
    }

    public CarBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public Car createCar() {
        return new Car(id, brand, model, color, registerNumber, fecha, price);
    }
}