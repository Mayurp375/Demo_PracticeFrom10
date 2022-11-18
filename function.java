package com.Pracrice_on_packageAndaccesModifier;

import java.util.Scanner;

public class function {
    public static void myName(String name) {
        System.out.println(name);

    }

     static void  myMethod(String name)
    {
        System.out.println(name + "mayur");

    }

    static int myMethod(int x){
        return 5+ x;
    }

    static void chackAge(int age){
        if (age< 18){
            System.out.println("Access denied");
        }else{
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
//        System.out.println("enter your name");
 Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//        myName(name);

        myMethod("mayur");
        myMethod("vijay");
        myMethod("polojwar");



        System.out.println(myMethod(11));
//        int i = sc.nextInt();
        chackAge(18);

    }


}
