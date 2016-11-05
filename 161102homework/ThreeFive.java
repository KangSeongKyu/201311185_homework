class ThreeFive {
  static int sum=0;

  static void tfsum() {
    for(int i=0; i<1000; i++) {
      if(i%3==0 || i%5==0) {
        sum+=i;
      }
    }
    System.out.println("sum of all the multiples of 3 or 5 below 1000: "+sum);
  }
  public static void main(String[] args) {
    tfsum();
  }
}