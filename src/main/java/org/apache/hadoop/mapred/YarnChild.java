package org.apache.hadoop.mapred;

import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class YarnChild{

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Executing YarnChild");
        
/*        OptionParser parser = new OptionParser();
        parser.accepts("s").withOptionalArg().ofType(Integer.class);
        
        OptionSet options = parser.parse(args);
        if(options.has("s")){
            Thread.sleep((Integer)options.valueOf("s"));
        }*/
    }

}

