public class DynamicStack{
    Node top;
    
    void initialize(){
        top = null;    
    }
    
    int pop(){
        if(!top) return -1;
        int dataToReturn = top.data;
        top = top.next;
        return dataToReturn;
    }
    
    boolean push(int newData){
        if(top >= stack.length - 1){
            return false;
        }
        stack[top + 1] = newData; 
        top++;
        return true;
    }
    
    boolean isEmpty(){
        if(top < 0){
            return true;
        }
        else return false;
    }
    
    int numberOfElements(){
        int number = top + 1;
        return number;
    }

}
