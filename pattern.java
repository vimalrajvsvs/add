/*public class pattern{
   void add()
      {
          int row=1;
          for(row=1;row<=3;row++)
              {
                int col=2;
                  for(col=2;col>=row;col--)
                     {
                        System.out.print(" ");
                      }
                   for(col=1;col<=row;col++)
                       {
                         System.out.print(row);
                       }
                        System.out.println();
                     }
        }
public static void main(String arg[]){
     pattern obj=new pattern();
     obj.add();
   }
}*/
/*public class pattern{
     void add(){
           int row=4;
            for(row=4;row>=1;row--)
              {
             for(int col=4;col>=row;col--)
               {
                  System.out.print(col);
                }
                  System.out.println();
                }
   }
public static void main(String arg[]){
         pattern me=new pattern();
         me.add();
    }
}*/
/*public class pattern{
   void add(){
        int row=1;
        for(row=1;row<=3;row++)
         {
           int col=2;
           for(col=2;col>=0;col--)
               {
                  System.out.print(" ");
                }
           for(col=1;col<=row;col++)
                 {
                  System.out.print("*");
                 }
                   System.out.println();
                  }
   }
public static void main(String arg[]){
       pattern me=new pattern();
       me.add();
        }
   }*/
/*public class pattern{
     void add(){
              int row=1;
              for(row=1;row<=5;row++)
                {
                    int col=1;
                    for(col=1;col<=5;col++)
                        {
                          if(col==3 || row==3)
                               
                                 System.out.print("*");
                               
                           else
                               
                                  System.out.print(" ");
                                }
                                  System.out.println();
                                 }
                               }
                           
  public static void main(String arg[]){
                pattern me=new pattern();
                me.add();
                 }
 }*/
/*public class pattern{
   void add(){
               int row=1;
               for(row=1;row<=4;row++) 
                   {
                     int col=1;
                     for(col=1;col<=4;col++)
                       {
                         if(col==row)
                              System.out.print("*");
                          else
                              System.out.print(" ");
                         }
                            System.out.println();
                         }
                    }
public static void main(String arg[]){
      pattern me=new pattern();
      me.add();
    }
}*/
/*public class pattern{
      void add(){
           for(int row=1;row<=3;row++)
             {
            for(int colsp=2;colsp>=row;colsp--)
               {
                 System.out.print(" ");
                }
            for(int colno1=1;colno1<=row;colno1++)
                 {
                    System.out.print("*");
                  }
            for(int colno2=1;colno2<row;colno2++)
                  {
                    System.out.print("*");
                  }
                     System.out.println();
                 }
     }
public static void main(String arg[]){
      pattern me=new pattern();
      me.add();
  }
}*/                        
/*public class pattern{
       void add(){
              for(int row=1;row<=3;row++)
             {
            for(int colsp=2;colsp>=row;colsp--)
               {
                 System.out.print(" ");
                }
            for(int colno1=1;colno1<=row;colno1++)
                 {
                    System.out.print("*");
                  }
            for(int colno2=1;colno2<row;colno2++)
                  {
                    System.out.print("*");
                  }
                     System.out.println();
                 }
                  for(int row=1;row<=3;row++)
              {
                 
               
           for(int colsp=1;colsp<row;colsp++)
               {
                System.out.print(" ");
               }
           for(int colno1=3;colno1>=row;colno1--)
               {
                 System.out.print("*");
                }
            for(int colno2=2;colno2>=row;colno2--)
                {
                  System.out.print("*");
                 }
                     System.out.println();
                }
   
            }
public static void main(String arg[]){
       pattern me=new pattern();
       me.add();
   }
 }*/
/*public class pattern{
   void add(){
          for(int row=1;row<=4;row++)
             {
           for(int col=1;col<=4;col++)
                  { 
                if(col+row==3 || col+row==4 || col+row==6 || col+row==7)
                     System.out.print("*");
                else
                    System.out.print(" ");
                     }
                      System.out.println();
                     }
                }
public static void main(String arg[]){
   pattern me=new pattern();
   me.add();
   }
}*/
public class pattern{
    void add(){
       {
         for(int row=1;row<=5;row++)
            {
         for(int col=5;col>=row;col--)
             {
                System.out.print(row);
              }
                 System.out.println();
              }
         }
}
public static void main(String arg[]){
          pattern me=new pattern();
          me.add();
     }
}


