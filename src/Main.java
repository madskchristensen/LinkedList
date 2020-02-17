public class Main {
    public static void main(String[] args) {
        Person mulle = new Person("Mulle", 20);
        Person mango = new Person("Mango", 25);
        Person joe = new Person("Joe", 15);
        Person ulla = new Person("Ulla", 3);
        Person ulla2 = new Person("Ulla", 8);
        LinkedList list = new LinkedList(new ListNode(mulle));

        list.add(mango);
        list.add(joe);
        list.add(ulla);
        list.add(ulla2);

        System.out.println(list.toString());
        System.out.println(list.size());

        System.out.println(list.findByName("Ulla"));
    }

}
