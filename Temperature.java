class Temperature {
	public void changeTemp(double t){
	
		if(t<32) {
			double fah=(t*1.8)+32;
			System.out.printf("F to C : %.1f", fah);
    			System.out.println();
		}else if(t>32){
			double cel=(t-32)/1.8;
			System.out.printf("C to F : %.1f", cel);
    			System.out.println();
		}else{
	
			System.out.println("user input error");
		}
	}
	
	public static void main(String[] args) {
		Temperature t = new Temperature();
	
		t.changeTemp(25);
	}
		
}
