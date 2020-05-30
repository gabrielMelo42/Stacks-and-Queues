public class StaticStackTest{
    public static void main(String [] args){
        StaticStack myStack = new StaticStack();
        myStack.stack = new int[1024];
        myStack.initialize();
        boolean empty = myStack.isEmpty();
        System.out.println(empty);
        boolean got = myStack.push(2);
        got = myStack.push(10);
        int numberOfElements = myStack.numberOfElements();
        System.out.println(numberOfElements);
        got = myStack.push(500);
        numberOfElements = myStack.numberOfElements();
        System.out.println(numberOfElements);
        System.out.println(myStack.pop());
        int atualTop = myStack.peek();
        System.out.println(atualTop);
        empty = myStack.isEmpty();
        System.out.println(empty);
    }
}