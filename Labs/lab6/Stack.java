public interface Stack<E> {
    boolean isEmpty();
    E peek();
    E pop();
    void push(E element);
    public void clear();
}