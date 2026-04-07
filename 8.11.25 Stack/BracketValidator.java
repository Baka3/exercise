import java.util.Stack;
public class BracketValidator {
    
    private Stack<Character> brackets = new Stack<>();

    public boolean isValid(String expression){
        for(char bracket:expression.toCharArray()){
            if (bracket=='{' || bracket =='(' || bracket =='['){
                brackets.push(bracket);
            }
            else if (bracket=='}' || bracket ==')' || bracket ==']'){

            if(brackets.isEmpty()){
                return false;
            }
            
            char top = brackets.pop();

            if(bracket==')' && top!='(' ||
               bracket==']' && top!='[' ||
               bracket=='}' && top!='{'){
                return false;
               }
        }
        }
    return brackets.isEmpty();
    
    }
    
    }