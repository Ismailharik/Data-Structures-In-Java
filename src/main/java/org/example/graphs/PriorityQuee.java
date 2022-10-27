package org.example.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQuee {

    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4);
        pq.add(2);
        pq.add(3);
        pq.add(17);
        pq.add(5);
        pq.add(1);


        System.out.println(pq.poll());
    }

    class Student{
        int id;
        String name;
        double cgpa;
        public Student(int id, String name, double cgpa){
            this.id=id;
            this.name=name;
            this.cgpa=cgpa;
        }
        public int getID(){
            return id;
        }
        public String getName(){
            return name;
        }
        public double getCGPA(){
            return this.cgpa;
        }
    }
    class Priorities{
        List students = new ArrayList<Student>();

        public List<Student> getStudents(){
            return students;
        }
    }
}
