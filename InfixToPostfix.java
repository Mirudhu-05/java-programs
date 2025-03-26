import java.util.Stack;
public class InfixToPostfix{
  public static String convert(String infix){
    Stack<Character>stack=new Stack <>();
    StringBuilder Postfix=new StringBuilder();
    for(char ch:infix.toCharArray()){
      if(Character.isLetterOrDigit(ch)){
         Postfix.append(ch);
      }else if (ch=='('){
             stack.push(ch);
      }else if(ch==')'){
             while(stack.peek()!='('){
                Postfix.append(stack.pop());
             } 
             stack.pop();
      }else{
            while(!stack.isEmpty()&&precedence(stack.peek())>=precedence(ch)){
                Postfix.append(stack.pop());
            }
            stack.push(ch);
      }
    }
    while(!stack.isEmpty()){
          Postfix.append(stack.pop());
    }
    return Postfix.toString();
 }
 private static int precedence(char op){
      return(op=='+'||op=='-')?1:(op=='*'||op=='/')?2:0;
 }
 public static void main(String[] args){
    String infix="a-b*d/e(b+c)";
    System.out.println("Postfix:"+convert(infix));
 }
}
