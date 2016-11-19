class SeoulCalc {
  static void dataseoul() {
    int[][] data={
      {74425, 76326},
      {61164, 61636},
      {109688, 115744},
      {144796, 146776},
      {174996, 181676},
      {177841, 177434},
      {204630, 205980},
      {223373, 232245},
      {161055, 166130},
      {171576, 176735},
      {279169, 293772},
      {239450, 251066},
      {148690, 156510},
      {182977, 196992},
      {237792, 242641},
      {283869, 296762},
      {209344, 210282},
      {118965, 114441},
      {186503, 186856},
      {195734, 203014},
      {254381, 249472},
      {212401, 229111},
      {271654, 295354},
      {319197, 335045},
      {229829, 231671}
    };
    
    String[] city = {"Jongno-gu","Joong-gu","Yongsan-gu","Sungdong-gu",
                     "Gwangjin-gu","Dongdaemun-gu","Joongrang-gu","Sungbuk-gu",
                     "Kangbuk-gu","Dobong-gu","Nowon-gu","Eunpyeong-gu",
                     "Seodaemun-gu","Mapo-gu","Yangcheon-gu","Kangseo-gu",
                     "Guro-gu","Keumcheon-gu","Yeongdeungpo-gu","Dongjak-gu",
                     "Kwanak-gu","Seocho-gu","Kangnam-gu","Songpa-gu","Kangdong-gu"};
    
    for(int i=0; i<data.length; i++) {
      int menNum+=data[i][0];
      int womNum+=data[i][1];
      for(int j=0; j<data[i].length; j++) {
        int secNum+=data[i][j];
      }
      System.out.println(city[i] + " Total Population: " + secNum);
    }
    
    System.out.println(" ");
    
    float menAvg=menNum/data.length;
    float womAvg=womNum/data.length;
    
    System.out.println("Seoul Men's Total Population: "+menNum);
    System.out.println("Seoul Men's Total Population Average: "+menAvg);
    System.out.println("Seoul Women's Total Population: "+womNum);
    System.out.println("Seoul Women's Total Population Average: "+womAvg);
    
    System.out.println(" ");
    
    for (int i = 0; i < data.length; i++) {
			System.out.print("(");
			for (int j = 0; j < data[i].length; j++)
				System.out.printf(" %d ", data[i][j]);
			System.out.print(")\n");
		}
  }
  
  public static void main(String[] args) {
    dataseoul();
  }
}