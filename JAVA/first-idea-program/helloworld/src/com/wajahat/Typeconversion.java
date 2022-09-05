package com.wajahat;

import java.util.Scanner;

public class Typeconversion {
    public static void main(String[] args) {
        /*when one type of data is assigned to another type of variable
        then type conversion takes place provided->
        1. types are compatible
        2.destination type should be greater than source type
         */
        Scanner input= new Scanner(System.in);
        float num=input.nextFloat();
//      float num=input.nextInt(); "this is possible because float>int
//       num=input.nextFloat(); "this will give an error
        System.out.println(num);

//        type casting
        int num1=(int)(12.121f);
        System.out.println(num1);

//        automatic type promotion in expressions
//        int a=257;
//        byte b=(byte) (a);
//        System.out.println(b);

//        byte a=20;
//        byte b=30;
//        byte c=100;
//        int d=a*b/c; //automatically promotes exceeding byte value to int
//        System.out.println(d);

//        Revision
        byte b=12;
        char c='a';
        short s=1024;
        int i=12121;
        float f=12.3f;
        double d=0.1234;
        double result=( f * b ) + ( i / c) - (d - s);
//        float + int + double = double
        System.out.println(( f * b ) +" "+ ( i / c) +" "+ (d - s));
        System.out.println(result);
    }
}
