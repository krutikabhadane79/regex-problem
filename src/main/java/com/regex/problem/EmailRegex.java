package com.regex.problem;

import java.util.regex.Pattern;

public class EmailRegex {
    public void validateEmail(String email) {
        String regex="^[a-z]{3}([_+\\-.][a-z]+)?@[a-z]{10}\\.[a-z]{2}.(\\.[a-z]{2})?$";
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
        String email1 = "abc@bridgelabz.co.in";
        String email2 = "abc.xyz@bridgelabz.co";
        String email3 = "abc.xyz@bridgelabz.co.uk";
        String email4 = "abc.xyz@bridgelabz";
        regex.validateEmail(email1);
        regex.validateEmail(email2);
        regex.validateEmail(email3);
        regex.validateEmail(email4);
    }
}