import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    while (num!=0){
      int count = 0;
      while (true){
        System.out.print("*");
        count++;
        if (count==num){
          break;
        }
      }
      System.out.println();
      num = num-1;
    }
  }
}
