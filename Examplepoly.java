/*public class Examplepoly{
    void add()
       {
          int a=3;
          int b=4;
          int c=a+b;
            System.out.println(c);
         }
    void add(int a,int b)
       {
          int c=a+b;
             System.out.println(c);
         }
   void add(int a,int b,int c)
         {
            int d=a+b+c;
               System.out.println(d);
            }
   void add(String name, String work)
          {
             System.out.println("Name:"+name+"\n"+"Work:"+work);
           }
   
public static void main(String arg[]){
    Examplepoly me=new Examplepoly();
    me.add();
    me.add(8,9);
    me.add(8,9,5);
    me.add("vimalraj","developer");
   }
}*/
/*class developer{
    void developing()
         {
           System.out.println("java");
          }
       }
class developer1 extends developer{
     void developing()
        {
           System.out.println("python");
        }
  }
public class Examplepoly{
   public static void main(String arg[]){
      developer1 me=new developer1();
      me.developing();
    }
}*/
/*class program{
   void add(int n){
       
       if(n%2==0)
        {
           System.out.println("even number");
         }
       else{
           System.out.println("odd number");
           }
 }
}
class programs extends program{ 
    void add(int n)
             {    int count=0;
                  int i=1;
                 
                  for(i=1;i<=n;i++)
                  {
                     if(n%i ==0)
                       { 
                        
                          count++;
                        
                        }
                         
                     }
                          if(count==2)
                          {
                               System.out.println("It is prime number");
                           }
                          else
                                {
                                  System.out.println("It is not prime number");
                                 }
                 }
}
public class Examplepoly{
     public static void main(String arg[]){
        programs me= new programs();
        me.add(7);
     }
}*/
/*public class Examplepoly{
      void swap(){
        int a=3;
        int b=5;
        int temp=a;
               a=b;
               b=temp;
             {
              System.out.println("a="+a);
              System.out.println("b="+b);
         }
}
       void swap(int a,int b,int c){
             int  d=a+b+c;
              a=d-(a+b);
              b=d-(a+b);
              c=d-(a+b);
                 {
                 System.out.println("a="+a);
                 System.out.println("b="+b);
                 System.out.println("c="+c);
         }  
}
       void swap(int a,int b){
              int c=a+b;
                  a=c-a;
                  b=c-b;
                     {
                      System.out.println("a="+a);
                      System.out.println("b="+b);
                      }
 }
public static void main(String arg[]){ 
         Examplepoly me=new Examplepoly();
         me.swap();
         me.swap(9,4,7);
         me.swap(8,5);
    }
}*/
/*public class Examplepoly{
     void add(){
         int a=5;
         int b=8;
         int c=a+b;
           System.out.println(c);
        }
     void add(int a,int b){
           int c=a-b;
              System.out.println(c);
        }
     void add(int a,int b,int c){
             int d=a*b*c;
                System.out.println(d);
         }
     void add(int a,int b,int c,int d){
             int e=a+b+c+d;
                 System.out.println(e);
         }
 public static void main(String arg[]){
      Examplepoly me=new Examplepoly();
      me.add(); 
      me.add(7,4);
      me.add(7,5,3);
      me.add(7,8,4,1);
   }
}*/
class human{
     void walking()
          {
             System.out.println("Walk 7 km");
          }
 }
class human1 extends human{
     void walking()
          { 
            System.out.println("Walk 5 km");
           }
  }
public class Examplepoly{
public static void main(String arg[]){
     human me=new human1();
     me.walking();
  }
}
