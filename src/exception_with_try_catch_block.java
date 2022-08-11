public class exception_with_try_catch_block {

    public static void main(String[] args) {

        System.out.println("Im the 1st sout statement"); // this will execute normally

        try {
            System.out.println(" Im statement in the try block"+ 10/0);    // Take risky code into try catch
        }
         catch (ArithmeticException e) // as programmer, we know which exception will occur for above code so take catch that exception in catch block
         {
             e.printStackTrace(); // it will display exception details
             System.out.println(" Im The statement in the Catch block- "+ 10/2); // define solution if exception occur in try block
         }
        System.out.println("Im the 2nd sout statement");
    }
}
