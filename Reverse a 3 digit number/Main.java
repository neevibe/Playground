import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
   int n, reverse = 0;
         
     
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
         
      while(n != 0)
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
       
      System.out.println( + reverse);
  }
}