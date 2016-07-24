/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.hseb;

import com.sajeena.hseb.Package.marks;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while(true)
        {

        System.out.println("1.Enter Student");
        System.out.println("2.Enter Subjects:");
        System.out.println("3.Enter Marks");
        System.out.println("4.Exit");
        System.out.println("Enter your choice:[1-4]");
        int choice = input.nextInt();
        marks m=new marks();
        switch (choice) {
            case 1:
                m.studentsname();
                break;
            case 2:
                m.subjectname();
                break;
            case 3:
                m.markentry();
                break;
            case 4:
                System.exit(0);
                break;
        }
 System.out.print("Do you want to continue?(Y/N):");
                    String t=input.next();
                    if(t.equalsIgnoreCase("N")){
                    System.exit(0);
                    }        }
        

    }

}
