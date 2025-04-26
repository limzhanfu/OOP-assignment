import java.util.Scanner;

public class Controller{

   Scanner scanner = new Scanner(System.in);
   
   public void DisplayOption()
   {
      //Display something
   }  
    
   public <T> T getInput(Class<T> type)
   {
      if(Integer.class == type){
         return type.cast(scanner.nextInt());
      }
      else if(Character.class == type){   
         String character = scanner.next();
         return type.cast(character);
      }

      else if(Double.class == type){
         return type.cast(scanner.nextDouble());
      }
      else if(String.class == type){
         return type.cast(scanner.nextLine());
      }

       throw new IllegalArgumentException("Illegal type " + type);
   }
}   