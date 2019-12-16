package myArrayList;

public interface MyList<E> extends Iterable<E> {
	public void add(E element);
	public void add(int index, E element);
	public boolean remove(E element);
	public E remove(int index);
	public int size();
	public boolean isEmpty();
	public int indexOf(E element);
	public int lastIndexOf(E element);
	public boolean contains(E element);
	public void clear();
	public E get(int index);
	E set(int index, E e);
}
