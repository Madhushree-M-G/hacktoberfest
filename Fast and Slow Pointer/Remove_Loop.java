/* description: When fast and slow pointers meet for the first time,
  we point slow to the head and start another loop moving both pointer 1 step at a time. 
  In the previous question, we break the inner loop when they meet again.
  But to find the last node, we need to understand that,
  when slow will be at the position before starting node of cycle and fast will also be at the previous node of entry point of cycle, 
  which is the last node. Both will point the same node. */ 

//function fo removing a loop from the linked list.
public void removeCycle(Node head) {
     Node slow = head;
     Node fast = head;
     while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
         if (slow == fast) {
             slow = head;
//when both slow and fast point to the same node break the loop
             while (slow.next != fast.next) {
                 slow = slow.next;
                 fast = fast.next;
             }
// point fast to null, to remove the cycle
             fast.next = null;
         }
     }
}
