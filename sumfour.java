public class sumfour{
     void add()
       {
          int n=4567;
          int a=n%10;
          int b=n/10;
          int c=b%10;
          int d=b/10;
          int e=d%10;
          int f=d/10;
          int g=a+c+e+f;
               System.out.println("The answer is"+g);
       }
         void add(int n)
            {
              int a=n%10;
              int b=n/10;
              int c=b%10;
              int d=b/10;
              int e=d%10;
              int f=d/10;
              int g=a+c+e+f;
               System.out.println("The answer is"+g);
       }

public static void main(String arg[]){
       sumfour raj=new sumfour();
       raj.add();
       raj.add(7894);
  }
}
