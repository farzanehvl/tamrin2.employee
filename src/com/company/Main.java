package com.company;
import com.company.company.employee;
import java.util.Date;
import java.util.Scanner;
//import com.company.company.Date;
import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        String [] arrayF={"fish","Spaghetti","pizza","italian food"};
        Scanner sc = new Scanner(System.in);
        //  int i =sc.nextInt();
        String getfname, getlname, getusername;
        int getpassword;
        int num = 0;
        int j = 1;
        long startTime = System.nanoTime();
        System.out.print("Please enter your first name :");
        getfname = sc.next();
        System.out.print("please enter your last name :");
        getlname = sc.next();
        System.out.print("please enter your username :");
        getusername = sc.next();
        System.out.print("please enter your password :");
        getpassword = sc.nextInt();
        employee emp = new employee(getfname, getlname, getusername, getpassword);
        Date date1 = new Date();
        System.out.printf("your entry date:\n"+date1);
        System.out.println("\n");

        do{
        System.out.println("\nwhat do you want to do?");
        System.out.println(" 1.morakhasi\n 2.Reserve\n 3.exit\n");
        Scanner scr = new Scanner(System.in);
        int k = scr.nextInt();




    if (k == 1) {
        j+=1;
    }
    else if (k == 2) {
        for (int i = 0; i < arrayF.length; i++) {
            int o=i+1;
            System.out.println(""+o+". "+arrayF[i] + " ");
           // int w=scr.nextInt();

        }

        int w=scr.nextInt();
        System.out.println("your meal was reserved!");
    }
    if (k==1&&j <=3) {
        System.out.println("your request was accept");
    } else if(k==1&&j>3) {
        //System.out.println("your request was accept");
        System.out.println("warning: you cannot use this anymore!");

    } /*else if (k == 2) {
        System.out.println("your meal was reserved!");
    }*/
    System.out.println("do you want enything else?\n1.yes\n2.no");
    Scanner h = new Scanner(System.in);
    int f = h.nextInt();
        if(f==1){
            num=1;

    }
    else if(f==2||k==3){
        break;
        }

         num++;

      }while (num>0);
        Date date2 = new Date();
        System.out.println("your leaving Time is:\n" + date2);
        System.out.println("\n");
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        double l=0.001*60;
        double f=totalTime%l;
        System.out.println("your total time is:\n"+f+"\tminute");



    }
}











