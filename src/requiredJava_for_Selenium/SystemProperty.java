package requiredJava_for_Selenium;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class SystemProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set object for the properties 
		Properties capitals=new Properties();
		//set keys for the required object
		Set states;
		String str;
		
		
		///put the values for the  capital 
		//need to give object key and object value 
		capitals.put("Hyderbad", "India");
		capitals.put("bangaloor", "karnataka");
		capitals.put("mumbai", "Maharastra");
		capitals.put("chennai", "tamilnadu");
		
		//to show all states and capitals as hash table
		states=capitals.keySet();
		Iterator itr=states.iterator();
		
		//to iterate through every state
		while(itr.hasNext()){
			str=(String) itr.next();
			
			System.out.println("The captal of"+str+"is"+capitals.getProperty(str));
				
		}
		System.out.println();
		//to find the states that are not in list 
		str=capitals.getProperty("bihar","Notfound");
		
		
		System.out.println("The Capital of florida is "+str);
		
		
	
		
		
		

	}

}
