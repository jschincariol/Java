class Test {
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++)
			System.out.println(i);	
			System.out.println(i);
		System.out.println("finished");
	}
}

/*Não compila, variavel i fora de escopo do for*/