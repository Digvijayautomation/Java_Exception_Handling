//Finally block is used to maintain the cleanup code

public class finally_block {

    public static void main(String[] args) {

        try {
            System.out.println("DB CONNECTION");
        }
        catch (Exception e)
        {
            System.out.println("If Exception Occur This block will handle  ");
        }

        finally {
            System.out.println("Close the DB Collection");  // it will execute always whether exception arise or not
        }
    }
}
