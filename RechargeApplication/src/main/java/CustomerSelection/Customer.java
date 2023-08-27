package CustomerSelection;

import NetworkProvider.Bell;
import NetworkProvider.ComapanyDoesnotExist;
import NetworkProvider.Fido;
import NetworkProvider.Koodo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {
    public static String n;

    public static void Number() throws ComapanyDoesnotExist {


        Scanner sc = new Scanner(System.in);
try {
    System.out.println("Choose the Recharge Company : ");
     n = sc.next();
}catch (InputMismatchException e){
    System.out.println("This Input is Not allowed , Kindly select provided Companies ");
}

    if (n.equalsIgnoreCase("Fido")) {
        Fido f = new Fido();
        f.RechargeCompany();


    } else if (n.equalsIgnoreCase("Bell")) {
        Bell b = new Bell();
        b.RechargeCompany();

    } else if (n.equalsIgnoreCase("Koodo")) {
        Koodo k = new Koodo();
        k.RechargeCompany();


    } else {

        throw new ComapanyDoesnotExist("It's an invalid Input , Recharge Company Doesn't Exist ");
    }


    }

}
