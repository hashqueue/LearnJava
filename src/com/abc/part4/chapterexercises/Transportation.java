package com.abc.part4.chapterexercises;

/**
 * @Auther: ABC
 * @Date: 2020/5/16 12:06
 * @Description:
 */
public class Transportation {
    private String transportationType;
    private int transportationLength;
    private String transportationColor;

    static {
        System.out.println("我是交通工具，作用是方便人们的出行。");
    }

    public Transportation(String transportationType, String transportationColor, int transportationLength) {
        this.transportationType = transportationType;
        this.transportationColor = transportationColor;
        this.transportationLength = transportationLength;

    }

    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }

    public int getTransportationLength() {
        return transportationLength;
    }

    public void setTransportationLength(int transportationLength) {
        this.transportationLength = transportationLength;
    }

    public String getTransportationColor() {
        return transportationColor;
    }

    public void setTransportationColor(String transportationColor) {
        this.transportationColor = transportationColor;
    }

    @Override
    public String toString() {
        return "我是" + this.getTransportationType() + ", 我的颜色是" + this.getTransportationColor() + ", 我的长度是" +
                this.getTransportationLength() + "米";
    }
}
