// Remember to add size-- or size++ when creating a method changing the size of the list

public class LinkedList {
    private ListNode front;
    private int size;

    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++ ) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }

    public void add(Person person, int index) {
        if (index == 0) {
            front = new ListNode(person, front);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(person, current.next);
        }
        size++;
    }

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

    public LinkedList() {
        this(null);
    }

    public LinkedList(ListNode front) {
        this.front = front;
        if (front != null) {
            size++;
        }
    }

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
