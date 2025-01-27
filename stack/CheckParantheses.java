package stack;
import java.util.Stack;
import java.util.Scanner;
public class CheckParantheses {
    public static boolean isTrue(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(c == ')' || c=='}' || c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.pop();
                    if((c==')' && top =='(' || (c=='}' && top =='{')|| (c==']' && c=='['))){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(str+" is: "+isTrue(str));
        sc.close();
    }
}
