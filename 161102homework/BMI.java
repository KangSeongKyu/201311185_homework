class BMI {
  static void bmichecker(double w, double h) {
    double bmi = w/h/h;
    if(bmi<18.5) {
      System.out.println("low");
    }else if(18.5<=bmi && bmi<23) {
      System.out.println("normal");
    }else if(23<=bmi && bmi<25) {
      System.out.println("risky");
    }else if(25<=bmi && bmi<30) {
      System.out.println("obesity");
    }else if(30<=bmi && bmi<40) {
      System.out.println("super obesity");
    }else if(40<bmi) {
      System.out.println("jumbo obesity");
    }else{
      System.out.println("error!");
    }
  }
  
  public static void main(String[] args) {
    double w = 64.4;
    double h = 1.74;
    //키는 m단위, 체중은 kg단위//
    
    bmichecker(w,h);
  }
}