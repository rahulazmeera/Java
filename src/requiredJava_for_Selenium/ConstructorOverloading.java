package requiredJava_for_Selenium;

public class ConstructorOverloading {
	//creating the constructor
	public ConstructorOverloading(int a){
		
		System.out.println(2*a);
		
		
	} 
	//overloading the constructor
	
	public ConstructorOverloading(int b,int a){
		
		
		System.out.println(4*b*a);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //objects are created to call the both constructors
		ConstructorOverloading call=new ConstructorOverloading(10);
		ConstructorOverloading call1=new ConstructorOverloading(20,50);
		
		
	}

}
