class A{
   public A() { }
   public A(int i) {   System.out.println(i );    }
}
class Inicializacao{
   static A s1 = new A(1);
   A a = new A(2);
   public static void main(String[] args){
      Inicializacao b = new Inicializacao();
      A a = new A(3);
   }
   static A s2 = new A(4);
}