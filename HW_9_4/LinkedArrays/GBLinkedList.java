package HomeWork.HW_9_4.LinkedArrays;


public class GBLinkedList <L> implements Linked<L> {

    private Node<L> fstNode;
    private Node<L> lstNode;
    protected int size = 0;

    public GBLinkedList () {
        lstNode = new Node<L>(null, fstNode, null);
        fstNode = new Node<L>(null, null, lstNode);

    }


    @Override
    public void addLast(L l) {
        Node<L> perv = lstNode;
        perv.setCurrentElement(l);
        lstNode = new Node<L>(null, perv, null);
        perv.setNextElement(lstNode);
        size++;
    }

    @Override
    public void addFirst(L l) {
        Node<L> next = fstNode;
        next.setCurrentElement(l);
        fstNode = new Node<L>(null, null, next);
        next.setNextElement(fstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public L getElementByIndex(int counter) {
        Node <L> target = fstNode.getNextElement();
        for (int i = 0; i < counter; i++){
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node <L> getNextElement (Node<L> current){
        return current.getNextElement();
    }
}
