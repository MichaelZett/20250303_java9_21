package de.zettsystems.java22.unnamed;


import java.util.List;

public class UnnamedPatternAndVariables {
    public static void main(String[] args) {
        Rectangle shape = new Rectangle(new java.awt.Point(1, 3), new java.awt.Point(5, 9));
        System.out.println(getAreaRecordPattern(shape));
        System.out.println(getAreaUnnamedPattern(shape));
        printUpperRight(shape);
        unnamedVariables(List.of(shape));
    }

    private static void unnamedVariables(List<Shape> shapes) {
        int total = 0;
        for (var _ : shapes) {
            total++;
            if (total > 9) {
                System.out.println("No more than 9 shapes possible");
            }
        }
        if (!shapes.isEmpty()) {
            shapes.removeFirst(); // 1st shape not of interest
        }
    }


    public static double getAreaRecordPattern(Shape shape) {
        return switch (shape) {
            case Circle(var center, int radius) -> Math.PI * radius * radius;
            case Rectangle(java.awt.Point lowerLeft, java.awt.Point upperRight) -> Math.abs((upperRight.y - lowerLeft.y)
                    * (upperRight.x - lowerLeft.x));
            // no default needed because of sealed hierarchy!
        };
    }

    public static double getAreaUnnamedPattern(Shape shape) {
        return switch (shape) {
            // nicht benutzte aber "vorgeschriebene" Variable
            case Circle(_, int radius) -> Math.PI * radius * radius;
            case Rectangle(java.awt.Point lowerLeft, java.awt.Point upperRight) -> Math.abs((upperRight.y - lowerLeft.y)
                    * (upperRight.x - lowerLeft.x));
        };
    }

    private static void printUpperRight(Shape shape) {
        if (shape instanceof Rectangle(_, java.awt.Point upperRight)) {
            System.out.println("UpperRight " + upperRight);
        }
    }

}
