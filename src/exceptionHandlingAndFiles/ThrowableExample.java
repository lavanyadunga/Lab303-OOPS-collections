package exceptionHandlingAndFiles;

public class ThrowableExample {
	// Main Method
    public static void main(String[] args)
        throws Exception
    {

        try {

            testException();
        }

        catch (Throwable e) {

            // Print using tostring()
            System.out.println("Exception: "
                            + e.toString());
        }
    }

    // Method which throws Exception
    public static void testException()
        throws Exception
    {
    String s= null;
    s.length();
        // WHAT YOU NEED to do:  code this method
    }

}
