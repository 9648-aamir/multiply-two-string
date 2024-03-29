public class Merge_sortelinked_listin_reverse_order {
    Node rev(Node head) {
        Node curr = head, next = null, prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    Node mergeResult(Node node1, Node node2) {
        // Your code here
        Node head = new Node(-1), curr = head;
        while (node1 != null && node2 != null) {
            if (node1.data < node2.data) {
                curr.next = new Node(node1.data);
                node1 = node1.next;
                curr = curr.next;
            } else {
                curr.next = new Node(node2.data);
                node2 = node2.next;
                curr = curr.next;
            }
        }
        while (node1 != null) {
            curr.next = new Node(node1.data);
            node1 = node1.next;
            curr = curr.next;
        }
        while (node2 != null) {
            curr.next = new Node(node2.data);
            node2 = node2.next;
            curr = curr.next;
        }
        return rev(head.next);
    }
}
