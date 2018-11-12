public class ex3_2{
  public static void main(String[]b){
    float initial=1000;
    while(initial<9969){
      float e=(initial*0.065f);
      System.out.println("Current balance: "+initial+"\nInterest: "+e+"\nDeposit: 100\nNew balance: "+(initial+=100+e));
    }
  }
}
