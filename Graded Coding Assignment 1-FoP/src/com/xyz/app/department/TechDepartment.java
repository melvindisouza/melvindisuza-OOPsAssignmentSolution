package com.xyz.app.department;

public class TechDepartment extends SuperDepartment
{
    String departmentName="Tech Department", todaySWork="Complete coding of module 1", workDeadline="Complete by EOD", techStackInfo="core Java";
    public String departmentName()
    {
        return departmentName;
    };
    public  String getTodaySWork()
    {
        System.out.println(todaySWork);
        return todaySWork;
    };


    public  String getWorkDeadline()
    {
        System.out.println(workDeadline);
        return workDeadline;
    };
    public  String getTechStackInformation()
    {
        System.out.println(techStackInfo);
        return techStackInfo;
    }

}
