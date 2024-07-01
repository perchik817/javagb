package seminars.lesson001.impl;

import seminars.lesson001.Product;

import java.time.LocalDate;

public class WaterBottle extends Product {
    private float volume;
    private String pack;
    private boolean isSparkled;

    public WaterBottle(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.volume = 1;
        this.pack = Package.PLASTIC.getMaterial();
        this.isSparkled = false;
    }

    public WaterBottle(String name, double price, LocalDate releaseDate, float volume, String pack, boolean isSparkled) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.pack = pack;
        this.isSparkled = false;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSparkled() {
        return isSparkled;
    }

    @Override
    public String toString() {
        return "WaterBottle{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSparkled=" + isSparkled +
                '}';
    }
}
