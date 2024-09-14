package com.regex.problem;

import java.util.regex.Pattern;

public class Regex
{
    public void validatePincode(String pincode) {
        String regex="^[1-9][0-9]{2} ?[0-9]{3}$";
        boolean answer = Pattern.matches(regex,pincode);
        if (answer) {
            System.out.println("Pincode is Valid");
        }
        else {
            System.out.println("Pincode is Invalid");
        }
    }
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Regex Problem" );
        String pincode1="400 088";
        String pincode2="400088";
        Regex regex = new Regex();
        regex.validatePincode(pincode1);
        regex.validatePincode(pincode2);
    }
}
