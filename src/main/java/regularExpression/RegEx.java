package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {


    public static void main(String[] args) {

        // Following line prints "true" because the whole
        // text "geeksforgeeks" matches pattern
        // "geeksforge*ks"
        String s="11.11.11.11";//Ip@
        s=s+".";
        System.out.println(Pattern.matches("([0-9]{1,4}\\.){4}", s));


    }
}
