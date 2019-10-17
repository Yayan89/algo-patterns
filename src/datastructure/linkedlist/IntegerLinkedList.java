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
        if(head.getNumber() > node.getNumber()) {
            node.setNextNode(head);
            head = node;
            return true;
        }

        // [1,2,3,4,5]  insert @ tail
        if(tail.getNumber() < node.getNumber()) {
            tail.setNextNode(node);
            tail = node;
            return true;
        }

        // [4,7,10] insert [8], need to sort
        if( head.getNumber() < node.getNumber() && tail.getNumber() > node.getNumber()) {
            IntegerNode current = head;
            while (current.getNumber() <= node.getNumber() && current.getNextNode().getNumber() <= node.getNumber()) {
                current = current.getNextNode();
            }
            node.setNextNode(current.getNextNode());
            current.setNextNode(node);
            return true;
        }
        return false;
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
