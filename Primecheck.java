//Prime check


import java.util.Scanner;
public class Prime{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=scanner.nextInt();
    Boolean isprime=false;
    if(num<=1){
      isprime=false;
    }else{
      for(int i=2;i<num/2;i++){
         if (num%i==0){
           isprime=false;
           break;
           }
         }
      }
    if(isprime){
      System.out.println(num +" is a prime number.");
    }else{
      System.out.println(num +" is not a prime number.");
}
}
}


OUTPUT:

Enter a number:11
11 is a prime number.



OUTPUT:


Enter a number: 11
11 is a prime number.
