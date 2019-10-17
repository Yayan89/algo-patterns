package datastructure.linkedlist;

public class MainIntegerLinkedList {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.insertSorted(5);
        list.insertSorted(6);
        list.insertSorted(10);
        list.insertSorted(1);
        list.insertSorted(11);
        list.insertSorted(8);

        list.printAll();
    }
}
