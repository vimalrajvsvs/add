class alpha{
    void main()
    {
       for(int row=1;row<=5;row++)
        {
          for(int col=1;col<=5;col++)
              {
              if(row==1||col==1||row==3||col==5||row==5	) 
               System.out.print(" "+"*");
               else 
                    System.out.print(" "+" ");
                 }
                System.out.println();
        }
   }
public class alphapet{
public static void main(String arg[]){
    alpha me=new alpha();
    me.main();
   }
}
