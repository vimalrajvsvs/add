public class sumnum{
          void add()
           {
              long sum=0l;
              long num=68687875665564l;
              while(num>0)
               {
                   sum=sum+num%10;
                   
                   num=num/10;
               }
        
               if(sum<100 && sum>9)
                   {
                     sum=sum/10+sum%10;
                     System.out.println(sum);
                   }
                 else 
                   {
                       System.out.println(sum);
                    }
                while(sum<100 && sum>9)
                  {
                     sum=sum/10+sum%10;
                     System.out.println(sum);
                  }
                   
}
public static void main(String arg[]){
      sumnum obj=new sumnum();
      obj.add();
 }
}
