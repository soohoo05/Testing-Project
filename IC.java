class IC
{
	private int retval;

	public int ICfunc (int n, int x, int y) throws MyException
	{
		switch (n)
		{
			case 1:
			{	
				System.out.println("inside case 1");
				System.out.println("outside if, testing if x, which is "+x+" is equal to 0 and y,which is "+y+" is equal to 0");
				if ((x == 0) && (y == 0))
				{
					System.out.println("inside if, testing if x, which is "+x+" is equal to 0 and y,which is "+y+" is equal to 0 is true");
					throw new MyException ("all zero");
				}
				else if (x <= y)
				{
					System.out.println("inside else if, testing if x, which is "+x+" is less then or equal to y, which is "+y+" which is true. The previous if statement, which was is x=0 and y=0, was false");
					retval = x;
					return retval;
				}
				else
				{
					System.out.println("inside else, testing if x=0 and x=0 was false. also x less than or equal to y was also false. x was "+x+" and y was "+y);
					retval = y;
					return retval;
				}
			}

			case 2:
			{
				System.out.println("inside case 2");
				int i;
					System.out.println("outside if, testing if x, which is "+x+" is equal to y, which is "+y);
				if (x == y)
				{
					System.out.println("inside if, testing if x, which is "+x+" is equal to y, which is "+y+". The aforementioned statement is true.");
					throw new MyException ("all equal");
				}
				else if (x < y)					
				{
					System.out.println("inside else if, x equal to y was false. testing if x is less then y which is true. x is "+x+", y is "+y);
					for (i = x; i < y; i++)	{
						System.out.println("inside for loop. "+i+"<"+y+" is true");
						System.out.println("outside if statement, testing if i which is "+i+" is greater than x+5, x is "+x);
						if (i > x + 5)
						{
							System.out.println("inside if statement, testing if i which is "+i+" is greater than x+5, x is "+x+". the statement is true");
							retval = x + 5;
							return retval;
						}
						System.out.println("outside if");
					}
					retval = i;
					return retval;
				}
				else
				{
					System.out.println("inside else statement, x equal to y and x less than y is false. x is "+x+" y is "+y);
					retval = n;
					return retval;
				}
			}

			default:
			{
				System.out.println("in default for switch method");
				return 0;
			}
		
		} // end switch
		
	} // end method

	public int CompareFunc (int returnVal)
	{
		System.out.println("before if, testing if returnVal, which is "+returnVal+"is equal to retval, which is "+retval);
		if (retval == returnVal){
			System.out.println("inside if, testing if returnVal, which is "+returnVal+"is equal to retval, which is "+retval+" is true");
			return 1;
		}
		else
			System.out.println("inside else, testing if returnVal, which is "+returnVal+"is equal to retval, which is "+retval+" which is false");
			return 0;
	}

} // end class
