import java.util.ArrayList;
import java.util.Collections;

class StudentSort{
  private String name;
  private int num;
  
  StudentSort(String name, int num) {
    this.name=name;
    this.num = num;
  }
  
  public String getName() {
    return name;
  }
  
  static void student() {
    ArrayList<String> arr = new ArrayList<String>();
    
    StudentSort s1 = new StudentSort("Carrick",1);
    StudentSort s2 = new StudentSort("Drogba",5);
    StudentSort s3 = new StudentSort("Evra",4);
    StudentSort s4 = new StudentSort("Bale",3);
    StudentSort s5 = new StudentSort("Alexis",2);
    
    arr.add(s1.getName());
    arr.add(s2.getName());
    arr.add(s3.getName());
    arr.add(s4.getName());
    arr.add(s5.getName());
    
    Collections.sort(arr);
    
    System.out.println(arr);
  }
  
  public static void main(String[] args) {
    student();
  }
}