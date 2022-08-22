public class vimalrajvs{
         void swap(int a,int b,int c)
          {
               int d=a+b+c;
                   a=d-(a+b);
                   b=d-(a+b);
                   c=d-(a+b);
               System.out.println("After swaping");
               System.out.println("a is"+a);
               System.out.println("b is"+b);
               System.out.println("c is"+c);
    }
      void swap()
          {
                int a=4;
                int b=2;
                int c=6;
              int d=a+b+c;
                   a=d-(a+b);
                   b=d-(a+b);
                   c=d-(a+b);
               System.out.println("After swaping");
               System.out.println("a is"+a);
               System.out.println("b is"+b);
               System.out.println("c is"+c);
    }
public static void main(String arg[]){
        vimalrajvs raj=new vimalrajvs();
            raj.swap(6,5,7);
            raj.swap();
   }
}
          

