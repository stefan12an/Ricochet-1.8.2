package com.example.breakout.objects;

import android.graphics.Rect;
import android.graphics.RectF;

public class Brick {
    private RectF rect;
    private Rect rect1;
    private boolean isVisible;
    private int lives;
    private boolean hasPower;


    private int brickKind;

    public Brick(int row, int column, int width, int height) {
        isVisible = true;
        int padding = 1;
        rect = new RectF(column * width + padding, row * height + padding, column * width + width - padding, row * height + height - padding);
        rect1 = new Rect((int) rect.left, (int) rect.top, (int) rect.right, (int) rect.bottom);

    }

    public RectF getRect() {
        return this.rect;
    }

    public Rect getRect1() {
        return this.rect1;
    }

    public float getX() {
        return rect.left;
    }
    public float getY() {
        return rect.top;
    }

    public void setInvisible() {
        isVisible = false;
    }

    public boolean getVisibility() {
        return isVisible;
    }

    public int getLives(){return lives;}

    public void setLives(int value){lives=value;}
    public void setPower(boolean power){
        hasPower=power;
    }
    public boolean getPower()
    {
        return hasPower;
    }
    public int getBrickKind() {
        return brickKind;
    }
    public void setBrickKind(int kind)
    {
        brickKind=kind;
    }
}
