import java.util.Stack;
import java.util.ArrayList;

public class OperationsOnLinkedList {
    static ListNode head = null;
    public static void main(String[] args) {
        addNode( 2);

        addNode(3);
        addNode(4);
        addNode(5);
//        while(head!=null){
//            System.out.println(head.value);
//            head = head.next;
//        }
        System.out.println(isPalindrome(head));

    }


        public static boolean isPalindrome(ListNode head) {


            Stack<Integer> stack = new Stack<>();

            ListNode node = head;

            while(node != null){
                stack.push(node.value);
                node = node.next;
            }

            while(!stack.isEmpty()){
                if(stack.peek() != head.value ) {
                    return false;
                }
                stack.pop();
                head = head.next;
            }
            return true;
        }

    // issue head is null its next is null
    public static void addNode( int val){

          head = new ListNode(val, head);

        }

//    Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
//
//    It is guaranteed that the node to be deleted is not a tail node in the list.
public void deleteNode(ListNode node) {
    ListNode last = null ;
    while(node.next!= null){
        node.value = node.next.value ;
        last = node;
        node = node.next;
    }
    last.next = null;
}

//    Write a program to find the node at which the intersection of two singly linked lists begins.
//
//    For example, the following two linked lists:
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);

        int diff;

        if(len1> len2){
            diff = len1-len2;
        }else{
            ListNode temp;
            temp = headA;
            headA = headB;
            headB = temp;
            diff = len2 - len1;
        }

        while(diff>0){
            headA = headA.next;
            diff--;
        }
        if(headA == headB){
            return headA;
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
            if(headA == headB){
                return headA;
            }
        }
        return null;

    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = getLength(head);

        ListNode quasi = head;

        ListNode prev = null;

        while(len-- != n){
            prev = quasi;
            quasi = quasi.next;
        }
        if(prev == null){
            return head.next;
        }else if(quasi.next != null){
            prev.next = quasi.next;
        }else{
            prev.next = null;
        }

        return head;
    }
    // remove nth element from back
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        int len = getLength(head);
//
//        ListNode quasi = head;
//
//        ListNode prev = null;
//
//        while(len-- != n){
//            prev = quasi;
//            quasi = quasi.next;
//        }
//        if(prev == null){
//            return head.next;
//        }else if(quasi.next != null){
//            prev.next = quasi.next;
//        }else{
//            prev.next = null;
//        }
//
//        return head;
//    }

    //Given the head of a linked list, rotate the list to the right by k places.

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        int len = getLength(head);

        ListNode quasi = head;

        if(len != 0)
            k = k%len;
        while(len-- > k+1){
            quasi = quasi.next;
        }


        ListNode newhead = null;

        if(quasi.next == null){
            return head;
        }
        else{
            newhead = quasi.next;
            quasi.next = null;
            ListNode prev = null;
            quasi = newhead;
            while( quasi != null){
                prev =  quasi;
                quasi = quasi.next;}
            prev.next = head;
            return newhead;
        }
    }

//    You are given two linked lists: list1 and list2 of sizes n and m respectively.
//
//    Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
//
//    The blue edges and nodes in the following figure incidate the result:

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode quasi = list1;
        ListNode start = null;
        ListNode end = null;

        while(a-- > 1){
            quasi = quasi.next;
        }
        start = quasi;
        quasi = list1;
        while(b-- >= 0){
            quasi= quasi.next;
        }
        end = quasi;

        start.next = list2;

        while(list2.next!= null){
            list2 = list2.next;
        }

        list2.next = end;

        return list1;
    }

   public static int getLength(ListNode head){
       return 0;
   }


}
