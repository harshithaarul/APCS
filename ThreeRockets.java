public class ThreeRockets{
  public static void cone(){
      System.out.println("   / \\      / \\      / \\ ");
      System.out.println("  /   \\    /   \\    /   \\");
      System.out.println(" /     \\  /     \\  /     \\");
  }
  public static void box (){
      System.out.println(" +------+ +------+ +------+");
      System.out.println(" |      | |      | |      |");
      System.out.println(" |      | |      | |      |");
      System.out.println(" +------+ +------+ +------+");
  }
  public static void us (){
      System.out.println(" |United| |United| |United|");
      System.out.println(" |States| |States| |States|");
  }
  public static void main (String[] args){
    cone();
    box();
    us();
    box();
    cone();
  }
}
