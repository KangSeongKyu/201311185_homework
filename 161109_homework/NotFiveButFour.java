import java.util.ArrayList;

class NotFiveButFour{
  
  static void sharenum() {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int sum=0;
    
    for(int i=1; i<=1000; i++) {
      if(i%4==0 && i%5!=0) {
        arr.add(i);
        
        sum+=i;
      }
    }
    System.out.println(arr);
    System.out.println("sum: "+sum);
  }
  
  public static void main(String[] args) {
    sharenum();
  }
}