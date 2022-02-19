package priorityQueue;

public class PriorityQueueClient {
    public static void main(String[] args)
    { // Print the top M lines in the input stream.
//        int M = Integer.parseInt("10");
////
////        MaxPQ<Transaction> pq = new MaxPQ<Transaction>(M+1);
////
////        while (StdIn.hasNextLine() )
////        { // Create an entry from the next line and put on the PQ.
////            pq.insert(new Transaction(StdIn.readLine()));
////            if (pq.size() > M)
////                pq.delMax(); // Remove minimum if M+1 entries on the PQ.
////        } // Top M entries are on the PQ.
////        Stack<Transaction> stack = new Stack<Transaction>();
////        while (!pq.isEmpty()) stack.push(pq.delMax());
////        for (Transaction t : stack) System.out.println(t);
        char[] input = new char[]{'P', 'R', 'I', 'O','*','R','*', '*', 'I', '*', 'T', '*', 'Y', '*',  '*', '*',  'Q', 'U', 'E', '*', '*', '*','U','*','E'};
        MaxPQ<Character> pq = new MaxPQ<>(input.length+1);
        for(int i = 0 ; i < input.length; i++){
            if(input[i] == '*'){
            //    System.out.print(pq.delMax());
            }else{
               pq.insert(input[i]);
            }
        }

        int[] arr = new int[]{1,3,2,5,4,6,9,7,8,5,23,56,43};
        MaxPQLinkedList pqL = new MaxPQLinkedList();
        for(int i = 0; i < arr.length; i++){
            pqL.insert(arr[i]);
        }
        pqL.printAll();
//        for(int i = 0; i < arr.length/2; i++){
//            System.out.print(pqL.deleteMax());
//        }


    }
}
