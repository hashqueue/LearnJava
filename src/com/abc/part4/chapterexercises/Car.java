package com.abc.part4.chapterexercises;

/**
 * @Auther: ABC
 * @Date: 2020/5/16 12:17
 * @Description:
 */
public class Car extends Transportation {
    private String runInHighway;

    public String getRunInHighway() {
        return runInHighway;
    }

    public void setRunInHighway(String runInHighway) {
        this.runInHighway = runInHighway;
    }

    public Car(String transportationType, String transportationColor, int transportationLength, String runInHighway) {
        super(transportationType, transportationColor, transportationLength);
        this.runInHighway = runInHighway;

    }

    @Override
    public String toString() {
        return super.toString() + ", 我可以在" + runInHighway + "上跑。";
    }
}
