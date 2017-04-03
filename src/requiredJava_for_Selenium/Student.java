package requiredJava_for_Selenium;

public class Student {
//example of the overriding 
		 
		static class Class1 {
		 
			public void address() {
				System.out.println("This is Address of class one studnets ");
			}
		}
		 
		//this extension causes the overriding of the method 
		static class Engineering extends Class1{
		 
			public void address() {
				System.out.println("This is class two students ");
			}
		
	}
//method overloading 
		void class1(String a){
			
			System.out.println(a);
			
			
		}
		
		void class1(int c){
			
			
			System.out.println(c);
			
		}

		//method with returns and parameters 
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
		
		
		//creating the default constructor
		public Student(){
			   idnumber=23;
			  
			   Studetname="Rahul";
			System.out.println("the constructor is created");
		}
		
		//constructor overloading 
		
		public Student(int a){
			
			System.out.println(2*a);
			
			
		} 
		//overloading the constructor
		
		public Student(int b,int a){
			
			
			System.out.println(4*b*a);
		}
		
		//creating private variable and using the get and set methods to acess the data
		//creating private variables
		  private int idnumber;
		  private String Studetname;
		  
		  //creating set metod
		 /* Student(){
			  
			  idnumber=23;
			  
			  Studetname="Rahul";
			  
		  }
		  */
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
		  
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
					Class1 a = new Class1(); // Class reference and object
					Class1 b = new Engineering(); // Class reference but Engineering object
			 
					a.address();// runs the method in Class1 class
					b.address();// Runs the method in Engineering class
					
					//calling method overloading 
					
					//creating new object 
			        Students1 obj=new Students1();  
			        
			        //this will call the name of students in the class one 
			        obj.class1("rahul");
			        
			        //this will call the number of students in the class one
			        obj.class1(35);
			        
			        //hear method overloading is done by calling same method
			        
			        //calling the method with return data types 
			     // Create a class, method with void, with parameters and void, return type and parameter.
					
			        Student call=new Student();
					
					///now we have to call every method we created 
					call.Android();
					call.apple("costs so much to buy");
					
					//this is by using the return parameter type 
					System.out.println(call.windows());
					
			        //calling the constructors 
					Student b1=new Student();
					//calling the constructor overloading 
					 //objects are created to call the both constructors
					Student call3=new Student(10);
					Student call1=new Student(20,50);
					//calling the Get and Set and private variables 
					Student j=new Student();
					
					System.out.println("studentname is:"+j.getNAME());
					System.out.println("Student id id:"+j.getID());
					
					
				}
			}
			 