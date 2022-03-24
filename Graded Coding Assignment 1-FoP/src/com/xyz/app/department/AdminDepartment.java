package com.xyz.app.department;

public class AdminDepartment extends SuperDepartment
{
    String departmentName="Admin Department", todaySWork="Complete your documents Submission", workDeadline="Complete by EOD";
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


}

