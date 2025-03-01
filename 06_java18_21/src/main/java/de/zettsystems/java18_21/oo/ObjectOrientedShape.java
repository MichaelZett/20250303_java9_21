package de.zettsystems.java18_21.oo;

import java.awt.*;

public sealed interface ObjectOrientedShape {
    double getArea();
}

record ObjectOrientedCircle(Point center, int radius) implements ObjectOrientedShape {
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

record ObjectOrientedRectangle(Point lowerLeft, Point upperRight) implements ObjectOrientedShape {
    @Override
    public double getArea() {
        return Math.abs((upperRight.y - lowerLeft.y)
                * (upperRight.x - lowerLeft.x));
    }
}
