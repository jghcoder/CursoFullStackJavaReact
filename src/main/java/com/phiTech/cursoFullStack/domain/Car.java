package com.phiTech.cursoFullStack.domain;

import jakarta.persistence.*;

@Entity
public class Car {

    @ManyToOne
    @JoinColumn(name = "ownerid")     // nombre de la columna en la tabla car
    private Owner owner;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String brand, model, color, registerNumber;
    private int fecha, price;

    public Car() {
    }

    public Car(long id, String brand, String model, String color, String registerNumber, int fecha, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.fecha = fecha;
        this.price = price;
    }

    public Car(String brand, String model, String color, String registerNumber, int fecha, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.fecha = fecha;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public int getYear() {
        return fecha;
    }

    public void setYear(int year) {
        this.fecha = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
