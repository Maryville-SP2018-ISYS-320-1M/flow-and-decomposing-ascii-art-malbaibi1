import javax.print.DocFlavor.STRING;

/*
<<<<<<< HEAD
  	ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/16/2018
*/

// 1. Your predicted output 
/*
   This is message1.
   This is message2.
   This is message1.
   Done with message2.
   Done with main. 
*/


public class Tricky{
  public static void main(STRING[] args) {
	message1();
	message2();
	System.out.println("Done with main.");
}

public static void message1() {
	System.out.println("This is message1.");
=======
   ISYS 320
   Name: Mansour Albaibi
   Date: 3/18/2018
*/

// 1. Your predicted output
/* 
   This is message1. 
   This is message2. 
   This is message1. 
   Done with message2. 
   Done with main.
*/
 

public class Tricky {
  public static void main(String[] args){
    message1();
    message2();
    System.out.println("Done with main.");
  }
  
  public static void message1(){
    System.out.println("This is message1.");
  }
  public static void message2(){
    System.out.println("This is message2.");
    message1();
    System.out.println("Done with message2.");
  }
}

// 3. Were you correct? Explain any differences
/* Prediction is entirely correct
   Reason:
   message1() is a public method of same class Tricky which can be access in method message2().
*/
 
 
>>>>>>> b44fe02375e8643f1f3a06e727ae6282e68e4909

}

public static void message2() {
	System.out.println("This is message2.");
	message1();
	System.out.println("Done with message2.");
  }
  
}

// 3. Were you correct? Explain any differences
/* Prediction is entirely correct.
  Reason:
  message1() is a public method of same class Tricky which can be access in method message2().
 */