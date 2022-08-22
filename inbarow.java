/*public class inbarow{
        void add()
            {
                 int row=1;
                 for(row=1;row<=4;row++)
                     {
                        int col=1;
                          for(col=1;col<=4;col++)
                            {
                              if(row==1 || row==4 || col==1 || col==4 )
                                {
                                     System.out.print("0");
                                 }
                               else
                                  {
                                    System.out.print("1");
                                   }
                                    
                                      
                                     }
                                     System.out.println();
                                     
                                      
           }   
         
}            

public static void main(String arg[]){
        inbarow obj=new inbarow();
        obj.add();
        }
}*/                                   // condition is row +col=5; it is print 0 another all of print 1
public class inbarow{
       void add()
         {
             int row=1;
             for(row=1;row<=4;row++)
               {
                   int col=1;
                    for(col=1;col<=4;col++)
                      {
                        if(col==row)
                          {
                           System.out.print("0");
                           }
                        else
                           {
                             System.out.print("1");
                            }
               
                             }
                            System.out.println();
                     
                          }
                  }
public static void main(String arg[]){
          inbarow obj=new inbarow();
          obj.add();
         }
  }                                                // condition is col==1; it is print col 1 full of 0 another all of print 1
/*public class inbarow{
      void add()
         {
            int row=1;
            while(row<=4)
               {
                 int col=1;
            while(col<=4)
                 {
                   if(row==col)
                    { 
                     System.out.print("0");
                     }
                   else
                      {
                         System.out.print("1");
                       }
                       col++;
                       }
                       System.out.println();
                       row++;
                       }
                  }
public static void main(String arg[]){
          inbarow obj=new inbarow();
          obj.add();
          }
 }*/                                                       //condition is row==col; it is print row and col same that is print 0 another all print 1
/*public class inbarow{
      void add()
         {
            int row=1;
            while(row<=4)
               {
                 int col=1;
            while(col<=4)
                 {
                   if( row==1 &&col==1 ||row==1 && col==4 ||row==4 && col==1 || row==4 && col==4)
                    { 
                     System.out.print("0");
                     }
                   else
                      {
                         System.out.print("1");
                       }
                       col++;
                       }
                       System.out.println();
                       row++;
                       }
                  }
public static void main(String arg[]){
          inbarow obj=new inbarow();
          obj.add();
          }
 }*/    
                                
