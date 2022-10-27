package org.example.problemSolving;

import java.util.*;

public class Dequeue2 {
        // HacherRank Exercice here is the link https://www.hackerrank.com/challenges/java-dequeue/problem
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N ,M,maxUniqueNbr=0, tmpNbr;
        boolean tmpBol=false;
        Deque deque = new LinkedList<Integer>();
        Deque tmp =new LinkedList<Integer>();


            N = scanner.nextInt();
            M = scanner.nextInt();


        for (int i = 0; i < N; i++) {
            deque.add(scanner.nextInt());
            if(i<M) {
                tmp.addLast(deque.getFirst());
            }
            else{
                tmpNbr =maxUniqueNbr(new LinkedList(tmp) );
                if(tmpNbr>maxUniqueNbr) {
                    maxUniqueNbr = tmpNbr;
                }
                tmp.removeFirst();
                tmp.addLast(deque.getFirst());
                tmpBol=true;
            }
            deque.removeFirst();

        }
        if (!tmpBol){
            maxUniqueNbr =maxUniqueNbr(new LinkedList(tmp) );
        }

        System.out.println(maxUniqueNbr);


        }


    // i will check if actual nbr of array tmp already exist in array check
    // if i exist i will increment his occurence else i will create new value in the array check
    // check first line contain the value second one contain duplication
    private static int maxUniqueNbr(Deque tmp) {

        Map map = new HashMap<>();
        while (!tmp.isEmpty()){
            map.put(tmp.getLast(),0);
            tmp.removeLast();
        }
        return map.size();
    }
}
