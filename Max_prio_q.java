//Max Priority Queue with class Datatype

import java.util.*;
class Student{
    String name;
    int age;
    int height;
    Student(String name,int age,int height){
        this.name=name;
        this.age=age;
        this.height=height;
        
    }
}
class Main {
    public static void main(String[] args) {

   PriorityQueue<Student>pq=new PriorityQueue<>((a,b)->b.age-a.age);
        Student s1=new Student("Preethi",21,158);
        Student s2=new Student("Pranathi",19,161);
        Student s3=new Student("nidhi",16,159);
        pq.add(s1);
        pq.add(s2);
        Student temp=pq.poll();
        System.out.println(temp.name);
        System.out.println(temp.age);
        System.out.println(temp.height);
        
    }
}
