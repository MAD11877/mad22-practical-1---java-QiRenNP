import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {

     
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
