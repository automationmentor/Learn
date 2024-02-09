package coreJava;

//Java program to demonstrate working of Comparator
//interface
import java.util.*;
import java.lang.*;
import java.io.*;

//A class to represent a student.
class StudentComparator
{
 int rollno;
 String name, address;

 // Constructor
 public StudentComparator(int rollno, String name,
                            String address)
 {
     this.rollno = rollno;
     this.name = name;
     this.address = address;
 }

 // Used to print student details in main()
 public String toString()
 {
     return this.rollno + " " + this.name +
                        " " + this.address;
 }
 
 public static void main (String[] args)
 {
     ArrayList<StudentComparator> ar = new ArrayList<StudentComparator>();
     ar.add(new StudentComparator(111, "bbbb", "london"));
     ar.add(new StudentComparator(131, "aaaa", "nyc"));
     ar.add(new StudentComparator(121, "cccc", "jaipur"));

     System.out.println("Unsorted");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));

     Collections.sort(ar, new Sortbyroll());

     System.out.println("\nSorted by rollno");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));

     Collections.sort(ar, new Sortbyname());

     System.out.println("\nSorted by name");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));
 }
 
}

class Sortbyroll implements Comparator<StudentComparator>
{
 // Used for sorting in ascending order of
 // roll number
 public int compare(StudentComparator a, StudentComparator b)
 {
     return a.rollno - b.rollno;
 }
}

class Sortbyname implements Comparator<StudentComparator>
{
 // Used for sorting in ascending order of
 // roll name
 public int compare(StudentComparator a, StudentComparator b)
 {
     return a.name.compareTo(b.name);
 }
}

