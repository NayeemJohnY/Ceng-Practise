package com.practise.java;

import java.util.Stack;



public class ExpressionValidation {
	
	public static void main(String[] args) {
		 //String expression = "";
		 String expression = "[1+{5+(6) - 7*(5-4)}+6]";
		  expression=expression.replaceAll("[0-9+-/%/*]", "");
		    System.out.println(expression);
		    if (isBalanced(expression))
		      System.out.println("The String IS balanced");
		    else
		      System.out.println("The String IS NOT balanced");
	}
	public static Boolean isBalanced(String expression){
	    
	    Stack<Character> stack = new Stack<Character>();
	    Boolean flag = true;
	    try{
	     if(expression.equals("")){
	       System.out.println("The String is Empty");
	       
	     } 
	    for(int i=0;i<expression.length();i++){
	      if(expression.charAt(i)=='{' || expression.charAt(i)=='[' || expression.charAt(i)=='(' ){
	        stack.push(expression.charAt(i));
	      }else if(expression.charAt(i)=='}'){
	        if(stack.pop()!='{'){
	        flag=false;
	        break;
	        }
	      }else if(expression.charAt(i)==']'){
	        if(stack.pop()!='['){
	        flag=false;
	        break;
	        }
	      }else if(expression.charAt(i)==')'){
	        if(stack.pop()!='('){
	        flag=false;
	        break;
	        }
	      }
	    }
	    }catch(NullPointerException e){
	      System.out.println("String is Null");
	    }
	    return flag;
	  }

}
