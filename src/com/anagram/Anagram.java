package com.anagram;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean result = isAnagram(a, b);
		if(result) {
			System.out.println("Is an anagram");
		}
		else {
			System.out.println("Is not an anagram");
		}
	}
	
    static boolean isAnagram(String a, String b) {
        if(a.length() == b.length()){
            String aUpper;
            String aLower;
            String bUpper;
            String bLower;

        for(int i=0;i<a.length();){
            aUpper = a.substring(0,1).toUpperCase();
            aLower = a.substring(0,1).toLowerCase();
            for(int i2=0;i2<b.length();i2++){
                bUpper = b.substring(i2,i2+1).toUpperCase();
                bLower = b.substring(i2,i2+1).toLowerCase();
                    if(aUpper.equals(bUpper) || aUpper.equals(bLower) || aLower.equals(bUpper) || aLower.equals(bLower)){
                    a=a.substring(1, a.length());
                    if(i2 == 0){
                    b = b.substring(i2+1, b.length());
                    }
                    else{
                    b = b.substring(0,i2)+b.substring(i2+1, b.length());
                    }
                    break;
                    }
                    else if(i2 == b.length()-1){
                    return false;
                    }
                }
            }
        }
        else{return false;}
        return true; }

}