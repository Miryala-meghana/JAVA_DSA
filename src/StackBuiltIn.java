import java.util.Stack;

public class StackBuiltIn {
    public static void main(String[] args) {
//        using builtin stack methods of java
        Stack data=new Stack();
        System.out.println("Stack is empty : "+data.empty());
        data.push(12);
        data.push(13);
        data.push(2);
        System.out.println(data);
        data.pop();
        System.out.println(data);
        System.out.println(data.peek());
        System.out.println("Stack is empty : "+data.empty());

    }
}
