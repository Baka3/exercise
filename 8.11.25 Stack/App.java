public class App {
public static void main(String[] args) {
    BracketValidator validator = new BracketValidator();
        
        String expr1 = "{[()]}";
        String expr2 = "([)]";
        String expr3 = "{[}";
        String expr4 = "({[]})";
        
        System.out.println(expr1 + " is valid: " + validator.isValid(expr1)); // true
        System.out.println(expr2 + " is valid: " + validator.isValid(expr2)); // false
        System.out.println(expr3 + " is valid: " + validator.isValid(expr3)); // false
        System.out.println(expr4 + " is valid: " + validator.isValid(expr4)); // true
    

    }   
} 