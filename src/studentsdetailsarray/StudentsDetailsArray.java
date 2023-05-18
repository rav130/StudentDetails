/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentsdetailsarray;

import java.util.Scanner;


public class StudentsDetailsArray {

  
    public static void main(String[] args) {
       Student[] list=new Student[3];
       Scanner scan= new Scanner(System.in);
       
       
       
       for(int i=0; i<list.length; i++){
           
           System.out.println("enter name");
          String name =scan.nextLine();
           System.out.println("enter age");
          int age=scan.nextInt();
          
             Student s1=new Student(name,age);
             list[i]=s1;
       }
      
        for(int i=0; i<list.length;i++){
            System.out.println(list[i]);
        }
    }
    
}
