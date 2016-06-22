
class Workshop 
{

	private String name;
	private int number;


	// constructor -- initialization 

	public Workshop()
	{
		name = "";
		number = 0;
	}

	
	// -------------------------------- Gets -----------------------------
	
	public String getName()
	{
		return name;
	}
	
	public int getNumber()
	{
		return number;
	}

	
	
	//---------------------------- Sets ---------------------------------

	public void setName(String val)
	{
		name = val;
	}

	public void setNumber(int val)
	{
		number = val;
	}


}