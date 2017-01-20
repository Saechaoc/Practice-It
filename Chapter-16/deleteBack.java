/*
* Write a method deleteBack that deletes the last value (the value at the back of the 
* list) and returns the deleted value. If the list is empty, your method should throw 
* a NoSuchElementException. 
*/

public int deleteBack() {
    if(front == null) {
        throw new NoSuchElementException();
    }else if (front.next == null) {
        int returnValue = front.data;
        front = null;
        return returnValue;
    }
        ListNode currentNode = front;

        while(currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        ListNode temp = currentNode.next;
        currentNode.next = null;
    
        return temp.data;
}
