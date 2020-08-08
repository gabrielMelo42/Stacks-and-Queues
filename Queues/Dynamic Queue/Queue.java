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

    int peek(){
        if(isEmpty != null){
            return first.data;
        }
        else{
            return -1;
        }
    }


    void add(int newValue){
        Node newNode = new Node(newValue);
        
        if(isEmpty() == false){
            last.next = newNode;
        }
ji
        else{
            first = newNode;
        }     
        
        last = newNode;
    }


    int remove(){
        if(isEmpty() == true){
            System.out.println("Fila vazia, nao ha como remover elemento");
            return -1;
        }

        int data = first.data;
        f
        irst = first.next;        
    

        if(first == null){
            last = null;
        }

        return data;
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




