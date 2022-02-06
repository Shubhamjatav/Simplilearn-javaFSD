package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class EmailValidation {
	
public static void main(String[] args) {
	
	    String email1 = "simple@learn.com";
	    String email2 = "simplelearn.com";
	    
	    System.out.println("email = " + validateEmail(email1));
	    System.out.println("email = " + validateEmail(email2));
}
		
        public static String validateEmail (String email) {
         if(email == null || email.isEmpty()) {
        	 return "Invalid";
         }
         
         String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + 
                             "(?:[a-zA-Z0-9-]+\\.)+[a-zA-z]{2,7}$";
		
		Pattern pattern= Pattern.compile(emailRegex);
		if (pattern.matcher(email).matches()) {
			return "valid";
		}else {
				return "Invalid";
			}
        }
}
	
        
        
