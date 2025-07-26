package com.fastcampus.Stack;

public interface StackInterface<E> {
    public void push(E newItem);
    public E pop();
    public E peek();  //맨 아래를 참조
    public boolean isEmpty();
    public void popAll();
}
