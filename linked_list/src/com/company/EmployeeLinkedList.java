package com.company;

public class EmployeeLinkedList {
    private EmployeeNode head;//What is this?
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);//the pointer of the new head will be the prev head
        head = node; //assign new head
        size++;//increment size of LL
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) { //Check if LL is already empty
            return null;
        }

        EmployeeNode removedNode = head;// pointing node to be removed at head
        head = head.getNext();//new head will be the pointer of the head
        size--;//Decrement size of LL
        removedNode.setNext(null);//To remove traces of any pointers left
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
