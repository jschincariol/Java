class A {
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(args[0]);
	}
}

/*Ao rodar sem argumentos, ocorre uma ArrayIndexOutOfBoundsException na linha 5*/