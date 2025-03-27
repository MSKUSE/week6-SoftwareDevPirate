public class Triangle extends Shape{
    private int height,base,sideC;
    public Triangle(Point location,int height,int base,int sideC) {
        super(location);
        this.height=height;
        this.base=base;
        this.sideC=sideC;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public double area(){
        return (double) (height * base) /2;
    }
    @Override
    public double perimeter(){
        return height + base + sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "topLeft=" + this.getLocation()+
                "height=" + this.height +
                ", base=" + this.base +
                '}';
    }
}
