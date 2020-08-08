public class Queue{
    private int first;
    private int last;


    boolean isEmpty(){
        
        if(first == null){
            return true;
        }

        else{
            return false;
        }
        
    }


    void add(int newValue){
        Node newNode = new Node(newValue);
        
        if(isEmpty() == false){
            last.next = newNode;
        }

        else{
            first = newNode;
        }     
        
        last = newNode;
    }



    public static void main(tring [] args){
        Queue myQueue = new Queue();
        myQueue.add(2);
        myQueue.remove();
        myQueue.add(10);
        myQueue.add(12);
        myQueue.remove();
        myQueue.add(16);
        myQueue.add(17);
        myQueue.remove();
        myQueue.add(18);
        myQueue.add(19);
        myQueue.remove();
        myQueue.add(200);
    
    
    }




}




