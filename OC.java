class OC
{
	private int n;
	private IC  myIC;
   
	public int OCfunc (int x, int y)
	{
		int retval = 0;
		int compare = 0;
		System.out.println(" before while n not equal to 3,about to test condition");
		while (n != 3)
		{
			System.out.println("inside while loop, n not equal to 3 was true");
			try
			{
				System.out.println("entering try block");
				retval = myIC.ICfunc (n, x, y);
				compare = myIC.CompareFunc (retval);
			}
			catch (Exception ex)
			{	
				System.out.println("in catch, exception ex");
				System.out.println ("Exception caught: " + ex);
				retval = 0;
			}

			n = n + 1;
			System.out.println("end of while loop, about to retest if n not equal to 3");
		}
		System.out.println("outside while loop");
		return retval;
	}

	public void OCinit ()
	{
		n = 0;		
		System.out.println("about to create object of class IC");
		myIC = new IC ();
		System.out.println("object of class IC created");
	}
}

