package de.zettsystems.java18_21.oo;

import java.awt.*;

public sealed interface DataCentricShape {
}

record DataCentricCircle(Point center, int radius) implements DataCentricShape {
}

record DataCentricRectangle(Point lowerLeft, Point upperRight) implements DataCentricShape {
}
