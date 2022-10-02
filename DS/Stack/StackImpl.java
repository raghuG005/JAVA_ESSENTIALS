package DS.Stack;

public class StackImpl<T extends Object> implements IStack<T> {

    private int top = -1;
    private int size = 0;
    private T[] storeData;

    StackImpl() {

    }

    @SuppressWarnings("unchecked")
    @Override
    public void setSize(int stackSize) {

        if (stackSize <= 0) {
            System.err.println("Size should be greater than 0");
            return;
        }
        this.size = stackSize;
        this.storeData = (T[]) new Object[size];
    }

    @SuppressWarnings("unchecked")
    @Override
    public void push(Object data) throws Exception {

        if (this.size <= 0) {
            System.err.println("Size should be greater than 0");
            return;
        }

        if (this.top == this.size - 1) {
            System.err.println("Stack is Full");
            return;
        }
        this.storeData[++top] = (T) data;
    }

    @Override
    public T pop() throws Exception {

        if (this.top == -1) {
            System.err.println("Stack is Empty");
            return null;
        }
        T actualData = this.storeData[top];
        // this.storeData[top] = null;
        this.top = top - 1;
        return (T) actualData;
    }

    @Override
    public T getTopElement() throws Exception {
        if (this.top == -1) {
            System.err.println("Stack is Empty");
            return null;
        }
        return this.storeData[this.top];
    }

    @Override
    public T getBotttomElement() throws Exception {
        if (this.top == -1) {
            System.err.println("Stack is Empty");
            return null;
        }

        return this.storeData[0];
    }

    @Override
    public void printData() throws Exception {
        if (this.size == 0 || this.top == -1) {
            System.err.println("Stack is Empty");
            return;
        }

        for (int i = 0; i <= this.top; i++) {
            System.out.print(this.storeData[i] + ",");
        }

    }

}
