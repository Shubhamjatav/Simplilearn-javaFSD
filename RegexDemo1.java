package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	
	public static void main(String[] args) {
		
		String regex ="abc";
		String input ="abc";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if(match.matches())
		{
			System.out.println("Pattern matched");
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}
