import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    int num, total = 0;

     for (int i = 1; i < 11; i++){
         System.out.print("Integer " + i + " =");
         num = keyboard.nextInt();
         total = total + num;
    }
      System.out.println("The total of all 10 integers entered is " + total);
    }

}
