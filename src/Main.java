public class Main {
    public static void main(String[] args) {
        Person mulle = new Person("Mulle", 20);
        Person mango = new Person("Mango", 25);
        Person joe = new Person("Joe", 15);
        Person hej = new Person(null, 0);
        Person ulla = new Person("Ulla", 3);
        LinkedList list = new LinkedList(new ListNode(mulle));

        list.add(mango);
        list.add(joe);
        list.add(hej);

        System.out.println(list.toString());
        System.out.println(list.size());

        list.add(ulla, 2);

        System.out.println(list.toString());
        System.out.println(list.size());
    }

}
