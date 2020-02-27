public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(23);
        myLinkedList.addFirst(213);
        myLinkedList.addLast(10);
        myLinkedList.addLast(11);
        myLinkedList.remove(0);
        myLinkedList.remove(1);
        myLinkedList.remove(3);
        myLinkedList.traverseList();
        System.out.println("\nNumber of nodes:\n" +myLinkedList.size());
        System.out.println("\nIndex of 3 in list: "+myLinkedList.indexOf(3));
        System.out.println("\nIndex of 23 in list: "+myLinkedList.indexOf(23));
        System.out.println("\nElement at index 1 is: "+myLinkedList.get(1));
        System.out.println("\nFirst element: "+myLinkedList.getFirst());
        System.out.println("\nLast element: "+myLinkedList.getLast());
        System.out.println("\nList after clear: ");
        myLinkedList.clear();
        myLinkedList.traverseList();
    }
}
