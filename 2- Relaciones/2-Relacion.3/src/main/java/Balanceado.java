
import java.util.Stack;

public class Balanceado {
 private final static String OPEN_PARENTHESES ="{[(";
 private final static String CLOSED_PARENTHESES = "}])";
    public static void main(String[] args) {
        
            
  


  String prueba = "vv(hg(jijhags{ss[dd]dd})"; //con el que probamos
  Stack<Character > pila = new Stack< >();
  System.out.println(wellBalanced(prueba, pila)); // Se muestra por pantalla si prueba está balanceada (true) o no (false)
  
 }
 public static boolean wellBalanced(String exp, Stack <Character > stack) {
  for(int i=0; i < exp.length(); i++){
   char c = exp.charAt(i);
   if (isOpenParentheses(c)){
    stack.push(c);
   }else if (isClosedParentheses(c)){
    if (match (stack.peek(), c) )  {
     stack.pop();
    } else{
     return false;
    }
   }
  }
  
  return stack.isEmpty();

 }
 public static boolean isOpenParentheses(char c) {
  return OPEN_PARENTHESES.indexOf(new Character(c).toString()) >= 0;
 }
 public static boolean isClosedParentheses(char c) {
  return CLOSED_PARENTHESES.indexOf(new Character(c).toString()) >= 0;
 }
 public static boolean match(char x, char y) {
  return OPEN_PARENTHESES.indexOf(new Character(x).toString()) ==
    CLOSED_PARENTHESES.indexOf(new Character(y).toString());
 }
}
    


