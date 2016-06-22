import java.util.Scanner;


public class Master extends Employee 
{       

	
	public void add_master()                        // Create Main Method For this class - now we can use < for > loop without errors 
	{
		int num ;
		String user_data = new String();                           // < str >  Changed to < user_data > 
		
		Scanner user_input = new Scanner(System.in);               // < in >  Changed to < user_input >
	
		
		Employee [] ar = new  Employee[5] ;                       // Redeclare new array of objects < ar > inside < main > Method 
		Workshop worsh = new Workshop() ;
		
		
		
		
		for (int i = 0; i < ar.length ; i++)                      // it's Recommended to depend on array length instead of using static Number  
		{
			ar[i] = new Employee();
			
			System.out.println("Enter a String val without spaces ["+ (i + 1) +"] : ");         // give Message to the user that tells him what he should to do 
			user_data = user_input.next();
			worsh.setName(user_data);
			
			System.out.println("Enter any number ["+ (i + 1) +"] : ");
			num = user_input.nextInt();
			worsh.setNumber(num);
			
			System.out.println("Enter a String val  without spaces ["+ (i + 1) +"] : ");
			user_data = user_input.next();			
			ar[i].setEName(user_data);
			
			System.out.println("Enter any Nubmer ["+ (i + 1) +"] : ");
			num = user_input.nextInt();
			ar[i].setEHNumber(num); 
			
		}
	
		
	}
	
	
}
