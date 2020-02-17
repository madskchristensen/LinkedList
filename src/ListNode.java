public class ListNode {
    public Person data;
    public ListNode next;

    public ListNode() {
        this(null, null);
    }

    public ListNode(Person data) {
        this(data, null);
    }

    public ListNode(Person data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
