package com.fastcampus.list.linkedlist;

import com.fastcampus.list.ListInterface;

public class MyLinkedList<E> implements ListInterface<E> {

    private ListNode<E> head;
    int count;

    public MyLinkedList()
    {
        head = null;
        count = 0;
    }

    public void addElement( E data )
    {

        ListNode newNode;
        if(head == null){
            newNode = new ListNode(data);
            head = newNode;
        }
        else{
            newNode = new ListNode(data);
            ListNode temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        count++;
    }

    public void insertElement(int position, E data )
    {
        int i;
        ListNode<E> tempNode = head;
        ListNode<E> newNode = new ListNode(data);

        if(position < 0 || position > count ){
            System.out.println("추가할 위치 오류입니다. 현재 리스트 자료의 개수는 " + count +"개 입니다.");
            return;
        }

        if(position == 0){  //first element
            newNode.next = head;
            head = newNode;
        }
        else{
            ListNode<E> preNode = null;
            for(i=0; i<position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;

            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return;
    }

    public E removeElement(int position)
    {
        int i;
        ListNode<E> tempNode = head;

        if(position >= count ){
            System.out.println("삭제할 위치 오류입니다. 현재 리스트 자료의 개수는 \" + count +\"개 입니다.");
            return null;
        }

        if(position == 0){
            head = tempNode.next;
        }
        else{
            ListNode<E> preNode = null;
            for(i=0; i<position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position + "번째 항목이 삭제되었습니다.");

        return tempNode.getData();
    }

    public E getElement(int position)
    {
        int i;
        ListNode<E> tempNode = head;

        if(position >= count ){
            System.out.println("검색할 위치 오류입니다. 현재 리스트 자료의 개수는 \" + count +\"개 입니다.");
            return null;
        }

        if(position == 0){

            return head.getData();
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode.getData();
    }

    public ListNode<E> getNode(int position)
    {
        int i;
        ListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색할 위치 오류입니다. 현재 리스트 자료의 개수는 \" + count +\"개 입니다.");
            return null;
        }

        if(position == 0){

            return head;
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode;
    }

    public void removeAll()
    {
        head = null;
        count = 0;

    }

    public int getSize()
    {
        return count;
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        ListNode<E> temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty()
    {
        if(head == null) return true;
        else return false;
    }

    public void reverseList()
    {
        if(head == null) return;

        ListNode<E> currentNode = null;
        ListNode<E> preNode = null;
        ListNode<E> nextNode = head;

        while (nextNode != null){
            preNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
            currentNode.next = preNode;
        }

        head = currentNode;

    }
}
