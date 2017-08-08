public class RoundSwitch{
  public static int getSwitch(String str){
	  System.out.println((int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) ));
      return (int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) );
  }
  public static void main(String args []){
    switch(getSwitch(args[0])){
	  case -1: System.out.print("-1 ");
      case 0 : System.out.print("Hello ");
      case 1 : System.out.print("World");
	  case 1111: System.out.print("1111 ");break;
	  case -10: System.out.print("-10 ");
      default : System.out.print("Good Bye");
    }
  }
}