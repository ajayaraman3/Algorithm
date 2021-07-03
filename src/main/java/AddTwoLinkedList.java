import java.util.Iterator;
import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");

        LinkedList linkedList2 = new LinkedList();
        linkedList2.add("4");
        linkedList2.add("5");
        linkedList2.add("6");

        LinkedList r = addTwoNumbers(linkedList, linkedList2);
        System.out.println(r.toString());
    }

    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        Iterator iterator = l1.descendingIterator();
        StringBuffer s = new StringBuffer();
        while(iterator.hasNext()) {
            s.append(iterator.next());
        }

        //System.out.println(Integer.valueOf(s.toString()));
        int val1 = Integer.valueOf(s.toString());

        Iterator iterator2 = l2.descendingIterator();
        StringBuffer s2 = new StringBuffer();
        while(iterator2.hasNext()) {
            s2.append(iterator2.next());
        }
        int val2 = Integer.valueOf(s2.toString());
        //System.out.println(val2);

        int sum = val1 + val2;


        StringBuffer resultSum =  new StringBuffer(Integer.toString(642));
        System.out.println(resultSum.reverse().toString());
        char[] resultArray =  new char[resultSum.length()];
        LinkedList finalResult = new LinkedList();
        for(int i=0;i<resultSum.length();i++) {
            resultArray[i] = resultSum.charAt(i);
            finalResult.add(resultArray[i]);
        }
        return finalResult;

    }
}