class Main {
  public static void main(String[] args) {
    int num =0;
    int cents =0;// testing
    System.out.println(count(num));
    System.out.println(countQuarters(cents));
  }//end of main method
  public static int count(int num) {
    String num1 = String.valueOf(num);
    if (num1.length() < 2) {
      return 0;
    }//end of if statemnet
    String newnum = num1.substring(num1.length()-2, num1.length());
    int f = Integer.parseInt(newnum);
    f = f/25;
    return f;
    }//end of count
  
  public static int countQuarters(int cents) {
    cents = cents % 100;
    return cents / 25;
  }//end of countQuarters(testing)
}//eng of class
