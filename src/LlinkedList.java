import java.util.LinkedList;

public class LlinkedList {
    public static void main(String[] args) {
        System.out.println("Linked list using builtin methods");
        LinkedList num=new LinkedList();
        System.out.println("Adding elements"+num);
        num.add(25);
        num.add(14);
        num.add(1);
        num.add(12);
        num.addFirst(11);
        num.addLast(3);
        System.out.println(num);


        System.out.println("deleting elements");
        num.pop(); //removes first ele
        System.out.println(num);
        num.remove(2); //removes ele
        System.out.println(num);
        num.remove(); //works same as pop to remove the element
        System.out.println(num);


        LinkedList num2=new LinkedList();
        num2.add(111);
        num2.addFirst(888);
        num2.addLast(545);
        System.out.println(num2);
        num2.clone();
        //The clone is returned as a new Object, not printed automatically.in simple creates a shallow copy of list
        System.out.println(num2);
        num.clear(); //clears the list
        System.out.println(num);
    }
}
