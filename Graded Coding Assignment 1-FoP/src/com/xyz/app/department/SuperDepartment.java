package com.xyz.app.department;

public class SuperDepartment {

    String departmentName="Super Department", todaySWork="No work as of now", workDeadline="Nil", todayHoliday="Today is not a holiday";
    public String departmentName()
    {
        return departmentName;
    };
    public String getTodaySWork()
    {
        System.out.println(todaySWork);
        return todaySWork;
    };


    public String getWorkDeadline()
    {
        System.out.println(workDeadline);
        return workDeadline;
    };
    public String isTodayAHoliday()
    {
        System.out.println(todayHoliday);
        return todayHoliday;
    };

}
