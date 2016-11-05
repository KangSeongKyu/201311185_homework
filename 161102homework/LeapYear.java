class LeapYear {
  static void calcyear(int x) {
    if(x%4==0 && x%100!=0 || x%400==0) {
      System.out.println(x+": a leap year!!");
    }else{
      System.out.println(x+": not a leap year...");
    }
  }
   
  public static void main(String[] args){
    int x=2016;
    calcyear(x);
    System.out.println();
    int y=2017;
    calcyear(y);
  }
}