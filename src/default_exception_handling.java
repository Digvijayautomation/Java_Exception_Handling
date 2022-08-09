//

public class default_exception_handling {

    public static void main(String[] args) { // there is only one thread in java program i.e main thread
        dostuff();  // main method calling dostuff method inside it, this method is added to stack 1st
    }

    public static void dostuff() //do stuff method calling domorestuff method inside it, this method is added to stack 2nd
    {
        domorestuff();
    }

    public static void domorestuff() // domorestuff calculating 10/0 , this method is added to stack 3rd
    {
        System.out.println(10/0); // 10/0 will give arithmetic exception.
        // so it will create exception object which contains
        // name:arithmetic exception ,description:divided by zero ,stack trace:domorestuff,dostuff,main
    }

}
