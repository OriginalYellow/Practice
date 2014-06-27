package intro2java.chap9;

import java.io.*;
import java.util.*;

public class PE20WriteReplace2 {
  public static void main(String[] args) throws Exception {
    if (args.length != 3) {
      System.out.println(
        "Usage: java ReplaceText sourceFile oldStr newStr");
      System.exit(0);
    }

    File sourceFile = new File(args[0]);
    if (!sourceFile.exists()) {
       System.out.println("Source file " + args[0] + " does not exist");
       System.exit(0);
    }

    File tempFile = new File("temp.txt");
    tempFile.deleteOnExit();
    Scanner input = new Scanner(sourceFile);
    PrintWriter output = new PrintWriter(tempFile);

    while (input.hasNext()) {
      String s1 = input.nextLine();
      String s2 = s1.replaceAll(args[1], args[2]);
      output.println(s2);
    }
    output.close();
    
    //switch the input to the tempFile and the output to the source file by...
    //...trading references
    input = new Scanner(tempFile);
    output = new PrintWriter(sourceFile);
    
    while(input.hasNext()) {
    	output.println(input.nextLine());
    }
    output.close();
    
  }
}

