class CompareScore {

	public void score(double m) {

		if(90<=m && m<=100) {
			System.out.println("your score is A");
		}else if(80<=m && m<90) {
			System.out.println("your score is B");
		}else if(70<=m && m<80) {
			System.out.println("your score is C");
		}else if(60<=m && m<70) {
			System.out.println("your score is D");
		}else if(50<=m && m<60) {
			System.out.println("your score is E");
		}else {
			System.out.println("your score is F");
		}

	}

	public static void main(String[] args) {

	CompareScore t = new CompareScore();

	t.score(67);
	}
}