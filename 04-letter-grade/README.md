# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    public static String pro (int g) {
    String status = "";
    int g1 = g%10;
    if (g1 == 7 || g1 == 8 || g1 == 9){
      status = "true";
    }
    else if (g1 == 0 || g1 == 1 || g1 == 2){
      status = "false";
  }


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  i fixed it by checking if its 100 first and if its not rhen we move on


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
   everything below 60 is just F, it doesnt check the second number
