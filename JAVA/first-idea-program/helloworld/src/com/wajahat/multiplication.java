package com.wajahat;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();

        int product=num1*num2;
        System.out.println("Product is " + product);
    }
}
