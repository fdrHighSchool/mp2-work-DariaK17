import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter your number: ");
    String num = s.nextLine();
    System.out.println(div(num));
    
  }//end of main
  public static boolean div (String num){
    int n = num.length();
    int sum = 0;
    for (int i=0; i<n; i++)
      sum += (num.charAt(i)-'0');//adding up
    return (sum % 3 == 0);// dividing true/false
  }//end of div
}//end of class
