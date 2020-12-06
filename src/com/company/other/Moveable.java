package com.company.other;

public interface Moveable {
    default void move(float dx, float dy){};
    default void resize(float koeff){};
}
