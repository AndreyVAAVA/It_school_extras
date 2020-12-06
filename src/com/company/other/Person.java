package com.company.other;

public class Person {
    @Override
    public String toString() {
        return "(" + name + ", " + age + ")";
    }
    public String work(){
        return "None";
    }
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String setName(){
        return name;
    }
    protected int age;
    protected String name;
}

