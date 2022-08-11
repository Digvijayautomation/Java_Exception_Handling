// compiler checks whether the programmer is handling the exception or not for smooth execution at runtime
// Best example is FileNotFoundException


import java.io.PrintWriter;

public class Checked_exception {




    public static void main(String[] args) {

        //Remove below comment to check exception
        //   PrintWriter p=new PrintWriter("abc.txt"); // it will give exception as unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
       // p.println("hello");

    }
}


