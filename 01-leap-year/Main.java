public class Main {
    public static void main(String [] args){
        int year=2000;
        System.out.println(isleapyear(year));
    }// end of main method
    public static boolean isleapyear(int year) {
        boolean status = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                     status = true;
                }//end of inner if statement
            }//end of inner if statement
            else {
                status = true;
            }//end of else
        }//end of outer if statement
        return status;
    }//end of isleapyear method
}// end of class
