public class withouttemp{
         void swap(int a,int b,int c)
          {
               int c=a+b+c;
                   a=c-(a+b);
                   b=c-(a+b);
                   c=c-(a+b);
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
              int c=a+b+c;
                   a=c-(a+b);
                   b=c-(a+b);
                   c=c-(a+b);
               System.out.println("After swaping");
               System.out.println("a is"+a);
               System.out.println("b is"+b);
               System.out.println("c is"+c);
    }
public static void main(String arg[]){
        withouttemp raj=new withouttemp();
            raj.swap(6,5,7);
            raj.swap();
   }
}
          

