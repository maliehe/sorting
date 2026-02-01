/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist;

/**
 *
 * @author mphoyanga
 */

import java.util.Scanner;
public class NewarrayClass {
    public static void main(String[]args){
         Scanner obj=new Scanner(System.in);
         
         int[]number=new int[10];
         
         System.out.println("Enter 10 integer numbers:");
         
         number[0]=obj.nextInt();
          number[1]=obj.nextInt();
           number[2]=obj.nextInt();
            number[3]=obj.nextInt();
             number[4]=obj.nextInt();
              number[5]=obj.nextInt();
               number[6]=obj.nextInt();
                number[7]=obj.nextInt();
                 number[8]=obj.nextInt();
                  number[9]=obj.nextInt();
         
                  for(int i=0;1<=number.length;i++){
                      System.out.println(number[i]);
                  }
               
    }
}
