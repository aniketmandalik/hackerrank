/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
  Node n = head;
    if (position == 0) {
        head = head.next;
        return head;
    }
    else {
        int p=0;
        while (p!=position-1){
            n= n.next;
            p++;
        }
        n.next = n.next.next;
        return head;
    }
}
