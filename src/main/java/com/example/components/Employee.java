package com.example.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id;
    private String ename;

    @Autowired
    private Department department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


    public void showEmployeeDetails() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + ename);
        department.setDeptName("Information Technology");
        System.out.printf("Department : " + department.getDeptName());
    }
}
