package HomeWork.HW_9_4;

public class Node <L>{
    private L currentElement;
    private Node<L> nextElement;
    private Node<L> pervElement;

    public Node(L currentElement, Node<L> pervElement, Node<L> nextElement) {
        this.currentElement = currentElement;
        this.nextElement = nextElement;
        this.pervElement = pervElement;
    }

    public L getCurrentElement(){
        return currentElement;
    }

    public void setCurrentElement(L currentElement) {
        this.currentElement = currentElement;
    }

    public Node<L> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<L> nextElement) {
        this.nextElement = nextElement;
    }

    public Node<L> getPervElement() {
        return pervElement;
    }

    public void setPervElement(Node<L> pervElement) {
        this.pervElement = pervElement;
    }
}
