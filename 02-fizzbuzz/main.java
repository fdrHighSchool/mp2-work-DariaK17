class Main {
  public static void main(String[] args) {
    for (int i = 1; i< 101; i++) {
      System.out.println(i + " : " + ans(i));
    }//end of for loop
  }// end of main method
  public static String ans(int num) {
    String answer = "";
    if (num%3 == 0 && num%5 == 0) {
        answer = ("fizzbuzz");
    }//end of if
    else if (num%3 == 0){
        answer = "fizz";
    }//end of else if
    else if (num%5 == 0){
        answer = "buzz";
    }//end of else if
    else {
        answer = String.valueOf(num);
    }//end of else
  return answer;
  }
}//end of class
