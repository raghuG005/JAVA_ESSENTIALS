package DS.Stack;

public interface IStack<T extends Object> {

    void push(T data) throws Exception;

    T pop() throws Exception;

    T getTopElement() throws Exception;

    T getBotttomElement() throws Exception;

    void setSize(int stackSize) throws Exception;

    void printData() throws Exception;

}
