package com.company.other;

public class Employee extends Person{

    @Override
    public String toString() {
        return "(" + super.name + ", " + super.age + ", " + company + ")";
    }

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
    @Override
    public String work(){
        return "Manager";
    }

    private String company;
}
