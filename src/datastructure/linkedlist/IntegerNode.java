package datastructure.linkedlist;

import java.util.Objects;

public class IntegerNode {
    private IntegerNode nextNode;
    private int number;

    public IntegerNode(int number) {
        this.number = number;
    }

    public IntegerNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(IntegerNode nextNode) {
        this.nextNode = nextNode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "number=" + number + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerNode that = (IntegerNode) o;
        return number == that.number &&
                Objects.equals(nextNode, that.nextNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextNode, number);
    }
}
