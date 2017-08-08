class Person {
	static int id = 15;
}

class Test {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("p.id: " + p.id);
		System.out.println("Person.id: " + Person.id);
		Person p2 = new Person();
		System.out.println("p2.id = p2.id + 1;");
		p.id = p2.id + 1;
		System.out.println("p1.id: " + p.id);
		System.out.println("p2.id: " + p2.id);
		System.out.println("Person.id: " + Person.id);
	}
}