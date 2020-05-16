package com.abc.part3;

import java.util.Calendar;

/**
 * @Auther: ABC
 * @Date: 2020/5/16 16:24
 * @Description:
 */
public class TipByHour {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int hourOfCurrentTime = calendar.get(Calendar.HOUR_OF_DAY);
        if (hourOfCurrentTime < 6) {
            System.out.println("现在是凌晨!");
        } else if (hourOfCurrentTime < 9) {
            System.out.println("现在是早晨!");
        } else if (hourOfCurrentTime < 12) {
            System.out.println("现在是上午!");
        } else if (hourOfCurrentTime < 14) {
            System.out.println("现在是中午!");
        } else if (hourOfCurrentTime < 17) {
            System.out.println("现在是下午!");
        } else if (hourOfCurrentTime < 19) {
            System.out.println("现在是傍晚!");
        } else if (hourOfCurrentTime < 22) {
            System.out.println("现在是晚上!");
        } else if (hourOfCurrentTime < 24) {
            System.out.println("现在是深夜!");
        }
    }
}
