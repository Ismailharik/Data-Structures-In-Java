package org.example.problemSolving;


class Result {

    public  int buildString(int a, int b, String s) {
        // Write your code here
        String sInitial="";
        String tmpString="";
        int totalCost=0;
        int i=0,j=0;
        for ( i = 0; i < s.length();) { // aaabca
            tmpString = "";
            j=0;
            do {
                tmpString += s.charAt(i);
                 i++;
                 j++;
            } while (sInitial.contains(tmpString) && s.length() > i);

            // check it
            if (j == 1) {
                System.out.println("new Char ----> " + tmpString);
                sInitial += tmpString;
            } else {
                System.out.println("new SubStenig ----> " + tmpString.substring(0, tmpString.length() - 1));
                if(!sInitial.contains(tmpString)){
                    i--;
                    j--;
                }
                sInitial += tmpString.substring(0, tmpString.length() - 1);

            }
            if (a * j > b) {
                totalCost += b;
            } else {
                totalCost += a * j;
            }
        }

        return  totalCost;
    }


    public static void main(String[] args) {
        Result result = new Result();

        System.out.println("RESULT +++++> "+result.buildString(8,9,"bacbacacb"));

    }
}
