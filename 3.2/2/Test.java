class Test {
	int Test = 305;
	
	void Test() {
		System.out.println(Test);
	}
	
	public static void main(String[] args) {
		new Test();
	}	
}

/*compila e nao imprime nada, ele instancia uma classe Test e nao chama o metodo Test()*/