import java.util.Calendar;

class SundayCount {
  static int sunday = 0;
  static Calendar c = Calendar.getInstance();
  
  static void suncnt() {
    for(int y=1901; y<=2000; y++) {             /*1901년~2000년*/
      for(int m=0; m<=11; m++){                 /*1월(0)부터 12월(11)까지*/
        c.set(y,m,1);                           /*연도,달,주 설정*/
        if(c.get(Calendar.DAY_OF_WEEK)==1) {    /*1=sunday*/
          sunday++;
        }
      }
    }
    System.out.println("Sunday Count: "+sunday);
  }
  
  public static void main(String[] args) {
    suncnt();
  }
}