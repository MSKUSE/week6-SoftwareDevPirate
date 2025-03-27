public class Circle extends Shape {


    private int radius;

    public Circle(Point location, int radius) {
        super(location);
        this.radius=radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("Radius can't be negative");
        }else {
            this.radius = radius;

        }
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public double perimeter(){
        return 2* Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "location=" + this.getLocation() +
                ", radius=" + this.radius +
                '}';
    }
}
