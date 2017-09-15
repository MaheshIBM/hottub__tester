package org.apache.spark.executor;

import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class CoarseGrainedExecutorBackend{

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Executing coarse grained executor");
        
        /*OptionParser parser = new OptionParser();
        parser.accepts("s").withOptionalArg().ofType(Integer.class);
        
        OptionSet options = parser.parse(args);
        if(options.has("s")){
            Thread.sleep((Integer)options.valueOf("s"));
        }*/

       for(int i=0; i<args.length;i++){
          System.out.println(args[i]);
            if(args[i].equals("-s")){
                Thread.sleep(Integer.valueOf(args[i+1]));
            }
        }
    }

}

