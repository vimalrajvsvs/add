public class least_comman{
    void add(){
     int a=4;
     int b=10;
     int gcd=1;
     for(int i=1;i<=a/2&&i<=b/2;i++)
        {
       if(a%i==0&&b%i==0)
            gcd=i;
         }
      int lcm=(a*b)/gcd;
         {

            System.out.println(lcm);
         }
  }
public static void main(String arg[]){
     least_comman me=new least_comman();
     me.add();
   }
}
