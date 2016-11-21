/*
Write a static method named contains that accepts two arrays of integers a1 and a2 
as parameters and that returns a boolean value indicating whether or not a2's sequence 
of elements appears in a1 (true for yes, false for no). The sequence of elements in a2 
may appear anywhere in a1 but must appear consecutively and in the same order. 
For example, if variables called list1 and list2 store the following values:

int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
int[] list2 = {1, 2, 1};
Then the call of contains(list1, list2) should return true because list2's sequence 
of values {1, 2, 1} is contained in list1 starting at index 5. If list2 had stored the 
values {2, 1, 2}, the call of contains(list1, list2) would return false because list1 
does not contain that sequence of values. Any two lists with identical elements are 
considered to contain each other, so a call such as contains(list1, list1) should return true.

You may assume that both arrays passed to your method will have lengths of at least 1. 
You may not use any Strings to help you solve this problem, nor methods that produce Strings such as Arrays.toString.
*/

public static boolean contains(int[] a1, int[] a2) {
    int i = 0;
    for(int j = 0; j < a1.length; j++) {
        if (a1[j] == a2[i]) {
            i++;
            if (i == a2.length) {
                return true;
            }
        } else {
            i = 0;
            if (a1[j] == a2[i]) {
                i++;
            }
        }
    }
    return false;
}
