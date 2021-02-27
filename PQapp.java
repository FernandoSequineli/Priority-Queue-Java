
public class PQapp {

    public static void main(String[] args) {
        
        MyPQ pq = new MyPQ();
        pq.enqueue(2, "Broken Toe");
        pq.enqueue(10, "coma");
        pq.enqueue(7, "manFlu");
        pq.enqueue(9, "toxic shock");
        pq.printPQ();
       // System.out.println("size:" + pq.size());
        PQElement e = (PQElement)pq.dequeue();
        System.out.println("Top of the Queue: "+e.getElement());
        pq.printPQ();
    }
    
}
