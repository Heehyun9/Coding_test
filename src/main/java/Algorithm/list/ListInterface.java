package Algorithm.list;

//알고리즘 구현에 사용할 메서드
//상속받는쪽에서 구현해서 사용
public interface ListInterface <E>{

    public void insertElement(int i, E x);
    public void addElement(E x);
    public E removeElement(int i);
    public E getElement(int i);
    public int getSize();
    public boolean isEmpty();
    public void removeAll();
    public void printAll();

}
