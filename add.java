public class add{
    public void add()
          {
             int a=4;
             int b=3;
             int c=a+b;
            System.out.println("The answer is"+c);
        }
    public void add(int a,int b)
    {
            int c=a+b;
           System.out.println("The value is"+c);  
    }
    public void sub()
    {
            int a=5;
            int b=3;
            int c=a-b;
           System .out.println("The number is"+c);
    }    
    public void sub(int a,int b)
    {
            int c=a-b;
           System.out.println("The sub is"+c);    
    }    
    public void multi()
    {
            int a=5;
            int b=4;
            int c=a*b;
           System.out.println("The multi ans is"+c);   
    }
    public void multi(int a,int b)
    {
            int c=a*b;
           System.out.println("The multi number is"+c);
    }
    public void division()
    {
            int a=4;
            int b=3;
            int c=a/b;
           System.out.println("The division is "+c);
    }
    public void division(int a,int b)
    {
            int c=a/b;
           System.out.println("The ans is"+c);
    }
   

public static void main(String arg[]){
      add vimal=new add();
      vimal.add();
      vimal.add(4,5);
      vimal.sub();
      vimal.sub(8,4);
      vimal.multi();
      vimal.multi(2,4);
      vimal.division();
      vimal.division(8,2);
      
  }
}
