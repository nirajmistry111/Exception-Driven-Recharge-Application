package CustomerSelection;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
    public long num ;
    public  static void PhoneNumberInput() throws RangeException {
        Scanner sc = new Scanner(System.in);
try {

    System.out.println("Enter your  10 digit phone number without country code with this pattern (##########): ");
    long num = sc.nextLong();


    boolean pat = Pattern.matches("^(\\d{3}[- ]?){2}\\d{4}$", Long.toString(num));

    if (pat == true) {
        Payment.CustomerPayment();

    } else {
        throw new RangeException("Invalid phone number. Please enter a 10-digit number.");

    }
}
catch (InputMismatchException e){
    System.out.println("Input pattern is wrong");
}







    }
}
