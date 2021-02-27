/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weew3;

/**
 *
 * @author fernando
 */
public class PQapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
