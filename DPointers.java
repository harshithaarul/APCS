public class DPointers{
  public static void main(String[] args){
    System.out.println();
    MyPointer p1 = new MyPointer();
    System.out.println("MyPointer p1=" +p1);
    MyPointer p2 = p1;
    System.out.println("MyPointer p2=" +p2);
    System.out.println("MyPointer p1== MyPointer p2" + (p2==p1));
    System.out.println();
    String s1= new String();
  //  System.out.println("String s1 =" + 'x' + s1 +'x');
    // String s5 = new String("yes");
    // if(s5=="yes"){
    //   System.out.println("yessir");
    // }
    // if(s5.equals("yes")){
    //   System.out.println("yessir");
    // }
  }
}
  class MyPointer{
    public MyPointer(){

    }
  }
