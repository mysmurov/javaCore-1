package JavaMentor.Stepik;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(leapYearCount(100));

    }
    public static int leapYearCount(int year) {
      int leap400 = year / 400;
      int leap4 = year / 4;
      int noLeap4 = year / 100;
      int leap = (leap400 + leap4) - noLeap4;
      return leap;
    }
}
