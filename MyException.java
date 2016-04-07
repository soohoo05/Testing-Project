class MyException extends Exception
{
    public MyException ()
    {
	
        super ();
        System.out.println("in no parameter constructor of Class MyException");
    }

    public MyException (String s)
    {
    	super (s);
	System.out.println("in constructor with one parameter of Class Myexception");
       
    }
}
