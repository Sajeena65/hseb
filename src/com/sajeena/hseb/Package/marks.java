/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.hseb.Package;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Marks {

    String[] student;
    String[] subject;
    double[] mark;
    double total=0;
    boolean isfailed=false;
    double studper;
    int s = 0;
    Scanner st;

    public Marks(Scanner st, String[] student, String[] subject, double[] mark) {
        this.st = st;
        this.student = student;
        this.subject = subject;
        this.mark = mark;

    }

    public void studentsname() {

        if (s < 6) {

            System.out.println("Enter name:");
            student[s] = st.next();
            s++;
        } else 
            System.out.println("You cannot move forward");

        

    }

    public void subjectname() {
        for (int i = 0; i < subject.length; i++) {

            System.out.println("Enter subjectname:");
            subject[i] = st.next();

        }

    }

    public void markentry() {

        for (int i = 0; i < subject.length; i++) {
            System.out.println("Enter the marks of " + subject[i]);

            mark[i] = st.nextDouble();
            if (mark[i] < 32) {
                isfailed = true;

            }
            total+= mark[i];
        }
    }

    public void grade() {
        if (isfailed==true) {
            System.out.println("Result: Failed");
        } else {
            studper = (total / subject.length);
            System.out.println("Percentage:" + studper + "%");
            if (studper >= 80) {
                System.out.println("Distinction!");
            } else if (studper >= 60 && studper < 80) 
                System.out.println("First Division!");
            else if (studper >= 50 && studper < 60) 
                System.out.println("Second Division!");
            else if (studper < 50) 
                System.out.println("Third Division!");
            

        }

    }
}
