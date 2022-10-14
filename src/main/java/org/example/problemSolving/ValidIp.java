package org.example.problemSolving;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex{
    String pattern;
    public boolean validAPi(String pattern){

        try {
        if(pattern.split("\\.").length==4){
            System.out.println("+++++++++++++++");
            String[] array = pattern.split("\\.");
            int nbr=0;
            for(String byte_ : array){
                nbr=Integer.parseInt(byte_);
                if(nbr<0 || nbr>255){
                    System.out.println(nbr+"not valid byte of IP adr");
                    return false;
                  }
            }
            return true;
        }else{
            return false;
        }
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            return false;

        }

    }
    public boolean vlidAPiByPatterns(String pattern){
        try{
            return Pattern.matches
//                    ("((([0-1][0-9][0-9])|([0-2][0-5][0-5]))\\.){3}((([0-9]{2}0)|([0-9]{2})|([0-2][0-5][0-5])))",pattern);
                        ("(([0-1][0-9][0-9]|2[0-4][0-9]|2[0-5][0-5]|[0-9][0-9]|[0-9])\\.){3}([0-1][0-9][0-9]|2[0-4][0-9]|2[0-5][0-5]|[0-9][0-9]|[0-9])",pattern);
        }catch(Exception e){
            return false;
        }
    }
    public static void main(String[] args) {
        MyRegex myRegex=new MyRegex();
        myRegex.pattern="249.249.249.255";
        System.out.println("========> :"+myRegex.vlidAPiByPatterns(myRegex.pattern));
    }

}

