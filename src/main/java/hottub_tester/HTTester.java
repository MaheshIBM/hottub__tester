package hottub_tester;
import static java.util.Arrays.*;
import static java.util.Collections.*;

import joptsimple.OptionParser;
import joptsimple.OptionSet;
public class HTTester {
	public static void main(String[] args) throws InterruptedException{
	     // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        System.out.println(args.length);
        for(int i=0; i<args.length;i++){
          System.out.println(args[i]);
            if(args[i].equals("-s")){
                System.out.println("Sleeping for "+args[i+1]+" micro seconds");
                Thread.sleep(Integer.valueOf(args[i+1]));
            }
        }

    
        /*OptionParser parser = new OptionParser();
        parser.accepts("s").withOptionalArg().ofType(Integer.class);
        parser.accepts("X");
       
        OptionSet options = parser.parse(args);
   //     System.out.println(options.has("s"));
     //   System.out.println(options.valueOf("s"));
        if(options.has("s")){
            System.out.println("Sleeping for "+options.valueOf("s"));
            Thread.sleep((Integer)options.valueOf("s"));
        }*/
 
/*        if(args.length > 13){
        	System.out.println("Sleeping for "+args[13]);
        	Thread.sleep(Integer.valueOf(args[13]));
        }*/

	}
}
