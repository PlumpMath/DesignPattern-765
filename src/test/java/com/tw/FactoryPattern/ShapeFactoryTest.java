package com.tw.FactoryPattern;

import org.junit.Test;
import static com.tw.FactoryPattern.ShapeType.CIRCLE;
import static com.tw.FactoryPattern.ShapeType.RECTANGLE;
import static com.tw.FactoryPattern.ShapeType.SQUARE;

/**
 * Created by jtao on 12/21/14.
 */
public class ShapeFactoryTest {

    @Test
    public void should_factory_create_a_circle() throws Exception {
        Shape shape = ShapeFactory.makeShape(CIRCLE);

        assert(shape instanceof Circle);
    }

    @Test
    public void should_factory_create_a_rectangle() throws Exception {
        Shape shape = ShapeFactory.makeShape(RECTANGLE);

        assert(shape instanceof Rectangle);
    }

    @Test
    public void should_factory_create_a_square() throws Exception {
        Shape shape = ShapeFactory.makeShape(SQUARE);

        assert(shape instanceof Square);
    }
}
