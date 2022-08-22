public class sumthree{
    void add()
      {
           int n=97;
         if(n>=10 && n<=99)
            {
                System.out.println("This is double digit number is" + n);
             }
         else if(n>=100 && n<=999)
             {
                int a=n%10;
                int b=n/10;
                int c=b%10;
                int d=b/10;
                int e=a+c+d;
                     System.out.println("The answer is" + e);
              }
     }
         void add(int n)
         {
             if(n>=10 && n<=99)
            {
                System.out.println("This is double digit number is" + n);
             }
         else if(n>=100 && n<=999)
             {
                int a=n%10;
                int b=n/10;
                int c=b%10;
                int d=b/10;
                int e=a+c+d;
                     System.out.println("The answer is" + e);
              }
}
public static void main(String arg[]){
      sumthree raj=new sumthree();
      raj.add();
      raj.add(854);
    }
}
