public class Circle extends GeomObjekt {
    public Circle(double radius) {
        super(radius); // height and breadth are not used for Circle
        //setRadius(radius);
    }

    public double area() { // площа
        double radius = getRadius();
        return Math.PI * radius * radius;
    }

    public double circumference() { // довжина кола
        double radius = getRadius();
        return 2 * Math.PI * radius;
    }
    
}
