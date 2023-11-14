package linked;

public class MyLinkedList<E> implements ListInterface<E> {
	private ListNode<E> head = null;
	private int  numNode = 0;
	
	public MyLinkedList(){
		
	}
    public MyLinkedList(E item){
		head=new ListNode<>(item, null);
		numNode = 1;
	}
	

	@Override
	public boolean isEmty() {
		if(numNode == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return numNode;
	}

	@Override
	public E getFist() {
		return isEmty() ? null : head.getElement();
	}
// them phan tu
	@Override
	public void addFist(E item) {
		head = new ListNode<>(item, head);
		numNode++;
	}

	@Override
	public boolean contrain(E item) {
		for(ListNode<E> n = head; n != null; n = n.getNext()) {
			if(n.getElement().equals(item)) {
				return true;
			}
		}
		return false;
	}
//xoa phan tu
	@Override
	public E removeFist() {
		if(isEmty()){return null;
	}
		E item = head.getElement();
		head = head.getNext();
		numNode--;
		return item;
		}
	@Override
	public void print() {
		for(ListNode<E> n = head; n != null; n = n.getNext() ) {
			System.out.println(String.format("%s, ",n.getElement().toString()));
		}
	}

	@Override
	public ListNode<E> getHead() {
		
		return head;
	}

	@Override
	public void addAfter(ListNode<E> current, E item) {
		if(current == null) {
			addFist(item);
		}
		else {
			current.setNext(new ListNode<>(item , current.getNext()));
			numNode++;
		}
	}

	@Override
	public E removeAfter(ListNode<E> current) {
		if(current == null) {
			return removeFist();
		}else {
			ListNode<E> delNode = current.getNext();
			if(delNode == null) {
				return null;
			}else {
				current.setNext(delNode.getNext());
				numNode++;
				return delNode.getElement();
			}
		}
		
	}

	@Override
	public E remove(E item) {
		ListNode<E> prevNode = null;
		for(ListNode<E> n = head; n != null; n = n.getNext()) {
			if(n.getElement().equals(item)) {
				return removeAfter(prevNode);
			}
			prevNode = n;
		}
		return null;
	}
	
}

