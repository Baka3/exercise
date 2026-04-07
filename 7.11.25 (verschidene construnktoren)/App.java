public class App {
    public static void main(String[] args) {
    Square square = new Square(4, 4);
    Triangle triangle = new Triangle(3, 4);
    Circle circle = new Circle(5);
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Circumference: " + circle.circumference());
    }
    
}
