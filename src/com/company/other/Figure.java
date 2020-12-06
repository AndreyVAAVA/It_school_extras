package com.company.other;

public class Figure {
    public Figure(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getArea(){
        return x*y;
    }
    public float getPerimeter(){
        return (x+y) * 2;
    }
    protected float x;
    protected float y;
}
