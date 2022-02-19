package priorityQueue;


public class MaxPQLinkedList {
    ListNode head = null;
    ListNode tail = null;
    int N;

    public MaxPQLinkedList(){}

    public void sink(int val){

      ListNode pointer = head;
      while(  pointer!= null && val > pointer.value ){
          pointer = pointer.next;
      }
      if(pointer == null){
          tail = new ListNode(val, null, tail);
      }else{
         ListNode node =  new ListNode(val, pointer,pointer.prev);
         node.linkNeigh();


      }
      head = head.next;
      head.prev = null;
    }

    public void swim(int val){

             ListNode pointer = tail;
             while(pointer!= null && pointer.value > val ){
                 pointer  = pointer.prev;
             }

             if(pointer == null){
                 head = new ListNode(val, head, null);
                 head.next.prev = head;
             }else{
                 pointer.prev = new ListNode(val, pointer,pointer.prev);

             }

    }

    public void insert(int val){
        if(head == null){
            head = new ListNode(val);
            tail = head;
        }else{
            head = new ListNode(val, head, null);
            head.next.prev = head;
           sink(val);
        }
    }

    public int deleteMax(){
       int val = tail.value;
       tail = tail.prev;
       tail.next = null;
       return val;
    }

    public void printAll(){
        ListNode pointer = tail;
        while(pointer!= null){
            System.out.println(pointer.value);
            pointer = pointer.prev;
        }
    }

}
