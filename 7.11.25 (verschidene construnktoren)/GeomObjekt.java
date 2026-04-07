public class GeomObjekt {
    private double height;
    private double breadth;
    private double radius;
    private double sideLength;
    public double PI = Math.PI;

    public GeomObjekt(double height, double breadth) {
        this.height = height;
        this.breadth = breadth;       
    }
    public GeomObjekt(double radius) {
        this.radius = radius;       
    }
    public GeomObjekt(int sideLength, double height) {
        this.sideLength = sideLength;
        this.height = height;      
    }

    public double getHeight() {
        return height;
    }
    public double getBreadth() {
        return breadth;
    }
    public double getRadius() {
        return radius;
    }
    public double getStreke_a() {
        return sideLength;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setStreke_a(double sideLength) {
        this.sideLength = sideLength;
    }

}