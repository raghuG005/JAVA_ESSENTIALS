package DS.Stack;

public class Main {

    public static void main(String[] args) throws Exception {

        StackImpl<Integer> stack = new StackImpl<Integer>();
        stack.setSize(3);
        stack.push(4);
        stack.push(2);
        stack.push(1);
        stack.printData();
        System.out.println("Top of the Stack " + stack.getTopElement());
        System.out.println("Bottom of the Stack " + stack.getBotttomElement());
        // System.out.println("Data Removed " + stack.pop());
        System.out.println("Top of the Stack " + stack.getTopElement());
        System.out.println("Bottom of the Stack " + stack.getBotttomElement());
        System.out.println("Data Removed " + stack.pop());
        System.out.println("Data Removed " + stack.pop());
        System.out.println("Data Removed " + stack.pop());
        System.out.println("Data Removed " + stack.pop());
        System.out.println("Data Removed " + stack.pop());
        stack.push(4);
        stack.push(2);
        stack.push(1);

        stack.printData();

    }

}
