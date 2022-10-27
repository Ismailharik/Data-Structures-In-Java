package org.example.problemSolving;


import java.math.BigInteger;
import java.util.*;
class Book implements Cloneable {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public Book clone() {
        try {
            Book clone = (Book) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
public class Test{
    public static void main(String[] args) throws CloneNotSupportedException {
        Book b1 = new  Book(101,"Let us C","Yashwant Kanetkar","BPB",8);

        Book b2 = (Book) b1.clone();
        b2.name="x";
        System.out.println(b1.toString());
    }


}
