public class Homepattern{
    void add(){
            int row=1;
            for(row=1;row<=5;row++)
             {
            for(int col=1;col<=5;col++)
               {
             if(row==5||row==1||row+col==6)
                 System.out.print(" "+"*");
             else
                System.out.print(" "+" ");
                }
                  System.out.println();
                }
    }
public static void main(String arg[]){
      Homepattern me=new Homepattern();
      me.add();
     }
}
