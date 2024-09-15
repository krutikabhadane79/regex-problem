package com.regex.problem;

import java.util.regex.Pattern;

public class EmailRegex {
    public void validateEmail(String email) {
        String regex="^[a-z]{3}\\.?[a-z]*@[a-z]{10}.*$";
        boolean answer = Pattern.matches(regex,email);
        if (answer) {
            System.out.println("Email is Valid");
        }
        else {
            System.out.println("Email is Invalid");
        }
    }
    public static void main( String[] args )
    {
        EmailRegex regex = new EmailRegex();
        String email = "abc.xyz@bridgelabz.co.in";
        regex.validateEmail(email);
    }
}