package datastructure.trees;

public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(30);
        intTree.insert(10);
        intTree.insert(60);
        intTree.insert(70);
        intTree.insert(55);
        intTree.insert(45);
        intTree.insert(32);

        intTree.printAll();
    }

}
