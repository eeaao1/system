package od.ext;

import lombok.val;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkTest {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(4);
        n1.next.next = new Node(8);

        Node n2 = new Node(2);
        n2.next = new Node(5);
        n2.next.next = new Node(6);

        Node n3 = new Node(3);
        n3.next = new Node(4);
        n3.next.next = new Node(9);
        n3.next.next.next = new Node(11);
        Node[] n = {n1, n2, n3};
        ss(n);

    }

    public static void ss(Node[] n) {
        PriorityQueue<Node> nodes = new PriorityQueue<>((a, b) -> a.v - b.v);
        for (int i = 0; i < n.length; i++) {
            nodes.add(n[i]);
        }
        Node head = new Node();
        Node tmp = head;
        while (nodes.size() > 0) {
            Node curNode = nodes.poll();
            tmp.next = curNode;
            tmp = tmp.next;
            if (curNode.next != null) {
                nodes.add(curNode.next);
            }
        }
        head = head.next;
        while (head != null) {
            System.out.println(head.v);
            head = head.next;
        }
    }
}
