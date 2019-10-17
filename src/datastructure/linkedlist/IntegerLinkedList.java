package datastructure.linkedlist;

public class IntegerLinkedList {
    private IntegerNode head, tail;

    public boolean insertSorted(int number) {
        IntegerNode node = new IntegerNode(number);

        //if nothing exist in the linkedList
        if(head == null && tail == null) {
            head = node;
            tail = node;
            return true;
        }

        // [1,2,3,4,5]  inert @ head
        if(head !=null && head.getNumber() > number) {
            node.setNextNode(head);
            head = node;
            return true;
        }

        // [1,2,3,4,5]  insert @ tail
        if(tail.getNumber() < number) {
            tail.setNextNode(node);
            tail = node;
            return true;
        }

        // [4,7,10] insert [8], need to sort
        IntegerNode current = head;
        while (current.getNumber() <= number && current.getNextNode().getNumber() <= number) {
            current = current.getNextNode();
        }
        node.setNextNode(current.getNextNode());
        current.setNextNode(node);
        return true;
    }

    public void printAll() {
        IntegerNode current = head;
        System.out.print("HEAD => ");
        while(current != null) {
            System.out.print(current.toString());
            current = current.getNextNode();
        }
        System.out.println(" => TAIL");
    }
}
