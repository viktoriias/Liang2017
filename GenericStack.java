public class GenericStack<E> 
{
	private int capacity = 10;
    private int size;
    private E[] list = (E[])new Object[capacity];
    private int last = list.length;

    GenericStack() {

    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (size == 0)
            return null;
        else
            return list[size - 1];
    }

    public void push(E o) {
        list[size++] = o;
        if (size == capacity) {
            E[] tmp = (E[])new Object[capacity *= 2];
            for(int k = 0; k < list.length; k++){
            	if (list[k] != null){
            		tmp[k] = list[k];
            	}
            	
            }
            list = tmp;
        }
    }

    public E pop() {
        if (size == 0)
            return null;
        else
            return list[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString() {
    	
    	
        	String stringArray = "[";
    	for(int i = 0; i < list.length; i++)
    	{
    		if(list[i] != null){
    			if(i>0){
        			stringArray = stringArray + "," + list[i];
    			}
    			else{
    				stringArray += list[i];
    			}
    		}
    	}
        return "stack: " + stringArray + "]";
    }
}