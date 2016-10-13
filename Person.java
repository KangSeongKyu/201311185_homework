class Person {
	private float weight;
	public void setWeight(float w) {
		this.weight = w;
	}
	private float getWeight() {
		return weight;
	}
}

Person me = new Person();
me.setWeight((float)65.0);
System.out.println(me.getWeight());