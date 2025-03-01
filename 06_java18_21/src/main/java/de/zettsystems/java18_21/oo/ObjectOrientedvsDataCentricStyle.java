package de.zettsystems.java18_21.oo;

import java.awt.*;

public class ObjectOrientedvsDataCentricStyle {
    public static void main(String[] args) {
        //OO
        System.out.println(getArea(new ObjectOrientedCircle(new Point(5, 5), 4)));
        System.out.println(getArea(new ObjectOrientedRectangle(new Point(1, 3), new Point(5, 9))));
        //Data-centric
        System.out.println(getArea(new DataCentricCircle(new Point(5, 5), 4)));
        System.out.println(getArea(new DataCentricRectangle(new Point(1, 3), new Point(5, 9))));
    }

    public static double getArea(ObjectOrientedShape objectOrientedShape) {
        if (objectOrientedShape == null) {
            return 0d;
        }
        return objectOrientedShape.getArea();
    }

    public static double getArea(DataCentricShape dataCentricShape) {
        return switch (dataCentricShape) {
            case null -> 0d;
            case DataCentricCircle(Point center, int radius) -> Math.PI * radius * radius;
            case DataCentricRectangle(Point lowerLeft, Point upperRight) ->
                    Math.abs((upperRight.y - lowerLeft.y) * (upperRight.x - lowerLeft.x));
        };
    }

}
