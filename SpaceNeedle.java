public class SpaceNeedle{
  public static final int SIZE = 4;
  public static int num = 0;
  public static int spaces = ((SIZE*2)+(SIZE-1))-2;
  public static int triangle =(SIZE*2)+(SIZE-1);
  public static void needle(){
    for(int i=1;i<=SIZE; i++){
      for(int j =1; j<=SIZE*3; j++){
        System.out.print(" ");
      }
      System.out.println("||");
    }
  }
  public static void head(){
    num = 0;
    spaces = ((SIZE*2)+(SIZE-1))-2;
    for(int i=1; i<=SIZE; i++){
      for(int x=1; x <=spaces; x++){
        System.out.print(" ");
      }
      spaces = spaces - 3;
      System.out.print("__/");
      for(int j=1; j<=num; j++){
        System.out.print(":");
      }
      System.out.print("||");
      for(int k=1; k<=num; k++){
        System.out.print(":");
      }
      System.out.println("\\__");
      num = num+3;
    }
  }
  public static void line(){
    System.out.print("|");
    for(int i=1; i<=SIZE*6; i++){
      System.out.print("\"");
    }
    System.out.println("|");
  }
  public static void base(){

    spaces = 0;
    for(int i=1; i<=SIZE; i++){
      for(int j=1; j<=spaces; j++){
        System.out.print(" ");
      }
      System.out.print("\\_");
      spaces = spaces + 2;
      for(int k=1; k<=triangle; k++){
        System.out.print("/\\");
      }
      triangle = triangle -2;
      System.out.println("_/");
    }
  }
  public static void rod(){
    spaces = (SIZE*3)-1-(SIZE/2);
    for(int i=1; i<=SIZE*SIZE; i++){
      for(int j=1; j<=spaces; j++){
        System.out.print(" ");
      }
      System.out.print("|");
      for(int k=1; k<=SIZE/2;k++){
        System.out.print("%");
      }
      System.out.print("||");
      for(int h=1; h<=SIZE/2;h++){
        System.out.print("%");
      }
      System.out.println("|");
    }
  }
  public static void main(String[] args){
    needle();
    head();
    line();
    base();
    needle();
    rod();
    head();
    line();
  }
}


// public class SpaceNeedle {
//   public static final int SIZE = 4;
//   public static void bottom (){
//     for (int i = 1; i <= 5; i++){
//       System.out.println();
//       for (int j = 1; j <=(i-1); j++){
//         System.out.print(" ");
//       }
//       System.out.print("\\");
//       for (int k = 1; k <= (11-2 *i); k++){
//         System.out.print("o");
//         }
//       System.out.print("/");
//       for (int k = 1; k <= (i); k++){
//         System.out.print("  ");
//         }
//     }
// System.out.println("*");
//   }
//
//   public static void top (){
//     for (int i = 0; i <= (SIZE); i++){
//       System.out.println();
//       for (int j = 1; j <=(-3*i+9); j++){
//         System.out.print(" ");
//       }
//       System.out.print("_/");
//       for (int k = 1; k <= (i+ (3*i-5)); k++){
//         System.out.print(":");
//         }
//         for (int h = 1; h <= 1; h++){
//           System.out.print("||");
//           }
//           for (int z = 1; z <= (i+ (3*i-5)); z++){
//             System.out.print(":");
//             }
//       System.out.print("\\_");
//       // for (int k = 1; k <= (i); k++){
//       //   System.out.print("  ");
//       //   }
//     }
//     System.out.println();
//     for (int a = 1; a <= (6*SIZE); a++){
//       System.out.print("\"");
//       }
//   }
//   public static void middle (){
//      System.out.println();
//      for (int line = 1; line <= (SIZE); line++) {
//        System.out.print("||");
//        System.out.println();
//     }
//     for (int line = 1; line <= (SIZE*4); line++) {
//       System.out.print("|");}
//       for (int line = 1; line <= (SIZE*4); line++) {
//       for (int b = 1; b <= (SIZE/2); b++) {
//         System.out.print("%");
//           System.out.print("||");}
//           for (int d = 1; d <= (SIZE/2); d++) {
//             System.out.print("%");
//           for (int e = 1; e <= (SIZE*4); e++) {
//             System.out.print("|");
//
//       for (int j = 1; j <=(2*SIZE+1); j++){
//         System.out.print(" ");
//
// }}}}
//
// }
//
//
//   public static void main (String[] args){
//     top();
//   //  middle();
//     // bottom();
//   }
// }
