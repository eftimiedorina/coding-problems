package com.dorina;


public class LinkedList {
    private Node head;
    private int count;

    public LinkedList() {
        head = null;
        count = 0;
    }

    public void getList() {
        Node currNode = head;
        while ((currNode != null)) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.nextNode;
        }

    }


    public void add(int item) {
        Node newNode = new Node(item);
        newNode.nextNode = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            head = newNode;
            count++;
        } else {

            // Else traverse till the last node
            // and insert the new_node there
            Node p = head;
            while (p.nextNode != null) {

                p = p.nextNode;
                count++;
            }
            p.nextNode = newNode;

        }


    }

    public LinkedList getSumOfList(LinkedList list1, LinkedList list2) {
        LinkedList newList = new LinkedList();
        Node p = list1.head;
        Node q = list2.head;

        int carry = 0;

        while (p != null && q != null) {
            int sum = p.data + q.data + carry;
            newList.add(sum % 10);
            carry = sum / 10;
            p = p.nextNode;
            q = q.nextNode;
        }

        return newList;
    }

    public class Node {
        Node nextNode;
        int data;

        public Node(int data) {
            this.nextNode = null;
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
