import java.util.ArrayList;

public class MyPQ implements PQInterface {

    private ArrayList<PQElement> thePQ;

    public MyPQ() {
        thePQ = new ArrayList<>();
    }

    ;
    
    public int size() {
        return thePQ.size();
    }

    ;
    
    public boolean isEmpty() {
        return thePQ.isEmpty();
    }

    ;
    
    public Object dequeue() {
        return thePQ.remove(0);

    }

    ;
    
    public void enqueue(int prioritykey, Object element) {
        PQElement elem = new PQElement(prioritykey, element);
        
        int index = findInsertPosition(prioritykey); //index from the priority key
        if (index > thePQ.size()){
            thePQ.add(elem);
        }else {
            thePQ.add(index, elem); //goes in at a specific index based on the prioritykey   
        }

    }  
    
    
    private int findInsertPosition(int newKey) {
        boolean found = false;
        PQElement elem;
        int position = 0;
        // loop over the PQ and check the key of each elem by utilising the temp PQ obj
        while (position < thePQ.size() && !found) {
            elem = thePQ.get(position); // get the key from the PQ temp element
            if (elem.getKey() > newKey) {
                position = position + 1;
            } else {
                found = true;
            }

        }
        return position;
    }

    public void printPQ(){
        PQElement elem; //create a tem element
        for(int i =0; i < thePQ.size(); i++){
            elem = thePQ.get(i);
            System.out.println("Key: " +elem.getKey() + " elem info: "  +elem.getElement());
        }
            
    };
    
    
}
