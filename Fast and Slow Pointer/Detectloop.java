//there is a fast pointer moving 2 steps a time and a slow pointer moving 1 step. There is going to be a point where both fast and slow are going to collide.
//function for detecing a loop in linked list
public boolean hasCycle(Node head) {
      Node slow  = head;
      Node fast  = head;
        
// if there is cycle, fast is never going to be null
// if there is no cycle, fast or fast.next whichever becomes null,return false

      while(fast!=null && fast.next!=null){
          slow = slow.next;
          fast = fast.next.next;

          if(slow==fast)return true;
      }
      return false;
}
