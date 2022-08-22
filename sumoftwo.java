public class sumoftwo{
   void add()
   {
     int n=78;
        if(n>=0 && n<=9)
     {
     System.out.println("This is ingle digit number is" +n);
  }
      else if(n>=10 && n<=99)
      {
           int a=n%10;
           int b=n/10;
           int c=a+b;
      
      System.out.println("The answer is"+c);
  }
}
public static void main(String arg[]){
      sumoftwo raj=new sumoftwo();
      raj.add();
  }
}
