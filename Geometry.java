interface Geometry {
    double calculateArea();
}

abstract class GeometricObject implements Geometry {
    protected double height;
    protected double width;

    public GeometricObject(double height, double width) {
        this.height = height;
        this.width = width;
    }

    abstract double calculatePerimeter();

    @Override
    public double calculateArea() {
        return height * width;
    }
}

class Rectangle extends GeometricObject {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    double calculatePerimeter() {
        return 2 * (height + width);
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        super(radius, radius);
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
