public class Parallelogram implements Figure{
    double baseSide;
    double side ;
    double height;

    public Parallelogram(double baseSide,double side,double height){
        this.baseSide= baseSide;
        this.side=side;
        this.height=height;

    }
    @Override
    public String getType() {
        return "Parallelogram";
    }

    @Override
    public double getArea() {
        return baseSide*height;
    }

    @Override
    public double getPerimeter() {
        return 2*baseSide+2*side;
    }
}
