/*

Trace through the code in each problem below by hand, and then run this file
to see if your result matches the expected result.

Note the new syntax of using the String type in Java -- we will go over this
in more detail later in the semester.

*/

public class Homework2{

    public static void problem1(){
      int x = 10;
      boolean y = false;
      String result = "";
  
      if(x >= 10){
          if (!y){
              result = "medium";
          }else{
              result = "average";
          }
      }else if(x >= 13){
          if(!y){
              result = "large";
          }else{
              result = "big";
          }
      }else
          result = "small";
  
    }
  
    public static void problem2(){
      int x = 10;
      boolean y = true;
      String result = "";
  
      if(x >= 10){
          if (!y){
              result = "medium";
          }else{
              result = "average";
          }
      }else if(x >= 13){
          if(!y){
              result = "large";
          }else{
              result = "big";
          }
      }else
          result = "small";
  
    }
  
    public static void problem3(){
      int x = 16;
      boolean y = false;
      String result = "";
  
      if(x >= 10){
          if (!y){
              result = "medium";
          }else{
              result = "average";
          }
      }else if(x >= 13){
          if(!y){
              result = "large";
          }else{
              result = "big";
          }
      }else
          result = "small";
  
    }
  
    public static void problem4(){
      int x = 16;
      boolean y = true;
      String result = "";
  
      if(x >= 10){
          if (!y){
              result = "medium";
          }else{
              result = "average";
          }
      }else if(x >= 13){
          if(!y){
              result = "large";
          }else{
              result = "big";
          }
      }else
          result = "small";
  
    }
  
    public static void problem5(){
      int x = 5;
      boolean y = true;
      String result = "";
  
      if(x >= 10){
          if (!y){
              result = "medium";
          }else{
              result = "average";
          }
      }else if(x >= 13){
          if(!y){
              result = "large";
          }else{
              result = "big";
          }
      }else
          result = "small";
  
    }
  
    public static void problem6(){
      boolean result = false || (false || true);
  
    }
  
    public static void problem7(){
      int x = 7;
      int result = 0;
  
      if(x >= 7){
        result = 1;
      }
      if (x >= 6){
        result = 2;
      }
  
    }
  
    public static void problem8(){
      int x = 7;
      int result = 0;
  
      if(x >= 7){
        result = 1;
      }
      if (x < 6){
        result = 2;
      }else{
        result = 3;
      }
  
    }
  
    public static void problem9(){
      boolean result = false && (false || true);
  
    }
  
    public static void problem10(){
      int num1 = 1;
      boolean condition = true && (num1 == 2);
      int result = num1;
  
    }
  
    public static void main(String[] args){
      System.out.println("We expected medium for problem1");
      System.out.println("We expected average for problem2");
      System.out.println("We expected medium for problem3");
      System.out.println("We expected average for problem4");
      System.out.println("We expected small for problem5");
      System.out.println("We expected true for problem6");
      System.out.println("We expected 2 for problem7");
      System.out.println("We expected 3 for problem8");
      System.out.println("We expected false for problem9");
      System.out.println("We expected 1 for problem10");
    }
  
  }