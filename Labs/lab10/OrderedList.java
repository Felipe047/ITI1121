public class OrderedList implements OrderedStructure {

    // Implementation of the doubly linked nodes (nested-class)

    private static class Node {

      	private Comparable value;
      	private Node previous;
      	private Node next;

      	private Node ( Comparable value, Node previous, Node next ) {
      	    this.value = value;
      	    this.previous = previous;
      	    this.next = next;
      	}
    }

    // Instance variables

    private Node head;

    // Representation of the empty list.

    public OrderedList() {
        head = new Node(null, null, null);
    }

    // Calculates the size of the list

    public int size() {
        if (head.next == null) {
            return 0;
        }
        int size = 0;
        Node temp = head.next;
        while (temp != head) {
            size++;
            temp = temp.next;
        }
        return size;
    }


    public Object get( int pos ) {
        if (pos >= size() || pos < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;
        for (int i = 0; i < pos + 1; i++) {
            temp = temp.next;
        }

        return temp.value;
    }

    // Adding an element while preserving the order

    public boolean add( Comparable o ) {
        if (o == null) {
            throw new IllegalArgumentException();
        }

        if (size() == 0) {
            head.next = new Node(o, head, head);
            head.previous = head.next;
            return true;
        }

        Node temp = head;
        for (int i = 0; i < size(); i++) {
            temp = temp.next;
            if (temp.value.compareTo(o) >= 0) {
                temp.previous.next = new Node(o, temp.previous, temp);
                temp.previous = temp.previous.next;
                return true;
            }
        }

        temp.next = new Node(o, temp, head);
        head.previous = temp.next;
        return true;
    }

    //Removes one item from the position pos.

    public void remove( int pos ) {
        if (pos >= size() || pos < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (size() == 1) {
            head.next = null;
            head.previous = null;
            return;
        }
        if (pos == size() - 1) {
            head.previous = head.previous.previous;
            head.previous.next = head;
            return;
        }

        Node temp = head.next;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
    }

    // Knowing that both lists store their elements in increasing
    // order, both lists can be traversed simultaneously.

    public void merge( OrderedList other ) {
        if (other == null) {
            throw new IllegalArgumentException();
        }
 
        Node temp = other.head.next;
        for (int i = 0; i < other.size(); i++) {
            this.add(temp.value);
            temp = temp.next;
        }
    }
}