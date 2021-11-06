package Practice_problem;

class LinkedList {
	Node head;
	Node tail;

	public Node push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		return newNode;
	}

	public void show() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}

	public Node append(int data) {
		return head;

	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class Stack_Queues {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(56);
		list.push(30);
		list.push(70);
		list.show();
	}
}
