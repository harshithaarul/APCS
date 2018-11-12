public class StarFigure2 {
  public static final int hEIGHT = 5;

  public static void main (String[] args){
    for (int i = 1; i <= hEIGHT; i++){
       for (int j = 1; j <=((hEIGHT*4)-4*i); j++){
         System.out.print("/");
      }
      for (int n = 1; n <=(8*i-8); n++){
        System.out.print("*");
      }
      for (int l = 1; l <=((hEIGHT*4)-4*i); l++){
        System.out.print("\\");
      }
      System.out.println();
     }
  }
}
