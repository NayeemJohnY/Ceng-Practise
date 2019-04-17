package com.practise.java;

public class ReverseString {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The zodiac sign of 2018 is the Dog";
		System.out.println(str);
		String array[]=str.split(" ");
		int len=array.length;
		String reverse[]=new String[len];
		for(int i=0; i<len; i++)
		{
			reverse[i]=array[len-1-i];
		}
		String reverseStr = "";
		for(int i=0;i<len;i++){
			reverseStr=reverseStr+reverse[i]+" ";
		      
		    }
		System.out.println(reverseStr.trim());
	}

}
