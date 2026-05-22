package Stack;

import java.util.*;
public class postfixExpression{
     public static int evaluatePostfix(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for(String t : tokens){
            if(t.equals("+") || t.equals("-") || 
               t.equals("*") || t.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();

                switch(t){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        System.out.println(evaluatePostfix(tokens));
    }
}
