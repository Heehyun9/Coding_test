package Algorithm.List.arraylist;

import Algorithm.List.ListInterface;

public class MyArrayList<E> implements ListInterface<E> {


    private int count;   //가지고 있는 element 개수
    private E[] objectList;  //배열 할당

    private int DEFAULT_CAPACITY = 10;
    public static final int ERROR_NUM = -999999999;

    //생성자
    public MyArrayList(){
        objectList = (E[]) new Object[DEFAULT_CAPACITY];     //E 로 type casting
    }

    public MyArrayList(int size){
        DEFAULT_CAPACITY = size;
        objectList = (E[]) new Object[size];  //크기만큼 할당
    }

    @Override
    public void insertElement(int position, E data) {
        //배열은 중간에 빈칸 있으면 안됨 중간 공백을 다 없애고 insert, delete등 해야함
        if(count >= DEFAULT_CAPACITY){
            System.out.println("not enough memory");
            return;
        }

        if(position < 0 || position > count){
            System.out.println("insert position error");
            return;
        }

        if(position == count){
            objectList[count++] = data;
            return;
        }
    
        for(int i = count -1; i>= position; i--){
            objectList[i+1] = objectList[i];
        }

        objectList[position] = data;
        count++;

    }

    @Override
    public void addElement(E data) {
        if(count >= DEFAULT_CAPACITY){
            System.out.println("not enough memory");
            return;
        }

        objectList[count++] = data;

    }

    @Override
    public E removeElement(int position) {
        if(isEmpty()){
            System.out.println("not enough memory");
            return null;
        }

        if(position < 0 || position >= count){
            System.out.println("remove position error");
            return null;
        }

        E ret = objectList[position];

        for(int i = position; i< count-1; i++){
            objectList[i] = objectList[i+1];
        }

        count--;
        return ret;
    }

    @Override
    public E getElement(int i) {
        return objectList[i];
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }else return false;
    }

    @Override
    public void removeAll() {

        objectList = (E[]) new Object[DEFAULT_CAPACITY];
        count = 0;
    }

    @Override
    public void printAll() {
        if(count == 0){
            System.out.println("Array is empty");
            return;
        }

        for(int i = 0; i<count; i++){
            System.out.println(objectList[i]);
        }

    }


    public int getCapacity(){
        return DEFAULT_CAPACITY;
    }
}
