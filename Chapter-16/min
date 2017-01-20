/*
Write a method min that returns the minimum value in a list of integers. If the list is empty, it should throw a NoSuchElementException.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
*/

public int min() {
    if(front == null) {
        throw new NoSuchElementException();
    }
    ListNode temp = front;
    int value = front.data;
    while(temp != null) {
        int min = temp.data;
        if(min < value) {
            value = min;
        }
        temp = temp.next;
    }
    return value;
}
