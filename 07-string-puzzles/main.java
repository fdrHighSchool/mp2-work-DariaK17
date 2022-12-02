class Main {
  public static void main(String[] args) {
    System.out.println(firstHalf("WooHoo"));
    System.out.println(repeatEnd("hello", 3));
    System.out.println(countHi("hihihi"));
  }//end of main
  public static String firstHalf(String str1) {
    return str1.substring(0, str1.length() / 2);
  }// end of firstHalf method
  public static String repeatEnd(String str2, int r) {
    int l = str2.length();
    String neww = "";
    for (int i = 0; i < r; i++) {
      neww += str2.substring(l - r, l);
    }
    return neww;
  }
  public static int countHi(String str3) {
    int count = 0;
    for (int i = 0; i <= str3.length()-2; i++){
      if (str3.substring(i, i+2).equals("hi")){
        count++;
      }
    }
    return count;
  }
}
