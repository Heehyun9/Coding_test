package Algorithm.list.linkedlist;

import Algorithm.list.ListInterface;

public class CircularLinkedList<E extends Comparable<E>> implements ListInterface<E>{

    private ListNode<E> rear;
    private int count;

    public CircularLinkedList(){    //생성자
        count = 0;
        rear = new ListNode(-1);   //데이터가 없는 새로운 노드
        rear.next = rear;          //자기자신을 가리킴

    }

    @Override
    public void insertElement(int index,E data) {

        if(index >= 0 && index <=count){
            ListNode<E> preNode = getNode(index - 1);
            ListNode<E> newNode = new ListNode(data,preNode.next);
            preNode.next = newNode;
            if(index == count){
                rear = newNode;
            }
            count++;
        }

    }

    @Override
    public void addElement(E data) {
        ListNode<E> prevNode = rear;
        ListNode<E> newNode = new ListNode(data,rear.next);
        prevNode.next = newNode;
        rear = newNode;
        count++;
    }

    @Override
    public E removeElement(int index) {
        if(index >= 0 && index <= count-1){
            ListNode<E> preNode = getNode(index - 1);
            E data = preNode.next.getData();
            preNode.next = preNode.next.next;

            if(index == count){
                rear = preNode;
            }
            count --;
            return data;
        }
        else{
            return null;
        }
    }

    @Override
    public E getElement(int index) {
        if (index >= 0 && index<= count-1){
            return getNode(index).getData();
        }else
            return null; //에러
    }
    public ListNode<E> getNode(int index){
        if(index >= -1 && index <= count){
            ListNode<E> currNode = rear.next; //더미 헤드
            for(int i =0; i<= index;i++){
                currNode = currNode.next;
            }
            return currNode;
        }else
            return null;
    }

    public final int NOT_FOUND = -12345;
    public int indexOf(E x) {
        ListNode<E> currNode = rear.next;
        for (int i = 0; i <= count - 1; i++) {
            currNode = currNode.next;
            if (currNode.getData().compareTo(x) == 0) return i;
        }
        return NOT_FOUND;
    }


    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void removeAll() {
        count = 0;
        rear = new ListNode(-1);
        rear.next = rear;

    }

    @Override
    public void printAll() {
        ListNode<E> head = rear.next; //더미 헤드
        System.out.println("Print List(#items=" + count + ") ");
        for(ListNode<E> t = head.next; t != head; t = t.next){
            System.out.print(t.getData() + " ");
        }
        System.out.println();
    }
}
