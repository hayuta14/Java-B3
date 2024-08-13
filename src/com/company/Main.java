package com.company;

import com.model.Person;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.stream.DoubleStream.concat;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scan = new Scanner(System.in);
        System.out.println("========Shopping program==========");
        System.out.println("input number of bill");
        int numBill = scan.nextInt();

        int[] bill = new int[20];
        for(int i=0;i<numBill;i++){
            int a=i+1;
            System.out.println("Input value of Bill "+ a);

            int billIndex = scan.nextInt();
            bill[i]=billIndex;
        }


        System.out.println("input value of wallet: ");
        int wallet = scan.nextInt();
        Person.Wallet amount = new Person.Wallet();
        int temp=person.calcTotal(bill);
        amount.acceptMoney(wallet,temp);

//        System.out.println("Enter make:");
//        String make = scan.nextLine();
//        System.out.println("Enter model:");
//        String model = scan.nextLine();



    }
}