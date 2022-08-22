/*public class inba{
       void add()
             {    int count=0;
                  int i=1;
                  int n=9;
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
public static void main(String arg[]){
          inba obj=new inba();
          obj.add();
      }
}*/
/*public class inba{
        void primecheck(int n)
            {
                int count=0;
                int i=1;
                 while(i<=n)
                   {
                      if(n%i==0)
                       {
                         System.out.println(i);
                         count++;
                       }
                        i++;
                     }
               }
public static void main(String arg[]){
       inba obj=new inba();
       obj.primecheck(87);
 }
}*/
/*public class inba{
         void add()
           {
              int count=0;
              int i=1;
              int n=8;
              boolean flag=false;
              for(i=2;i<=n/2;i++)
            {  
                if(n%i == 0)
               {
                  count++;
               }
                 
               
           if(count>0)
               {
                   flag=true;
                  break;
                }
              
            }
              
            if(flag==true)
                {
                   System.out.println("not prime");
                 }
          else
              {
                  System.out.println("prime");
              }
   }
public static void main(String arg[]){
        inba obj=new inba();
        obj.add();
     }
}*/
/*public class inba{
      void add()
          {
              int sum=0;
              int n=4322;
              for(n=4322;n>0 || sum>9;)
               {
                 if(n==0)
                   {
                      n=sum;
                      sum=0;
                     }
                       sum=sum+n%10;
                       n=n/10;
                     }
                       System.out.println(sum);
                     
                  }
public static void main(String arg[]){
            inba obj=new inba();
            obj.add();
      }
}*/
/*public class inba{
        void add()
             {
                int n=1;
                while(n<=4)
                  {
                    System.out.print(n);
                    n++;
                    }
            }
public static void main(String arg[]){
         inba obj=new inba();
         obj.add();
     }
  }*/
/*public class inba{
          void add()
              {
                 int row=1;
                 
                  while(row<=4)
                    {
                         int col=1;
                    while(col<=4)
                      {
                        System.out.print(col);
                        col++;
                        }
                        System.out.println();
                        row++;  
                        }
   }
public static void main(String arg[]){
              inba obj=new inba();
              obj.add();
            }
    }*/
/*public class inba{
        void add()
              {    
                    int n=1234;
                    int i=1;
                    int sum=0;
                     for(i=1;n>0 || sum>9;n=n/10){
                       if(sum>9)
                           {
                            n=sum;
                            sum=0;
                            }
                        
                          sum=sum+n%10;
                          }
                        
                      
                        System.out.println(sum);
                       }
   
public static void main(String arg[]){
         inba obj=new inba();
         obj.add();
    }
}*/
public class inba{
     void add(){
            int i=1;
            int n=100;
           for(i=1;i<=n;i++)
              {
                int count=0;
           for(i=1;i<=n;i++)
                 {
                      if(n%i==0)
                   
                  {
                     count++;
                 }
                }
                 if(count==2)
                 
              {
                 System.out.println(n);
               }
           }
  }
public static void main(String arg[]){
      inba me=new inba();
      me.add();
  }

   }
