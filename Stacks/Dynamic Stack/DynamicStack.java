public class DynamicStack{
    Node top;
    
    void initialize(){
        top.next = null;
        top.data = -1;
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

    public static void main(String [] args){}
}
