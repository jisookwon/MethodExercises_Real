package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //method #1
        GetInput(num1, num2);
        sum = AddTwoInput(num1,num2);
        System.out.println("Sum is " + sum);
        //method #2
        GetInput(num1,num2);
        DivideNumber()





    }

    public static GetInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number #1 ");
        int num1 = keyboard.nextInt();
        System.out.print("\nEnter the number #2 ");
        int num2 = keyboard.nextInt();
    }

    public static  AddTwoInput (int int){

        int sum = num1 + num2;

        System.out.println(sum);
        return sum;
    }




}
