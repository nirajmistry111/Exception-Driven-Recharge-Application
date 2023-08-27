package CustomerSelection;

import java.util.Scanner;

public class Payment {
    private static int balance = 0;

    public static void CustomerPayment() throws RangeException {
        Scanner sc = new Scanner(System.in);
        try{
                System.out.println("Enter the amount of Top Up you want to add ");
                int amt = sc.nextInt();

             if(amt <= 0){
                throw new RangeException("Amount has to be Greater then 0 ");
            }else {
                 balance = balance + amt;
                 System.out.println("Your Balance is " + balance);
             }

             }
        catch (ArithmeticException e){
            System.out.println("Invalid input ");
        }


    }

}
