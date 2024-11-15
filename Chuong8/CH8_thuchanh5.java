interface Shape {
    public double getArea();
    public double getPerimeter();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override 
    public double getArea() {
        double s = (a + b + c) /2 ;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}

public class CH8_thuchanh5 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Rectangle(18, 18);

        shapes[1] = new Triangle(30, 30, 30);

        shapes[2] = new Circle(12);

        for (int i =0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + ": " + shapes[i].getArea());
            System.out.println("Shape " + (i + 1) + ": " + shapes[i].getPerimeter());
            System.out.println();
        }
    }
}