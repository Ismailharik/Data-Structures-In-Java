package org.example.graphs;

public class Ahmed {


    public static void main(String[] args) {
        int n=5;
        int A[]=new int[n];
        boolean tmp=false;
        int k=1;
        for (int i = 0; i < 5; i++) {
            A[i]=i+1;
        }
    //12345 2 3
    //12345 1 2
        do{
            tmp=false;
            int max=max(A),min=min(A);
               if(max-min>k){
                   tmp=true;
               }

            if (tmp) {
                k++;
                A=deleteMax(A, max);
            }
            for (int x:A) {
                System.out.println(x);
            }
        }while (tmp);
        System.out.println(k);

    }
    public static int [] deleteMax(int []A,int max){
        int maxIndex=maxIndex(A,max);
        int B[]=new int[A.length-1];
        for (int i = 0; i < maxIndex; i++) {
            B[i]=A[i];
        }

        for (int i = maxIndex; i <A.length-1 ; i++) {
            B[i]=A[i+1];
        }
       return B;
    }
    public static int maxIndex(int []A,int max){
        for (int i = 0; i <A.length ; i++) {
            if(max==A[i]) return i;
        }
        return -1;
    }
    public static int  max(int []A){
        int max=A[0];
        for (int i =0; i<A.length; i++) {
            if (A[i]>max) max=A[i];
        }
        return max;
    }
    public static int  min(int []A){
        int min=A[0];
        for (int j =0; j<A.length; j++) {
            if (A[j]<min) min=A[j];
        }
        return min;
    }
}
