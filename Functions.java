public class MyClass {
    
//   public static void f(int n){
      
//       for(int i=1; i<=n; i++){
          
//           for(int j=1; j<=i; j++){
//               System.out.print(j + "");
//           }
          
//           System.out.println();
//       }
//   }

//   public static int add(int a, int b){
      
//       return a+b;
//   }

  public static void swap(int x, int y){
      
      int temp = x;
      x = y;
      y = temp;
      
      System.out.println(x + " " + y);
  }
  
  public static String concat(String s){
      
      s = s + "abc";
      
      return s;
  }
  
  public static void main(String args[]) {
      
      String s = "xyz";
      
      s = concat(s);
      
      System.out.println(s);
    
    // int a = 5;
    // int b = 6;
    
    // swap(a,b);
    
    // System.out.println(a + " " + b);
    
    //System.out.println(add(6,7));
    
    // int n = 4;
    // f(n);
    
    // n = 5;
    // f(n);
    
  }
}