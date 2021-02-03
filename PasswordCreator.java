
import java.util.Random;
import java.util.Scanner;
public class PasswordCreator {

    
    public static void main(String[] args) {
        
        
        int length = 10;
        System.out.println(password(length));
        
    }
    static char[] password(int len){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your enter ur email id");
        String name = sc.nextLine();
        
      System.out.println("Generating a password using random method ");
      System.out.println("Your new password is ");
      
      String capital ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String small = "abcdefghijklmnopqrstuvwxyz";
      String number = "0123456789";
      String symbol = "!@#$%^&*-+?.";
      String values = capital+small+number+symbol+name;
      Random rand = new Random();
      char [] pass = new char[len];
      for(int i=0;i<len;i++){
          pass[i] = values.charAt(rand.nextInt(values.length()));
      }
      return pass;
    
}
    
}

