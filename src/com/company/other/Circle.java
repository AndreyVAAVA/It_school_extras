package com.company.other;

public class Circle extends Figure implements Moveable{
    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public float getArea(){
        return 3.1415927f * radius * radius;
    }
    @Override
    public float getPerimeter(){
        return 2 * 3.1415927f * radius;
    }
    @Override
    public void move(float dx, float dy) {
        super.x += dx;
        super.y += dy;
    }
    @Override
    public void resize(float koeff) {
        radius *= koeff;
    }
    @Override
    public String toString() {
        float xCenter = (super.x+super.x)/2;
        float yCenter = (super.y + super.y)/2;
        return "Circle\n"  +
                "Center: " + "(" + x + ", " + y + ")\n" +
                "Radius: " + radius;
    }
    private float radius;
}
