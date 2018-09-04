package com.example.student.bt_thayminh;

/**
 * Created by Student on 9/4/2018.
 */

public class Employee {
    private String id;
    private String name;
    private boolean isFullTime;

    public Employee(String id, String name, boolean isFullTime) {
        this.id = id;
        this.name = name;
        this.isFullTime = isFullTime;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
