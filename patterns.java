public class patterns{
   void add()
       {
        for(int row=1;row<=5;row++)
          {
        for(int col=1;col<=5;col++)
           {
            if(row==1 || row==3 ||  row==5 || (row+col==7 && col==1) || (row+col==5 && row==2))
              System.out.print(" "+"*");
            else
              System.out.print(" "+" ");
             }
               System.out.println();
            }
   }
public static void main(String arg[]){
   patterns me=new patterns();
   me.add();
   }
}
/*public class patterns{
      void add(){
          for(int row=1;row<=4;row++)
             {
          for(int col=1;col<=row;col++)
              {
                System.out.print("*");
               }
                 System.out.println();
               }
              for(int row=1;row<=3;row++)
               {
              for(int col=3;col>=row;col--)
                {
                  System.out.print("*");
                 }
                   System.out.println();
                }
 }
public static void main(String arg[]){
   patterns me=new patterns();
   me.add();
  }
}*/
 
              
