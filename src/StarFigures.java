/*
   ISYS 320
   Name: Mansour Albaibi
   Date: 3/18/2018
*/

// 4. Your pseudocode algorithm for how to break down the figure
/* 
  step1: create a class named StarFigures.
  step2: create three public methods named pattern1, pattern2, and pattern3.
  step3: In pattern1 method:
  a. create a two for loop structure that will print two lines of 5 stars each without spacing.
  b. outer loop control number of lines to be printed.
  c. inner loop control number of stars to be printed.
  step4: In pattern2 method:
  a. create a loop structure that will print threelines of 2, 1, and 2 stars respectively with spacing.
  b. outer loop control number of lines to be printed.
  c. if statement will print stars if number of lines greater then 0.
     1. first inner loop control number of spaces to be printed.
     2. second inner loop control number of stars to be printed.
  d. else statement will print stars if number of line is less then 1.
     1. inner loop control number of stars to be printed.
  step5: In pattern3 method:
  a. create a loop that will print three lines of 1 star each with spacing.
*/


public class StarFigures {

 public static void main(String[] args) {
   pattern1();
   pattern2();
   System.out.println();          //to print a new line  
   System.out.println();          //to print a new line
   pattern1();
   pattern2();
   pattern1();
   System.out.println();          //to print a new line
   System.out.println();          //to print a new line
   pattern3();
   pattern1();
   pattern2();

 }
  public static void pattern1(){
        for(int i=2; i>=1; i--)
        {
          for(int j=1; j<=5; j++)        //loop for printing stars
                System.out.print("*");
            
          System.out.println();          //to print a new line
        } 
  }
  public static void pattern2(){
        int spc=1;
        for(int i=2; i>=0; i--)
        {
          if(i>0)
          { for(int j=1; j<=spc;j++)      //loop for printing spaces
                System.out.print(" ");
             
            for(int j=1; j<=i; j++)        //loop for printing stars
                System.out.print("* ");
            
            System.out.println();         //to print a new line
            spc++;
          }
          else
          { for(int j=1; j<=2; j++)       //loop for printing spaces
                System.out.print(" *");
          
            System.out.println();          //to print a new line
          }  
        }
  }
  public static void pattern3(){
        for(int i=3; i>=1; i--)
        {
            System.out.print("  *  ");    //to print a star
            
            System.out.println();         //to print a new line
        } 
  }

}





