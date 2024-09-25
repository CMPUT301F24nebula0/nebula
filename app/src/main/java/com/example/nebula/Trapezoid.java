package com.example.nebula;

public class Trapezoid extends Shape{
    private int btmLength;
    private int topLength;
    private int height;

    public Trapezoid (int x, int y, int btmLength, int topLength, int height){
        super(x,y);
        this.btmLength = btmLength;
        this.topLength = topLength;
        this.height = height;
    }

    public void setBtmLength(int btmLength) {
        this.btmLength = btmLength;
    }

    public int getBtmLength(){
        return btmLength;
    }

    public void setTopLength(int topLength){
        this.topLength = topLength;
    }

    public int getTopLength(){
        return topLength;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return  height;
    }
}
