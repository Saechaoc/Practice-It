/*
Write a method isSorted that returns true if the list is in sorted (nondecreasing) order and returns false otherwise. An empty list is considered to be sorted.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
*/
public boolean isSorted() {
    if(front == null || front.next == null) {
        return true;
    }
    ListNode temp = front;
    boolean isSorted = true;
    int tempVal = front.data;
    
    while(temp.next != null) {
        temp = temp.next;
        int next = temp.data;
        if(tempVal > next) {
            return false;
        }
        tempVal = next;
    }
    return isSorted;
    
}
