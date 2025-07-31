package Algorithm.Tree.BinarySearchTree;

public interface SearchInterface<T> {
    T search(Comparable x);
    void insert(Comparable x);
    void delete(Comparable x);
    boolean isEmpty();
    void clear();
}