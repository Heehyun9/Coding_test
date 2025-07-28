package Algorithm.Queue;
//큐 : 순서에 기반한 처리 , 시스템의 이벤트나 메시지 처리할때 사용
public interface QueueInterface<E> {
    public void enQueue(E x);
    public E deQueue();
    public E front();
    public boolean isEmpty();
    public void dequeueAll();
}
