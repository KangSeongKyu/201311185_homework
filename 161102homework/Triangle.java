class Triangle {
  
  static void starTri(int x) {
    String s = "*";
    String w = " ";
    StringBuffer sbuf = new StringBuffer();
    StringBuffer wbuf = new StringBuffer();
    
    for(int k=0; k<x; k++) {
      for(int i=0; i<x-k; i++) {
        wbuf.append(w);        
      }
      System.out.printf("%s",wbuf.toString());
      wbuf.delete(0,wbuf.length());
      for(int j=0; j<k*2+1; j++) {
        sbuf.append(s);             
      }
      System.out.printf("%s", sbuf.toString());           
      sbuf.delete(0,sbuf.length());
      System.out.printf("\n");
    }
  }
  public static void main(String[] args){
    int x = 5;
    
    starTri(x);
  }
}