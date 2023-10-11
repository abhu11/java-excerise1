import java.util.Scanner;

interface StringFunc {
   String func(String n);
}
public class StringFuncLambdaTest {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      StringFunc reverse = (str) -> {   // lambda expression
         String result = "";
         for(int i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
         return result;
      };
      System.out.println("Lambda reversed is: " + reverse.func("Hello Java"));
     
      System.out.println("Enter a word to reverse a String:");
      String word = sc.nextLine();
      System.out.println(word +" in reversed form - " + reverse.func(word));
   }
}