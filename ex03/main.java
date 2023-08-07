package HW_3_Algorithm;

public class main {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.add(7);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(4);

        list.print();
        list.sort();
        list.print();
        list.revert();
        list.print();

    }
    
}
