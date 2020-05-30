public class StaticStack{
    int [] stack;
    int top;
    
    void initialize(){
        for(int i = 0; i < stack.length; i++){
            stack[i].data = -1;
        }
        top = -1;
    }
    
    int pop(){
        if(top <= -1){
            return -1;
        }
        int dataToReturn = top.data;
        top--;
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
