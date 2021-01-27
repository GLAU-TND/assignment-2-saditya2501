/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
import problem3.myqueue.MyPriorityQueue;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("abhinadan", 1);
        obj.insert("abhinav", 2);
        obj.insert("aditya pratap", 6);
        obj.insert("aditya singh", 5);
        obj.insert("anvit", 13);
        obj.insert("aditya chauhan", 7);
        obj.display();
    }
}
