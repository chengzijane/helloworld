package helloworld;

public class helloq {

	
	public static class Node {
		public int value;
		public Node next;

		public Node(int data) {
			this.value = data;
		}
	}
		public  static void printLinkedList(Node node) {
			System.out.print("Linked List: ");
			while (node != null) {
				System.out.print(node.value + " ");
				node = node.next;
			}
			System.out.println();
		}

		public static void main(String[] args) {
			Node head1 = new Node(7);
			head1.next = new Node(9);
			head1.next.next = new Node(1);
			head1.next.next.next = new Node(8);
			head1.next.next.next.next = new Node(5);
			head1.next.next.next.next.next = new Node(2);
			head1.next.next.next.next.next.next = new Node(5);
			printLinkedList(head1);
	}
}

