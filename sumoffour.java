public class sumoffour{
     void add()
         {
           int n=457;
               if(n>=100 && n<=999)
                  {
                        System.out.println("The answer is"+n);
                   }
               else if(n>=1000 && n<=9999)
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

}
public static void main(String arg[]){
         sumoffour raj=new sumoffour();
         raj.add();
  }
}
