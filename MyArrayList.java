package myArrayList;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E>{
	public static final int INITIAL_CAPACITY = 16;
	private E[] data = (E[]) new Object[INITIAL_CAPACITY];
	public MyArrayList() {}
	public MyArrayList(E[] objects) {
		for(E e:objects) {
			add(e);
		}
	}
	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		ensureCapacity();
		for(int i=size-1;i>=index;i--) {
			data[i+1] = data[i]; 
		}
		data[index] = element;
		size++;
	}
	
	public void ensureCapacity() {
		if(size>=data.length) {
			E[] newData = (E[])new Object[size*2+1];
			System.arraycopy(data, 0, newData, 0, size);
			this.data = newData;
		}
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		checkIndex(index);
		E e = data[index];
		for(int j = index;j<size-1;j++) {
			data[j] = data[j+1];
		}
		data[size-1] = null;
		size--;
		return e;
	}
	
	public void checkIndex(int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("index" + index + " out of bounds");
		}
	}
	
	@Override
	public int indexOf(E element) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(element.equals(data[i]))return i;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E element) {
		// TODO Auto-generated method stub
		for(int i=size-1;i>=0;i--) {
			if(element.equals(data[i]))return i;
		}
		return -1;
	}

	@Override
	public boolean contains(E element) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(element.equals(data[i]))return true;
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		data = (E[]) new Object[INITIAL_CAPACITY];
		size = 0;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		checkIndex(index);
		return data[index];
	}
	
	@Override
	public E set(int index, E e) {
		checkIndex(index);
		E old = data[index];
		data[index] = e;
		return old;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[") ;
		for(int i=0;i<size;i++) {
			result.append(data[i]);
			if(i<=size-1)result.append(",");
		}
		result.append("]");
		return result.toString();
	}
	
	@Override
	public java.util.Iterator<E> iterator(){
		return new ArrayListIterator();
	}
	
	private class ArrayListIterator implements java.util.Iterator<E> {
		int current = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current<size;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return data[current++];
		}
		
		@Override
		public void remove() {
			MyArrayList.this.remove(current);
		}
		
	}
	
	

}
