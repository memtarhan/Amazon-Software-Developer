interface ShapeInterface {}
abstract class ShapeAbstract {}
abstract class Shape extends ShapeAbstract implements ShapeInterface {
    public abstract float calculateArea();

    public abstract void draw();

    public abstract void lineColor(String color);

    public void test() {
        System.out.println("Test");
    }
}

class Rectangle extends Shape {
    private float width;
    private float height;

    Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width=" + this.width + " height=" + this.height);
    }

    @Override
    public void lineColor(String color) {
        System.out.println("Setting line color to " + color);
    }

    @Override
    public void test() {
        super.test();
    }
}

class Circle extends Shape {
    private float radius;

    Circle(float r) {
        this.radius = r;
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius=" + this.radius);
    }

    @Override
    public void lineColor(String color) {
        System.out.println("Setting line color to " + color);
    }
}