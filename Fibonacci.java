public class Fibonacci{
    void add(){
       int first=0;
       int second=1;
       for(int i=1;i<=15;i++)
           {
              System.out.println(first);
                 second=first+second;
                 first=second-first;
           }
     }
public static void main(String arg[]){
      Fibonacci me=new Fibonacci();
      me.add();
    }
}
