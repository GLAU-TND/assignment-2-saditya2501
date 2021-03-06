/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;
// to define node properties
import problem5.student.Student;

public class Node {

    private Student data;

    private Node next;


    public Node(String name, int rollNumber, int numberOfBacklogs) {

        this.data = new Student(name, rollNumber, numberOfBacklogs);

        this.next = null;

    }


    public Student getData() {

        return data;

    }


    public void setData(Student data) {

        this.data = data;

    }


    public Node getNext() {

        return next;

    }


    public void setNext(Node next) {

        this.next = next;

    }

}