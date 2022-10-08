//package org.example;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class OneDArray {
//    static List<Stage> stages = new ArrayList<Stage>();
//    static String[][] twoD = new String[10][10];
//    static int line=0,colomn=0;
//
//
//    public void print(List<String> listOfPaths) {
//        // I started exam at 8:45
//        //write code here
//
//    }
//
//
//    public static void main(String[] args) {
//
//        List<String> list = new ArrayList<>();
//        List<String> memeStage = new ArrayList<String>();
//        int memeStageNumber = 0;
//        String tmp;
//        boolean newfileExist = false;
//
//        list.add("app/src/root/game/file1.cpp");
//        list.add("app/src/root/game/file2.cpp");
//        list.add("app/src/root/tool/file3.cpp");
//        list.add("app/src/root/file4.cpp");
//        list.add("app/data/file5.cpp");
//        list.add("pom.xml");
//        new OneDArray().print(list);
//        for (int i = 0; i < list.size(); i++) {
//            initializeMatrix();
//            checkMatrix(list.get(i));
//            afficher();
//        }
//
//        System.out.println("--------------------------------------------");
//
//
//    }
//
//    public static void checkMatrix(String path) {
//        String[] files = path.split("/");
//        int index=0;
//        int stopped=0;
//        if (line==0){
//            for (int j = 0; j < files.length; j++) {
//                    twoD[line++][j]=files[j];
//            }
//        }
//        for (int i = 0; i < line; i++) {
//            index=0;
//            stopped=0;
//            for (int j = 0; j < 5; j++) {
//                if(twoD[i][j].equals(files[j])){
//                    index++;
//                }else {
//                    stopped=index+1;
//                }
//            }
//            for (int j = stopped-1; j < files.length; j++) {
//                try{
//                    System.out.println(stopped +" ----" +files.length);
//                twoD[line++][j]=files[j];
//                }catch (Exception e){
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//
//    }
//    public static void afficher() {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(twoD[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void initializeMatrix() {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                twoD[i][j]=" ";
//            }
//        }
//    }
//
//
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
///*
//*   --> api --> src --> root --> game --> file1.cpp
//*                                    --> file2.cpp
//*                            --> tool --> file3.cpp
//*                            --> file4.cpp
//*          --> data --> file5.cpp
//*   --> pom.xml
//* */
//
