public class rajvs{
   void swap(int a,int b,int c,int d)
     {
          int e=a+b+c+d;
           a=e-(a+b+c);
           b=e-(a+b+c);
           c=e-(a+b+c);
           d=e-(a+b+c);
       System.out.println("After swping");
       System.out.println("a is"+a);
       System.out.println("b is"+b);
       System.out.println("c is"+c);
       System.out.println("d is"+d);
  }
  void swap()
       {
           int a=5;
           int b=8;
           int c=6;
           int d=9;
           int e=a+b+c+d;
               a=e-(a+b+c);
               b=e-(a+b+c);
               c=e-(a+b+c);
               d=e-(a+b+c);
       System.out.println("After swping");
       System.out.println("a is"+a);
       System.out.println("b is"+b);
       System.out.println("c is"+c);
       System.out.println("d is"+d);
  }
 public static void main(String arg[]){
          rajvs vs=new rajvs();
          vs.swap(8,4,5,7);
          vs.swap();
   }
}

