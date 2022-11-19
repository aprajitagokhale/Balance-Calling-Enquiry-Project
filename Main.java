//external libraries of java
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
   System.out.println("1.Balance Enquiry");
   System.out.println("2.Calling & Data Plans");
   System.out.println("3.Last 5 call details");
   Scanner sc=new Scanner(System.in);
   int choice=sc.nextInt();

   switch(choice)
   {
     case 1:
     System.out.println("Your Current Balance is : 258.45rs");  //phone balance
     System.out.println("1.Recharge your account");
     System.out.println("2.Exit");
     Scanner a=new Scanner(System.in);
     int options=a.nextInt();
     switch(options)
     {
       case 1:
       int pin=1910;       //UPI Pin of user(default value)
       float balance=2000.89f;   //Account balance of user  
       System.out.println("Enter your Recharge Amount");
       Scanner d=new Scanner(System.in);
       float balance_new=d.nextFloat();   //Balance for recharge(enter by user)
       System.out.println("Enter your UPI Pin");
       Scanner p=new Scanner(System.in);
       int pin_new=p.nextInt();          //pin enter by user
       if(pin_new==pin){
        if(balance_new<=balance){
          System.out.println("Recharge Successful");
          break;
        }
        else{
          System.out.println("Insufficient Amount");
          break;
        }
       }
       else{
        System.out.println("Invalid Pin");
        break;
       }
       case 2:
       break;
      }
      break;

      case 2:
       System.out.println("Your best plans are:");
       System.out.println("1.599rs-2GB Data/day+Unlimited Calls");
       System.out.println("2.399rs-1GB Data/day+Unlimited Calls");
       System.out.println("3.99rs-25GB Data");
       break;

       case 3:
       System.out.println("Your last 5 call details are:");
       System.out.println("1.Mummy-05:36sec");
       System.out.println("2.Papa-02:47sec");
       System.out.println("3.Kunnu-10:56sec");
       System.out.println("3.Muskan-50:56sec");
       System.out.println("3.Jahnvi-1:40:56sec");
       break;

       default:
       System.out.println("Invalid Input");
    }
   
  }
}