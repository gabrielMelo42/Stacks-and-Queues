public class DynamicStack{
    Node top;
    
    void initialize(){
        top = null;    
    }
    
    int pop(){
        if(top == null) return -1;
        int dataToReturn = top.data;
        top = top.next;
        return dataToReturn;
    }
    
    void push(int newData){
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = top;
        top = newNode;
    }

   boolean isEmpty(){
        if(top == null) return true;
        else return false;
    }
    
    int numberOfElements(){
        if(top == null) return 0;
        Node p = top;
        int number = 0;
        while(p != null){
            number++;
        }
        return number;
    }
}
