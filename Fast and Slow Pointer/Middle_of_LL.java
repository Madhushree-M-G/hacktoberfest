/*decription:we can keep two pointers at the head of our list, fast and slow pointer.
  we will start moving them, fast by 2 step and slow by 1 step. 
  Then at point where fast will be at the end, slow pointer is going to be our mid pointer. */

//function for finding a middle element of the linked list
public Node middleNode(Node head) {
     Node fast = head;
     Node slow  = head;

// Here is one tricky part, while giving condition of loop
// For list with even length, fast pointer is going to reach end i.e. null
// For off length, fast pointer is going to be at the tail
// so we have to terminate the loop 
// if fast becomes null && fast.next becomes null

     while( fast!=null && fast.next!=null){
         fast = fast.next.next; // moving fast by 2 step
         slow = slow.next;
     }
     return slow;
}
