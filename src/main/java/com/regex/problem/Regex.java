package com.regex.problem;

import java.util.regex.Pattern;

public class Regex
{
    public void validatePincode() {
        String pincode="400088B";
        String regex="^[1-9][0-9]{5}$";
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
        Regex regex = new Regex();
        regex.validatePincode();
    }
}
