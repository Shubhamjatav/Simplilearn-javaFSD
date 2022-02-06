package com.simplilearn.regex;

import java.util.regex.Matcher;

public class RegexDemo3 {
	
public static void main(String[] args) {
		
		String regex ="[A-Z]+";
		String input ="Regular Expression";
		
		pattern pattern= pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		while(match.find())
		{
			System.out.println(input.substring(match.start(),match.end()));
		}
	}
}
