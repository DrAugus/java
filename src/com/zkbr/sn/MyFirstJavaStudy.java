package com.zkbr.sn;

import java.text.SimpleDateFormat;
import java.util.*;

public class MyFirstJavaStudy {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        testFile();
        System.out.println("Hello,World！");
        // 初始化 Date 对象
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 使用toString()显示日期和时间
        System.out.printf("Current Date" + format.format(date), date);

        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 3); // 休眠3秒
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int year;
        // 初始化 Gregorian 日历
        // 使用当前时间和日期
        // 默认为本地时间和时区
        GregorianCalendar calendar = new GregorianCalendar();
        // 显示当前时间和日期的信息
        System.out.print("Date: ");
        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE) + " ");
        System.out.println(year = calendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));

        // 测试当前年份是否为闰年
        if (calendar.isLeapYear(year)) {
            System.out.println("当前年份是闰年");
        } else {
            System.out.println("当前年份不是闰年");
        }
        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);


    }

    public static void testFile() {
        List<Integer> myList1 = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            myList1.add(800 + i);
        }
        for (Integer a : myList1) {
            System.out.println("" + a);
        }
    }

}
