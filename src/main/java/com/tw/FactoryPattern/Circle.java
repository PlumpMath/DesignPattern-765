package com.tw.FactoryPattern;

/**
 * Created by jtao on 12/18/14.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
