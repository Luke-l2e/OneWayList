

public class MainList {
    public static void main(String[] args) {

        // assemble a list of some elements
        OneWayList<Integer> int_list = new OneWayList<>();
        int_list.addFirst(8);
        int_list.addFirst(5);
        int_list.addFirst(2);
        int_list.addFirst(1);
        int_list.addFirst(9);
        System.out.println("#####Demonstrate list iteration:########\n ");
        System.out.println("Length: " + int_list.getLength());

        OneWayElement<Integer> element = int_list.listHead;
        for (int i = 0; i < int_list.getLength(); i++) {
            element = element.getNext();
            System.out.println("Element number: " + i + " is " + element.getData());
        }
        while (!int_list.isEmpty()) {
            System.out.println("Element " + int_list.getFirst() + " will be removed ");
            int_list.removeFirst();
        }
        int_list.getFirst();
    }
}
