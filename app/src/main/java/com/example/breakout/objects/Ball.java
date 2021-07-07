package com.example.breakout.objects;

import android.graphics.Rect;
import android.graphics.RectF;

import java.util.Random;

public class Ball {
    private RectF rect;
    private Rect rect1;
    private float xVelocity;
    private float yVelocity;
    private float ballWidth = 10;
    private float ballHeight = 10;

    public Ball(int screenX,int screenY) {
        xVelocity = 200;
        yVelocity = -400;
        rect = new RectF();
        rect1=new Rect();
    }

    public RectF getRect() {
        return rect;
    }
    public Rect getRect1() {
        return rect1;
    }
    public void update(long fps) {
        rect.left = rect.left + (xVelocity / fps);
        rect.top = rect.top + (yVelocity / fps);
        rect.right = rect.left + ballWidth;
        rect.bottom = rect.top - ballHeight;
        rect1.left=(int)rect.left;
        rect1.top=(int)rect.top;
        rect1.bottom=(int)rect.bottom;
        rect1.right=(int)rect.right;

    }

    public void reverseYVelocity() {
        yVelocity = -yVelocity;
    }

    public void reverseXVelocity() {
        xVelocity = -xVelocity;
    }

    public void setRandomXVelocity() {
        Random generator = new Random();
        int answer = generator.nextInt(2);
        if (answer == 0) {
            reverseXVelocity();
        }
    }

    public void clearObstacleY(float y) {
        rect.bottom = y;
        rect.top = y - ballHeight;
    }


    public void clearObstacleX(float x) {
        rect.left = x;
        rect.right = x + ballWidth;
    }

    public void reset(int x, int y) {
        rect.left = x / 2 + 85;
        rect.top = y - 168;
        rect.right = x / 2 + 85 + ballWidth;
        rect.bottom = y - 168 - ballHeight;
        rect1.left=(int)rect.left;
        rect1.right=(int)rect.right;
        rect1.bottom=(int)rect.bottom;
        rect1.top=(int)rect.top;
        xVelocity = 200;
        yVelocity = -400;

    }
    public void setVelocity(float valueX, float valueY)
    {
        if(xVelocity>0)
        xVelocity=valueX;
        else
            xVelocity=-valueX;
        if(yVelocity>0)
        yVelocity=-valueY;
        else
            yVelocity=valueY;
    }
}
