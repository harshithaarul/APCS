public class TimeCapsule {
  public static final int TOPO = 1;
  public static void bottom (){
    for (int i = 1; i <= 5; i++){
      System.out.println();
      for (int j = 1; j <=(i-1); j++){
        System.out.print(" ");
      }
      System.out.print("\\");
      for (int k = 1; k <= (11-2 *i); k++){
        System.out.print("o");
        }
      System.out.print("/");
      for (int k = 1; k <= (i); k++){
        System.out.print("  ");
        }
    }
System.out.println("*");
  }

  public static void top (){
    System.out.print("*");
    for (int i = 1; i <= 5; i++){
      System.out.println();
      for (int j = 5; j >=i; j--){
        System.out.print(" ");
      }
      System.out.print("/");
      for (int k = 1; k <= (i+ (i-1)); k++){
        System.out.print("o");
        }
      System.out.print("\\");
      // for (int k = 1; k <= (i); k++){
      //   System.out.print("  ");
      //   }
    }
  }
  public static void middle (){
    System.out.println();
    int line =1;
  for (line = 1; line <= 7; line++) {
    System.out.print("|@");
    for ( int i = 1; i <= (line-1); i++) {
      System.out.print(" ");
      for (line = 1; line <= 7; line++) {
  System.out.print("@|");
}
}
}
}

  public static void main (String[] args){
    top();
    middle();
    bottom();
  }
}
