public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    public MyLinkedList() {
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        Node current = head;
        head = newNode;
        head.next = current;
        numNodes++;
    }

    public void addLast(E e){
        if (head==null){
            addFirst(e);
        }
        else {
            Node current = head;
            for (int i = 0; i < numNodes && current.next != null; i++) {
                current = current.next;
            }
            current.next = new Node(e);
            numNodes++;
        }
    }

    public E remove(int index){
        if (index==0){
            if (head==null)
                return null;
        head = head.next;
        numNodes--;
        return (E) head.getData();
        }
        else {
            Node current = head;
            Node holder;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            E deletedItem = (E) current.next.getData();
            current.next = current.next.next;
            numNodes--;
            return deletedItem;
        }
    }

    public void traverseList() {
        Node current = head;
        while (current!=null){
            System.out.println(current.getData());
            current = current.next;
        }
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E o) {
        Node current = head;
        while (current!=null){
            if (o.equals((E) current.getData())){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node current = head;
        for (int i=0; i<numNodes;i++) {
            if (o.equals((E) current.getData())){
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public E get(int i) {
        Node current = head;
        if (i < 0 || i >= numNodes)
            return null;
        for (int x=0;x<numNodes;x++){
            if (x==i)
                return (E) current.getData();
            current = current.next;
        }
        return null;
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        Node current = head;
        for (int i=0;i<numNodes&&current.next!=null;i++){
            current = current.next;
        }
        return (E) (current.getData());
    }

    public void clear() {
        head = null;
    }
}
