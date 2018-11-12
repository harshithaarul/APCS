public class StarFigure {
  public static void main (String[] args){
   for (int i = 1; i <= 4; i++){
      for (int j = 1; j <=(-4*i+20); j++){
        System.out.print("/");
     }
     for (int n = 1; n <=(8*i-8); n++){
       System.out.print("*");
     }
     for (int l = 1; l <=(-4*i+20); l++){
       System.out.print("\\");
     }
     System.out.println();
    }
  }
}
