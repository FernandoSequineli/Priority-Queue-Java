public class PQElement {

    private Object element;
    private int key;
    
    public PQElement(int priority, Object e){
        key = priority;
        element = e;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
    
}
