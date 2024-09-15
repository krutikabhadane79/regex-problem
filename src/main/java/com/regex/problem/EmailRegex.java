package com.regex.problem;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    ArrayList<String> emails=new ArrayList<>();
    public void validateEmail() {
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        String regex="[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        for(int i=0;i<emails.size();i++){
            Matcher matcher=pattern.matcher(emails.get(i));
            System.out.println(emails.get(i)+" --> Valid");
        }
    }
    public static void main( String[] args )
    {
        EmailRegex regex = new EmailRegex();
        regex.validateEmail();
    }
}