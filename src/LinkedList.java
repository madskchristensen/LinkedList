// Remember to add size-- or size++ when creating a method changing the size of the list

public class LinkedList {
    private ListNode front;
    private int size;

    public String findByName(String name) {
        String result = "\n";
        String nameOriginal = name;
        name = name.toLowerCase();

        ListNode current = front;

        while(current != null) {
            String name2 = current.data.getName().toLowerCase();

            if (name.equals(name2)) {
                result += current.data;

                if(current.next != null) {
                    result += "\n";
                }
            }

            current = current.next;
        }

        return "People matching " + "\"" + nameOriginal + "\": " + result;
    }

    public void remove(int index) {
        // check to see if node to be removed is first in the list
        if (index == 0) {
            front = get(1);
        }

        ListNode nodeBeforeRemove = get(index - 1);

        // check to see if node to be removed is last in the list
        if (index == size) {
            nodeBeforeRemove.next = null;
        }

        // if not first or last, link node before given index to node after given index
        ListNode nodeAfterRemove = get(index + 1);

        nodeBeforeRemove.next = nodeAfterRemove;
        size--;
    }

    // Finds a given node by given index
    public ListNode get(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++ ) {
            current = current.next;
        }
        return current;
    }

    // Returns size of the list
    public int size() {
        return size;
    }

    // Adds a person by a given index
    public void add(Person person, int index) {
        if (index == 0) {
            front = new ListNode(person, front);
        } else {
            ListNode current = get(index - 1);
            current.next = new ListNode(person, current.next);
        }
        size++;
    }

    // Adds person to end of list
    public void add(Person person) {
        if(front == null) {
            front = new ListNode(person);
        } else {
            ListNode current = front;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(person);
        }
        size++;
    }

    // Constructs an empty list
    public LinkedList() {
        this(null);
        size = 0;
    }

    // Constructs a list with a starting node
    public LinkedList(ListNode front) {
        this.front = front;
        if (front != null) {
            size++;
        }
    }

    // Returns a string of list elements
    @Override
    public String toString() {
        if(front == null) {
            return "List is empty";
        } else {
            String result = front.data.toString() + "\n";
            ListNode current = front.next;

            while(current != null) {
                result += current.data.toString() + "\n";
                current = current.next;
            }
            return result;
        }
    }
}
