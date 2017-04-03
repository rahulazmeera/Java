package requiredJava_for_Selenium;


import java.io.IOException;
import java.util.Scanner;

public class Students  {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		Scanner S=new Scanner(System.in);
		Scanner o=new Scanner(System.in);
		String s;
		  
		  int T;
		  T=o.nextInt();
		  for(int j=1;j<=T;j++){
		
			 
	       
	    	 s=S.next();
		for(int i=0;i<s.length();i++){
			
			
			if(i%2==0){
				char a=s.charAt(i);
				String L=Character.toString(a);
				System.out.print(L);
				
			}
		
				
			}
			
		System.out.print("  ");
		for(int i=0;i<s.length();i++){
			
			if(i%2!=0){
				
				char b=s.charAt(i);
				String w=Character.toString(b);
				
				System.out.print(w);
			
		}
		}
	
			}
	}	

	}


