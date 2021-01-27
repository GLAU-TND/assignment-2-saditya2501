/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
//to implement circular queue

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue {
    Node front = null;
    Node rear = null;

    public void insert(String name, int rollNumber, int numberOfBacklogs) {
        Node node = new Node(name, rollNumber, numberOfBacklogs);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            node.setNext(front);
            rear = node;
        }
    }

    public void DeleteNode() {
        Node current = front;
        while (true) {
            if (current == null) {
                System.out.println("empty");
                break;
            } else if (current == front && current == rear) {
                if (current.getData().getNumberOfBacklogs() == 0) {
                    front = rear = null;
                    System.out.println("now empty");
                }
                break;
            } else if (current.getNext().getData().getNumberOfBacklogs() == 0) {
                if (current.getNext() == rear) {
                    current.setNext(front);
                    current = rear;
                    break;
                } else {
                    current.setNext(current.getNext().getNext());
                    continue;
                }
            } else {
                if (current.getNext() != front) {
                    current = current.getNext();
                } else {
                    break;
                }
            }
        }
        if (front.getData().getNumberOfBacklogs() == 0) {
            rear.setNext(front.getNext());
            front = front.getNext();
        }
    }

    public void display() {
        Node current = rear;
        if (front == null) {
            System.out.println("queue is empty!!!");
        } else {
            while (current.getNext() != rear) {
                System.out.print(current.getData().toString() + "------->");
                current = current.getNext();
            }
            System.out.println(current.getData().toString() + "------>");
            // System.out.println(current.getNext().getData().toString());
        }
    }
}