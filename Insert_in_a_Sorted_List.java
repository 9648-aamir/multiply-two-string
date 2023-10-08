public class Insert_in_a_Sorted_List {
    class Solution {
        Node sortedInsert(Node head, int data) {
            Node newNode = new Node(data);
            if (head == null || head.data >= newNode.data) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null && current.next.data < newNode.data) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
            return head;
        }
    }
    
}
