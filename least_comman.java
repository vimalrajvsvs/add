/*public class least_comman{
    void main(){
      int a=4;
      int b=9;
      int lcm=0;
      int max=(a>b)? a:b;
         while(true)
          {
            if(max%a==0&&max%b==0)
              {
                lcm=max;
                break;
               }
                max++;
            }
                 System.out.println(lcm);
 }
public static void main(String arg[]){
    least_comman me=new least_comman();
    me.main();
      }
}*/
public class least_comman{
   void add(){
       int a=5; 
       int b=6;
       int c=4;
       int lcm=0;
       int max=0;
         if(a>b&&a>c)
           { 
              max=a;
           }
       else if(b>c&&b>a)
           { 
             max=b;
            }
       else
             {
               max=c;
              } 
       while(true)
         { 
            if(max%a==0 &&max%b==0 && max%c==0)
              { 
               lcm=max;
               break;
              } 
              max++;
          } 
              System.out.println(lcm); 
  }
public static void main(String arg[]){
    least_comman me=new least_comman();
    me.add();
  }
}
            
