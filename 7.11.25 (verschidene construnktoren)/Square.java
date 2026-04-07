public class Square extends GeomObjekt {
    public Square(double height, double breadth) {
        super(height, breadth);
    }

    public double area() { // площа
        return getHeight() * getBreadth();
    }

    public double perimeter() { // периметр
        return 2 * (getHeight() + getBreadth());
    }
    
}
