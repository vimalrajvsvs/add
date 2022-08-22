public class swaping{
        void swap()
          { 
              int a=5;
              int b=2;
              int c=4;
            int temp=a;
                  a=b;
                  b=c;
                  c=temp;
           System.out.println("after swaping");
          
           System.out.println("a is"+a);
           System.out.println("b is"+b);
           System.out.println("c is"+c);
   }
   void swap(int a,int b,int c)
       {
              int temp=a;
                    a=b;
                     b=c;
                   c=temp;
              System.out.println("After swaping");
              System.out.println("a is"+a);
              System.out.println("b is"+b);
              System.out.println("c is"+c);
}
public static void main(String arg[]){
     swaping raj=new swaping();
     raj.swap();
     raj.swap(8,9,5);
  }
}
