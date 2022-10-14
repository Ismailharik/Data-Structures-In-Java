package org.example.problemSolving;

import java.util.ArrayList;
import java.util.List;

public class MatchingStrings {

    public  List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        String word;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            word=queries.get(i);
            result.add(0);
            for (int j = 0; j < stringList.size(); j++) {
                if(word.equals(stringList.get(j))){
                    result.set(i, result.get(i)+1);
                }
            }
        }
        return result;

    }


    public static void main(String[] args) {
        MatchingStrings matchingStrings = new MatchingStrings();
        List<String> stringList = new ArrayList<>();
        List<String> queries = new ArrayList<>();
        stringList.add("aba");
        stringList.add("baba");
        stringList.add("aba");
        stringList.add("xzxb");
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");
        System.out.println(matchingStrings.matchingStrings(stringList,queries));
    }
}
