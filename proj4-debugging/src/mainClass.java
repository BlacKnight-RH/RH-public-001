
public class mainClass {

	public static void main(String[] args) {

		
// ------------------------ Declarations ----------------------------------		
		
		Employee   employee = new Employee() ;
		Master     master   = new Master() ;
		Workshop   workshop = new Workshop();
		
		
		int EHNumber ;         					 // using With Employee Class 
		String EName ;         					 // using With Employee Class
 
		int number ;           					// using With workshop Class
		String name ;         				    // using With workshop Class
		
		
		
// ----------------------------------------  General Test ----------------------------------------
		
		
		System.out.println("=========================================================");
		System.out.println("=  -------  Test on Initial  values   -- [ gets ] ----- ="); 	
		System.out.println("=========================================================\n");
		
		
		
			EHNumber = employee.getEHNumber();
			System.out.print(EHNumber);		
			
			EName = employee.getEName();
			System.out.println(EName); 
			
			
			name = workshop.getName();
			System.out.println(name);
			
			number = workshop.getNumber();
			System.out.println(number);
			
		
		
		
		
		// ---------------------------------------------------------------------------------------------
		
		
		
		System.out.println("\n\n=========================================================");
		System.out.println("=  ---------  Test on Sets values   -- [ sets ] --------=");
		System.out.println("=========================================================\n");
		
		
			employee.setEHNumber(5);
			employee.setEName("Black Knight - employee");				
			
			workshop.setName("Black Knight - work shop");
			workshop.setNumber(7);
			
			

		
		
		
		// ---------------------------------------------------------------------------------------------
		
		
		System.out.println("\n\n=========================================================");
		System.out.println("=  -------  Test After using sets   -- [ After ] ------ =");	
		System.out.println("=========================================================\n");
		
		
				EHNumber = employee.getEHNumber();
				System.out.println(EHNumber);		
				
				EName = employee.getEName();
				System.out.println(EName); 
				
				
				name = workshop.getName();
				System.out.println(name);
				
				number = workshop.getNumber();
				System.out.println(number);
				
			
				
				
		// ---------------------------------------------------------------------------------------------	
				
				
		System.out.println("\n\n=========================================================");
		System.out.println("=  -------  Test After using sets   -- [ After ] ------ =");	
		System.out.println("=========================================================\n");
		
				
			master.add_master();
		
		
			
		System.out.println("\n\n=========================================================");	
		System.out.println("= ----------------End Of Program----------------------- = ");
		System.out.println("=========================================================\n");

	}

}
