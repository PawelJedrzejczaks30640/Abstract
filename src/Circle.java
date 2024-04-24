public class Circle implements Figure {
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {

        return Math.PI*2*radius;
    }
}
