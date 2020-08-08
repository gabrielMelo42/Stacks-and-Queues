public class Queue{
    private int first;
    private int last;



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

}