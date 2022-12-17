package baiTap5;

public class Circle   extends  Shape{
    private Double radius;
    public  Circle(){}

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, Double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter()
    {
        return  this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
