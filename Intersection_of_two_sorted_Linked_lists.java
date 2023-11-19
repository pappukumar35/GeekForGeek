class Intersection_of_two_sorted_Linked_lists {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node demmy = new Node(-1);
        Node curr = demmy;
        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                Node temp = new Node(head1.data);
                curr.next = temp;
                curr = curr.next;
                head1 = head1.next;
                head2 = head2.next;

            } else if (head1.data < head2.data)
                head1 = head1.next;
            else
                head2 = head2.next;
        }
        return demmy.next;
    }
}