public class Triangle extends GeomObjekt {
    public Triangle(double height, double breadth) {
        super(height, breadth);
    }

    public double area() { // площа
        return 0.5 * getHeight() * getBreadth();
    }

    public double perimeter() { // периметр
        double height = getHeight();
        double breadth = getBreadth();
        double sideLength = Math.sqrt(height * height + breadth * breadth); // гіпотенуза
        return height + breadth + sideLength;
    }
    
}
