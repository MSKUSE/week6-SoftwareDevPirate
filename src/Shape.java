public class Shape {
    private Point location;

    public Shape(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public double area(){
        System.out.println("Shape Class Area");
        return 0;
    }
    public double perimeter(){
        System.out.println("Shape Class Perimeter");
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "location=" + location +
                '}';
    }
}
