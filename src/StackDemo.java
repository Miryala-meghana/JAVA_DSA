public class StackDemo {
    static int[] num;
    static int top;
    static int size;

    public StackDemo(int size) {
        this.size = size;
        num=new int[5];
        top=-1;
    }


    public static void main(String[] args) {
        StackDemo stack = new StackDemo(5);
        int size;
//      push ele to stack
        pushEle(23);
        pushEle(3);
        pushEle(2);
        pushEle(223);
        pushEle(123);
        DisplayStack();
        pushEle(13);
        pushEle(1);
        DisplayStack();
        popEle();DisplayStack();
        popEle();DisplayStack();
        System.out.println("peek Element in the Stack is:"+peekEle());
        if (top == -1) {
            System.out.println("Stack is empty");
        }
    }

    private static int peekEle() {
//        System.out.println(num[size-1]);
        if (top == -1) {
            return -1;
        } else {
            return top;
        }
    }

    private static void pushEle(int data) {

        if (top == size - 1) {
            System.out.println("\nStack Overflow! Cannot push " + data);
        }
        else
            {
                top++;
                num[top] = data;
            }

        }
        private static void DisplayStack () {
//        if we use this method the array still holds the popped data and prints all
//            for (int n : num) {
//                System.out.print(n + " ");
//            }
            System.out.println("Printing the Stack elements\n");
            if (top == - 1) {
                System.out.println("\n Stack is empty "  );
            }
            else{
                for(int i=0;i<=top;i++)
                    System.out.print("\t"+num[i]);
            }
            System.out.println();
        }
        private static void popEle ()
        {
            if (top == - 1) {
                System.out.println("\nStack underflow! Cannot pop "  );
            }
            else {
                System.out.println("\npopped element :" +num[top]);
                top--;
            }

        }

    }
