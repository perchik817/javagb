package seminars.lesson001.impl;

import seminars.lesson001.Product;

import java.time.LocalDate;

public class HotBeverage extends Product {
    private int temperature;
    private double volume;
    public HotBeverage(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temperature = 70;
        this.volume = 0.5;
    }
    public HotBeverage(String name, double price, LocalDate releaseDate, int temperature, double volume) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;
    }
    public int getTemperature() {return this.temperature;}
    public double getVolume() {return this.volume;}

    @Override
    public String toString() {
        return "HotBeverage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", temperature=" + temperature +
                ", volume=" + volume +
                '}';
    }
}
