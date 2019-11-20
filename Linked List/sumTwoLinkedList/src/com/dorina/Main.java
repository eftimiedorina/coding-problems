package com.dorina;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();

        list.add(2);
        list.add(4);
        list.add(3);

      //  list.getList();

        list2.add(5);
        list2.add(6);
        list2.add(4);

        LinkedList newList = new LinkedList();
        newList = newList.getSumOfList(list,list2);

        newList.getList();

    }
}
