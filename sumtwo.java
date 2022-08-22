public class sumtwo{
   void add()
     {
        int n=78;
        int a=n%10;
        int b=n/10;
        int c=a+b;
     System.out.println("The answer is"+c);
  }
    void add(int n)
      {
              int a=n%10;
        int b=n/10;
        int c=a+b;
     System.out.println("The answer is"+c);
  
}
public static void main(String arg[]){
    sumtwo raj=new sumtwo();
    raj.add();
    raj.add(57);
  }
}
