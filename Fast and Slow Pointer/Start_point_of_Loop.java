/* description:we have to move fast by two-step and slow by 1. when fast and slow meet, It’s not necessary that they will meet at the start of the cycle.
So to find the starting point. When they meet, point start to head again, and move fast by 1 step and slow by 1 step. And finally they will meet at the starting point of cycle. */

//function for finding a starting of a loop in java
public Node detectCycle(Node head) {
     Node slow = head;
     Node fast = head;

     while(fast!=null && fast.next!=null){
         slow = slow.next;
         fast = fast.next.next;

         if(slow==fast){
             slow = head; //moved slow to head

         // moving fast and slow pointer by 1 step until they meet again
             while(fast!=slow){
                 slow = slow.next;
                 fast = fast.next;
             }
             return slow;
         }
     }
     return null;
}
