import java.util.LinkedList;

class Node
{
    public int data;
    public Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class LLinkedListss {
    static Node head = null;
    public static void main(String[] args) {
//        adding ele to Linked list
        addEle(10);
        addEle(25);
        addEle(11);
        addEle(14);
//        adding ele at first
        addEleAtFirst(1);
        addEleAtFirst(0);
//        printing the linked List
        printList();
//        deleting ele from linked list
        delEle(214);
        printList();


    }


    public static void addEle(int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        Node current = head;

        if (head == null)
            head = newNode;
        else {
            while (current.next != null)
                current = current.next;
            current.next = newNode;

        }

    }

    public static void addEleAtFirst(int data)
    {
        Node current=head;
        Node temp;
        Node newNode = new Node(data);
        temp=head;
        head=newNode;
        head.next=temp;
    }

    public static void printList() {
        Node current = head;

        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Linked List elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static void delEle(int key) {
        Node current = head;
        Node temp = null;

//        while (current != null && current.next.data!=key) {
//            current = current.next;
//        }
//        if(current.next!=null)
//        {
//            current.next=current.next.next;
//        }
        while (current != null && current.data!=key)
        {
            temp=current;
            current=current.next;
        }
//key data is now in current
        if(current==null)
        {
            System.out.println("element "+key +" not exists in list");
            return;
        }

        temp.next=current.next; //unliking the key data
        System.out.println("deleted ele is "+current.data);
    }

}
