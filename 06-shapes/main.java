class Main {
  public static void main(String[] args) {
    System.out.println("Square");
    s(2);
    System.out.println();
    s(5);
    System.out.println();
    r(4,2);
    System.out.println();
    t(5);
    System.out.println();
    y(10);
  }//end of main
  public static void s (int l) {
    for (int row = 0; row < l; row++){
      for (int col = 0; col <l; col++){
        System.out.print("* ");
      }//end of inner loop
    System.out.println();
    }// end of outer loop
  }// end of s
  public static void r (int l, int w) {
    for (int row = 0; row < l; row++){
      for (int col = 0; col <w; col++){
        System.out.print("* ");
      }//end of inner loop
    System.out.println();
    }// end of outer loop
  }// end of r
  public static void t(int h){
    for(int row=0; row<h; row++){
      for(int col=0; col<=row; col++){
        System.out.print("* ");
      }//end of inner loop
    System.out.println();
    }//end of outer loop
  }//end of t
  public static void y(int n) {
    for (int row =0; row<= n; row++){
      for (int col = row; col <= n; col++)
        System.out.print(" ");
      for (int col = 0; col <= row; col++ ) {
        System.out.print("* ");
      }
      System.out.println();
    }//end of 
  }//end of y
}//end of class
