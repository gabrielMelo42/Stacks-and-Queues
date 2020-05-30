public class Test{
    public static void main(String [] args){
        DynamicStack myStack = new DynamicStack();
        boolean empty = myStack.isEmpty();
        System.out.println(empty);
        myStack.push(2);
        myStack.push(10);
        int numberOfElements = myStack.numberOfElements();
        System.out.println(numberOfElements);
        myStack.push(500);
        numberOfElements = myStack.numberOfElements();
        System.out.println(numberOfElements);
        System.out.println(myStack.pop());
        int atualTop = myStack.peek();
        System.out.println(atualTop);
        empty = myStack.isEmpty();
        System.out.println(empty);
    }
}
