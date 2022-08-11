public class exception_without_try_catch_block {

    public static void main(String[] args) {

        System.out.println("Im the 1st sout statement"); // this will execute normally

        System.out.println(10/0);    // This will give ArithmeticException: divided by zero
                                    // Because of this further execution will stop and 2nd statement will not execute
                                    // This is called abnormal execution
        System.out.println("Im the 2nd sout statement");
    }
}
