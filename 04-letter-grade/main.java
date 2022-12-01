import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in); //creating a scanner
  System.out.print("Enter your grade: ");
  int g = s.nextInt();
  
  String status = pro(g);// checking if + -
  // checking the grade
  if (g == 100){// checking 100 first
    System.out.println("Your grade is an A+");
  }
  else if (g >= 90) {
    if (status.equals("true")) {
        System.out.println("Your grade is an A+");
      }
    if (status.equals("false")) {
        System.out.println("Your grade is an A-");
      }
    if (status.equals("")) {
        System.out.println("Your grade is an A");
    }
  }
  else if (80 <= g && g < 90) {
    if (status.equals("true")) {
        System.out.println("Your grade is an B+");
      }
    if (status.equals("false")) {
        System.out.println("Your grade is an B-");
      }
    if (status.equals("")) {
        System.out.println("Your grade is an B");
    }
  }
  else if (70 <= g && g < 80) {
    if (status.equals("true")) {
        System.out.println("Your grade is an C+");
      }
    if (status.equals("false")) {
        System.out.println("Your grade is an C-");
      }
    if (status.equals("")) {
        System.out.println("Your grade is an C");
    }
  }
  else if (60 <= g && g < 70) {
    if (status.equals("true")) {
        System.out.println("Your grade is an D+");
      }
    if (status.equals("false")) {
        System.out.println("Your grade is an D-");
      }
    if (status.equals("")) {
        System.out.println("Your grade is an D");
    }
  }
  else if (g < 60) {
    System.out.println("Your grade is an F");
      }
  }// end of main
  
  public static String pro (int g) {
    String status = "";
    int g1 = g%10;
    if (g1 == 7 || g1 == 8 || g1 == 9){
      status = "true";
    }
    else if (g1 == 0 || g1 == 1 || g1 == 2){
      status = "false";
  }
  return status;
  }// end of pro
}//end of class
