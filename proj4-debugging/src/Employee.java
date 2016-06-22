
class Employee extends Workshop 
{
	private    String ename;
	private    int ehnumber;
	protected  float esalary ;            // changed to protected  
	protected  int WSNumber;              // changed to protected  
	protected  final int WSNnumber;       // changed to protected  
	protected Workshop val;               // new Declaration 


	// ---------------------------- constructor -- initialization ------- 
	
	public Employee()
	{
		ename = "";
		ehnumber = 0;
		esalary = (float) 0.0;
		WSNnumber = 0;
	}
	
	

	// -------------------------------- Gets -----------------------------
	
	public String getEName()
	{
		return ename;
	}

	public int getEHNumber()
	{
		return ehnumber;
	}
	

	//--------------------------------- Sets -----------------------------
	
	public void setEName(String val)
	{ 
		ename = val;
	}
	public void setEHNumber(int val)
	{
		ehnumber = val;
	}


	
	
	public void Employee_x(Workshop val, Workshop[] ws)      // Changed To  " Employee_x  "
	{
		this.val = val;                                      // Changed To "this.val" 
		ws[WSNumber]=val;
		WSNumber++;

	}

	
}
