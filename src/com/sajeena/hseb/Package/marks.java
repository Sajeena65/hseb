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
public class marks {
    String[] student=new String[3];
    String[] subject=new String[3];
    double[][] mark=new double[3][3];
    Scanner st=new  Scanner(System.in);
    
   
    public void studentsname(){
     for(int i=0;i<student.length;i++){   
    
    System.out.println("Enter name:");
    student[i]=st.next();
        
    }
     
    }
    public void subjectname(){
         for(int i=0;i<subject.length;i++){   
    
    System.out.println("Enter subjectname:");
    String subject=st.next();
    
    }
        
    }
    public void markentry(){
   
        for(int i=0;i<student.length;i++){
            System.out.println("marksheet of:"+student[i]);
            
            for(int j=0;j<subject.length;j++){
                System.out.println("Enter marks for"+subject[j]);
                mark[i][j]=st.nextDouble();
            }
        }
    }
}

