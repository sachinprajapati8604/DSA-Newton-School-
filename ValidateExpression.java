package com.company;

import java.util.Scanner;
import java.util.Stack;

public class ValidateExpression {
    public  static  boolean Validate_Expression(String exp){
        Stack <Character> stack=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char x=exp.charAt(i);
            if(x=='(' || x=='[' || x=='{' || x=='+' || x<=100 ) {
                stack.push(x);
                continue;
            }
            if(stack.isEmpty()){
                return  false;
            }
            char check;
            switch (x){
                case ')':
                    check=stack.pop();
                    if(check=='{' || check =='[' || check=='+'){
                        return false;
                    }
                    break;
                case '}':
                    check=stack.pop();
                    if(check=='(' || check=='[' || check=='+'){
                        return  false;
                    }
                    break;
                case ']':
                    check =stack.pop();
                    if(check=='(' || check=='{' || check=='+'){
                        return false;
                    }
                    break;
                case '+':
                    check =stack.pop();
                    if(check=='(' || check=='{' || check=='['){
                        return false;
                    }
                    break;
            }
        }
        return  (stack.isEmpty());
    }
    public static  void main(String []args){
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        if(Validate_Expression(exp)){
            System.out.println("Valid Expression");
        }else{
            System.out.println("Invalid Expression ");
        }
    }
}
