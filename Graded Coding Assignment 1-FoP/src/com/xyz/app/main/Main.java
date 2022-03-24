package com.xyz.app.main;
import com.xyz.app.department.*;

public class Main {
    public static void main(String[] args)
    {
        AdminDepartment adminD= new AdminDepartment();
        System.out.println("Welcome to "+adminD.departmentName());
        adminD.getTodaySWork();
        adminD.getWorkDeadline();
        adminD.isTodayAHoliday();
        System.out.println();

        HrDepartment hrD = new HrDepartment();
        System.out.println("Welcome to "+hrD.departmentName());
        hrD.doActivity();
        hrD.getTodaySWork();
        hrD.getWorkDeadline();
        hrD.isTodayAHoliday();
        System.out.println();

        TechDepartment techD = new TechDepartment();
        System.out.println("Welcome to "+techD.departmentName());
        techD.getTodaySWork();
        techD.getWorkDeadline();
        techD.getTechStackInformation();
        techD.isTodayAHoliday();

    }
}
