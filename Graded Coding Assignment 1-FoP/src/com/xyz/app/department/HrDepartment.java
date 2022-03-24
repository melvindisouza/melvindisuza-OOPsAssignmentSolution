package com.xyz.app.department;

public class HrDepartment extends SuperDepartment
{
    String departmentName="Hr Department", todaySWork="Fill today’s worksheet and mark your attendance", workDeadline="Complete by EOD", activity="Team Lunch";
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

    public String doActivity()
    {
        System.out.println(activity);
        return activity;
    };

}
