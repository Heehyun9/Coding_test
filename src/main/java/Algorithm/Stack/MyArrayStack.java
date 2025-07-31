package Algorithm.Stack;

import Algorithm.List.arraylist.MyArrayList;


//ArrayList를 이용하여 Stack 구현
//가장 최근에 본 항목 사용할때 자주 사용 , or 되돌리기 기능
public class MyArrayStack<E> extends MyArrayList<E> implements StackInterface<E>{

    int top; //pointer

    public MyArrayStack(){
        top = 0;
    }

    public MyArrayStack(int size){
        super(size);
    }


    @Override
    public void push(E newItem) {

        //가득 찼는지 체크
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        addElement(newItem);
        top++;
    }



    @Override
    public E pop() {
        if(top == 0 ){
            System.out.println("Stack is empty");
            return null;
        }
        return removeElement(top - 1);
    }

    @Override
    public E peek() {
        if(top == 0 ){
            System.out.println("Stack is empty");
            return null;
        }
        return getElement(top - 1);
    }

    @Override
    public void popAll() {
        printAll();
    }

    public boolean isFull() {
        if(top == getCapacity()){
            return true;
        }else
            return false;
    }

    public boolean isEmpty(){
        if(top == 0){
            return true;
        }else
            return false;
    }

}
