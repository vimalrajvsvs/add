class workers{
    public void forming(){
          System.out.println("put the wastage");
           }
    public void tailering(){
         System.out.println("Stich the dress");
            }
}
class worker1  extends workers{
     public void forming(){
           System.out.println(" shsvfv  ");
           }
}
public class exampledynamic{
public static void main(String arg[]){
      workers me=new worker1();
      
      me.tailering();
      me.forming();
      }
}
