package com.company.other;

public class Rectangle extends Figure implements Moveable {
    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }
    @Override
    public float getArea(){
        return height * width;
    }
    @Override
    public float getPerimeter(){
        return (height + width) * 2;
    }
    @Override
    public void move(float dx, float dy) {
        super.x += dx;
        super.y += dy;
    }
    @Override
    public void resize(float koeff) {
        height *= koeff;
        width *= koeff;
    }

    @Override
    public String toString() {
        float xCenter = super.x + width/2;
        float yCenter = super.y + height/2;
        return "Rectangle" + "\n" +
                "Center: " + "(" +xCenter + ", " + yCenter + ")\n" +
                "Height: " + height + "\n" +
                "Width: " + width;
    }

    private float height;
    private float width;
}
