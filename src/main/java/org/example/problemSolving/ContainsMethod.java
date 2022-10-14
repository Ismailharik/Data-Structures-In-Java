package org.example.problemSolving;

public class ContainsMethod {
    // s=dvvdfvd s1=vb is  s contains s1
    static int i = 0, j = 0;
    static boolean tmp=false;

    public boolean Containss(String exp, String subStrnig) { //aass ass


        if (i < exp.length() && j < subStrnig.length()) {
            if (exp.charAt(i) == subStrnig.charAt(j)) {

                i++;
                j++;
                if(j==subStrnig.length()){
                    tmp=true;
                }else {
                    tmp =Containss(exp, subStrnig);
                }
            } else {


                if(j!=0 && exp.charAt(i) == subStrnig.charAt(j-1)){
                    j=1;
                }else{
                    j = 0;
                }
                i++;
                 tmp= Containss(exp, subStrnig);
            }
        }
        return tmp;
    }

        /*
        aass as
        a = a i=j=1 tmp=false
        a!=s i=2    a=a j=1 tmp=false ||
        a

        * */
    public static void main(String[] args) {
    ContainsMethod containsMethod = new ContainsMethod();
        System.out.println(containsMethod.Containss("aasscqqq","scx"));
    }
}
