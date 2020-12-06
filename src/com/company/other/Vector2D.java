package com.company.other;

import java.util.Locale;

public class Vector2D {
    public Vector2D (){
        vX = 1;
        vY = 1;
        count++;
    }
    public Vector2D(double vX, double vY){
        this.vX = vX;
        this.vY = vY;
        count++;
    }
    public Vector2D (Vector2D vector){
        vX = vector.vX;
        vY = vector.vY;
        count++;
    }
    public void print(){
        System.out.print("(");
        System.out.print(String.format(Locale.US, "%.2f", vX));
        System.out.print(", ");
        System.out.print(String.format(Locale.US, "%.2f", vY));
        System.out.println(")");
    }
    public double length() {
        double sum = (Math.sqrt((vX) * vX + vY * vY));
        return sum;
    }
    public void add (Vector2D vector){
        vX += vector.vX;
        vY += vector.vY;
    }
    public void sub (Vector2D vector){
        vX -= vector.vX;
        vY -= vector.vY;
    }
    public void scale(double scaleFactor){
        vX *= scaleFactor;
        vY *= scaleFactor;
    }
    public void normalized(){
        var mid_step = Math.sqrt(vX*vX + vY*vY);
        vX /= mid_step;
        vY /= mid_step;
    }
    public double dotProduct(Vector2D vector){
        var s = vX*vector.vX + vY*vector.vY;
        return s;
    }
    protected double vX;
    protected double vY;
    public static int count = 0;
}
