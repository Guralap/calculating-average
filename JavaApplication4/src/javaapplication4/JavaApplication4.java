/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author 1691677
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double total=0;
        
        
        int gradeCounter=1;
        
        while(gradeCounter<=10)
        {
            System.out.print("enter grade:");
           
            double grade=input.nextDouble();
            
           
             
            if (grade<0){
                System.out.print("Invalid grade\n");
            }
             else if (grade>100){
            
            System.out.print("Invalid grade\n");
             }
             else{
             total=total+grade;
            gradeCounter=gradeCounter+1;
             }
            
        }
         
        
        double average=total/10.0;
        System.out.printf("%ntotal of all 10 grades is %.2f%n",total);
        System.out.printf("class average is %.2f%n",average);
        if (average>80){
            System.out.print("Result is very good");
        }
            else if(average>50){
            System.out.print("Result is good");
               
            }
        else 
        System.out.print("Result is bad");
    }
    
}
