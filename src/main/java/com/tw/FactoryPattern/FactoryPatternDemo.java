package com.tw.FactoryPattern;

import static com.tw.FactoryPattern.ShapeType.*;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.makeShape(CIRCLE);
        circle.draw();

        Shape rectangle = ShapeFactory.makeShape(RECTANGLE);
        rectangle.draw();

        Shape square = ShapeFactory.makeShape(SQUARE);
        square.draw();
    }
}
