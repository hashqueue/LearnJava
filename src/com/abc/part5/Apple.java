package com.abc.part5;

public class Apple {
    private String color;
    private double price;

    public Apple(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * @return String
     */
    @Override
    public String toString() {
        return "水果市场里的" + color + "的苹果的价格是每斤" + price + "元。";
    }
}
