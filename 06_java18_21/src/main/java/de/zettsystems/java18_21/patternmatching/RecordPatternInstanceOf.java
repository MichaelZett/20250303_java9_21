package de.zettsystems.java18_21.patternmatching;

import java.awt.*;

public class RecordPatternInstanceOf {
    public static void main(String[] args) {
        Shape shape = new Rectangle(new Point(1, 3), new Point(5, 9));
        printShape(shape);
    }

    private static void printShape(Shape shape) {
        if (shape instanceof Rectangle(Point lowerLeft, Point upperRight)) {
            System.out.println("LowerLeft: " + lowerLeft + " UpperRight " + upperRight);
        }
    }
}
