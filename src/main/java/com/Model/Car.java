package com.Model;

import ORM.Anotations.Column;
import ORM.Anotations.ColumnNotRequired;
import ORM.Anotations.Table;

@Table(name = "cars")
public class Car {

    @Column(name = "serial_num")
    private final int serialNum;

    @Column(name="model")
    private int model;

    @Column(name="brand")
    private String brand;

    @Column(name="make")
    private String make;

    @Column(name="miles")
    private int miles;

    @Column(name="color")
    private String color;

    @Column(name="price")
    private float price;

    @Column(name="owner_id")
    private int ownerId;

    public Car(int serialNum, int model, String brand, String make, String color, int miles, float price, int ownerId) {
        this.serialNum = serialNum;
        this.color = color;
        this.miles = miles;
        this.model = model;
        this.brand = brand;
        this.make = make;
        this.price = price;
        this.ownerId = ownerId;
    }

    public int getSerialNum(){
        return serialNum;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {

        return String.format("%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s\t%10s", serialNum, model, brand, make, miles, color, price, ownerId);
    }
}
