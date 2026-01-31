import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            String regex="<([^<>]+)>([^<>]+)</\\1>";//pattern of the tag
           Pattern pattern=Pattern.compile(regex);//making the regex pattern case insensitive because html tags are cse insensitive
           Matcher matcher=pattern.matcher(line);//matching the regex pattern with the input
            boolean valid=false;
          while(matcher.find())
           {
               System.out.println(matcher.group(2));
               valid=true;
           }
          if(!valid){
               System.out.println("None");
           }
            testCases--;
        }
    }
}
