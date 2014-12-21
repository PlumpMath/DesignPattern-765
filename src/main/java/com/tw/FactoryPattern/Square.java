package com.tw.FactoryPattern;

/**
 * Created by jtao on 12/18/14.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
