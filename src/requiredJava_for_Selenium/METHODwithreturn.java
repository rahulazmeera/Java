package requiredJava_for_Selenium;

public class METHODwithreturn {

	//method prints the out put
	public void Android(){
		
		System.out.println("good smart mobile with 6.0 marshmellow");
		
	}
	//method which takes the parameter only string 
	public void apple(String s){
		//takes the string parameter and prints it 
		System.out.println(s);
		
	}
	//method with the return parameter type 
	public String windows(){
		return "this returns the string value ";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a class, method with void, with parameters and void, return type and parameter.
		
		METHODwithreturn call=new METHODwithreturn();
		
		///now we have to call every method we created 
		call.Android();
		call.apple("costs so much to buy");
		
		//this is by using the return parameter type 
		System.out.println(call.windows());
		
		
		
		
		
		
		
	}

}
