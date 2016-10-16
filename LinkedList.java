//Kelly Briceno
//ICSI 213 linkedlist assignment

public class LinkedList { 
static int noOfLinkedList = 0;
  
  int data;
  
  DNode previousNode;
  DNode nextNode;
  
  DNode (int data) {
    
     this.data = data;
     noOfLinkedList++;
}
