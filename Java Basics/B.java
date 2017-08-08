class A{
   public A() { }
   public A(int i) {   
	System.out.println(i );    
   }
}
class B{
   A a = new A(2); // 4
   public static void main(String[] args){
	  A a = new A(3); //5
      B b = new B(); //1      
   }
   static A s1 = new A(1); // 2
   static A s2 = new A(4); //3
} 