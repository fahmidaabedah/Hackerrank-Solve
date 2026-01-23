package org.problemsolving;

import java.text.DateFormatSymbols;
import java.util.Scanner;
import java.util.Calendar;

class result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        var dayName = cal.get(Calendar.DAY_OF_WEEK);
        var finalDayName = new DateFormatSymbols().getWeekdays()[dayName].toUpperCase();
        return finalDayName;
    }
}

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        String res = result.findDay(month, day, year);
        System.out.println(res);

    }
}

