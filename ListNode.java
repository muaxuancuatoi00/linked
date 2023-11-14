package linked;

public class ListNode<E> {
	private E element = null;
	private ListNode<E> next;
	
	//constructor
	public ListNode(E element) {
		this.element = element;
	}

	public ListNode(E element, ListNode<E> next) {
		this.element = element;
		this.next = next;
	}

	//getter setter
	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public ListNode<E> getNext() {
		return next;
	}

	public void setNext(ListNode<E> next) {
		this.next = next;
	}

}
