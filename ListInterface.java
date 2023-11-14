package linked;

public interface ListInterface<E> {
	boolean isEmty();
	int size();
	E getFist();
	void addFist(E item);
	boolean contrain(E item);
	E removeFist();
	void print();
	ListNode<E> getHead();
	void addAfter(ListNode<E> current, E item);
	E removeAfter(ListNode<E> current);
	E remove(E item);

}
