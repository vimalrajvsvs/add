public class sumofthree{
    void add()
    {
    	int n=857;
    	int a=n%10;
    	int b=n/10;
    	int c=b%10;
    	int d=b/10;
    	int e=a+c+d;
    System.out.println("The answeris"+e);
    }
  void add(int n)
  {
	  int a=n%10;
  	int b=n/10;
  	int c=b%10;
  	int d=b/10;
  	int e=a+c+d;
  	System.out.println("The answeris"+e);
  }
	public static void main(String[] args) {
		
          sumofthree raj=new sumofthree();
          raj.add();
          raj.add(888);
	}
	
}

