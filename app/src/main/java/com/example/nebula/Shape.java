package com.example.nebula;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "blue";

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    };

    public int GetX() {
        return x;
    }

    public int GetY() {
        return y;
    }

    public void SetX(int x) {
        this.x = x;
    }

    public void SetY(int y) {
        this.y = y;
    }
}
