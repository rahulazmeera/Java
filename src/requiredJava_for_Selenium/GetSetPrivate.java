package requiredJava_for_Selenium;

public class GetSetPrivate {

	//creating private variables
	  private int idnumber;
	  private String Studetname;
	  
	  //creating set metod
	  GetSetPrivate(){
		  
		  idnumber=23;
		  
		  Studetname="Rahul";
		  
	  }
	  
	  public void setID(int a){
		//assigning to the private variable
		  idnumber=a;
	  }
	  //get method to  print the value in console
	  public int getID(){
		  
		  return idnumber;
		  
	  }
	  //using set for student name
	  public void setNAME(String b){
		  
		  Studetname=b;
		  
	  }
	  //using get method to print the value of the name
	  
	 public String getNAME(){
		 
		 return  Studetname;
	 }
	  
	  
	  
	
	public static void  main(String args[]) {
		// TODO Auto-generated method stub
		GetSetPrivate j=new GetSetPrivate();
		
		System.out.println("studentname is:"+j.getNAME());
		System.out.println("Student id id:"+j.getID());
		
		
	
	}

}
