

	public class zomato{
	     String workername;
	     int workeridnumber;
	     int exprience;
	     String customername;
	    long  customerPhoneNumber;
	        
	            void proof()
	        {
	         System.out.println("Wokername:"+workername+"\n"+"Workeridnumber:"+workeridnumber+"\n"+"Exprience:"+exprience+"\n"+"Customername:"+customername+"\n"+"Customerphonenumber:"+customerPhoneNumber); 
	   }
	
	public static void main(String[] args) {
		
		zomato obj=new zomato();
	    obj.workername="vengatesh";
	    obj.workeridnumber=8;
	    obj.exprience=2;
	    obj.customername="vimalraj";
	    obj.customerPhoneNumber=9025897682L;
	    obj.proof();
	   
	}

}

