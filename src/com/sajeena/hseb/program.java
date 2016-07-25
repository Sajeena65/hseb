/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.hseb;

import com.sajeena.hseb.Package.Marks;
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
        String[] student = new String[6];
        String[] subject = new String[6];
        double[] mark = new double[subject.length];

        Scanner st = new Scanner(System.in);
        Marks m = new Marks(st, student, subject, mark);

        while (true) {

            System.out.println("1.Enter Student:");
            System.out.println("2.Enter Subjects:");
            System.out.println("3.Enter Marks:");
            System.out.println("4.View Grade:");
            System.out.println("5.Exit");
            System.out.println("Enter your choice[1-5]:");
            int choice = st.nextInt();
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
                    m.grade();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }

        }

    }
}
