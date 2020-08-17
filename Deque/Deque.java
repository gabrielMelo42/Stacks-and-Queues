
public class Deque{
    Node begin1;
    Node begin2;

    public Deque(){
        this.begin1 = null;
        this.begin2 = null;
    }

    void add(int data) {
      Node newNode = new Node(data);
      newNode.next = begin1;
      
      if(begin1 != null){
          begin1.previous = newNode;
      }
      
      else{
        begin2 = newNode;
      }
    
      begin1 = newNode;
    }


    int removeFromBegin1() {
      if(begin1 == null) return -1;
      Node aux = begin1;
      int data = aux.data;
      begin1 = begin1.next;
   
      if(begin1 == null){
        begin2 = null;
      }
   
      else{
        begin1.previous = null;
      }
   
      return data;
  }

}
