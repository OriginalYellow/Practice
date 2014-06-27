package intro2java.chap11;

public class PE7 {
	private int size = 0;
	private Object[] objects = new Object[16];

	/** Creates an empty list.*/
	public PE7() {

	}

	/** Appends a new element o at the end of this list.*/
	public void add(Object o) {
		if (size == objects.length) {
			Object[] temp = new Object[objects.length * 2];
			System.arraycopy(objects, 0, temp, 0, objects.length);
			objects = temp;
		}
		objects[size++] = o;
	}

	/** Adds a new element o at the specified index in this list.*/
	public void add(Object o, int index) {
		if (size == objects.length) {
			Object[] temp = new Object[objects.length * 2];
			System.arraycopy(objects, 0, temp, 0, objects.length);
			objects = temp;
		}
		System.arraycopy(objects, index, objects, index + 1, size - index);
		objects[index] = o;
		size++;
	}

	/** Removes all the elements from this list.*/
	public void clear() {
		size = 0;
		objects = new Object[16];
	}

	/** Returns true if this list contains the element o.*/
	public boolean contains(Object o) {
		for (int x = 0; x < size; x++) {
			if (objects[x].equals(o)) {
				return true;
			}
		}
		return false;
	}

	/** Returns the element from this list at the specified index.*/
	public Object get(int index) {
		if (index > size - 1) {
			return null;
		} else {
			return objects[index];
		}
	}

	/** Returns the index of the first matching element in this list.*/
	public int indexOf(Object o) {
		for (int x = 0; x < size; x++) {
			if (objects[x].equals(o)) {
				return x;
			}
		}
		return -1;
	}

	/** Returns true if this list contains no elements.*/
	public boolean isEmpty() {
		return size == 0;
	}

	/** Returns the index of the last matching element in this list.*/
	public int lastIndexOf(Object o) {
		for (int x = size - 1; x >= 0; x--) {
			if (objects[x].equals(o)) {
				return x;
			}
		}
		return -1;
	}

	/** Removes the element o from this list.*/
	public boolean remove(Object o) {
		int i = indexOf(o);
		if (i < 0) {
			return false;
		}
		System.arraycopy(objects, i + 1, objects, i, size - i - 1);
		objects[--size] = null;
		return true;
	}
	
	/**Removes the element at the specified index.*/
	public boolean remove(int index) {
		if (index >= size) {
			return false;
		}
		System.arraycopy(objects, index + 1, objects, index, size - index - 1);
		objects[--size] = null;
		return true;
	}
	
	/**Returns the number of elements in the list*/
	public int size() {
		return size;
	}
	
	/**Sets the element at the specified index.*/
	public Object set(int index, Object o) {
		if (index >= size) {
			return null;
		}
		Object old = objects[index];
		objects[index] = o;
		return old;
	}
	
	//test method
	public static void main(String[] args) {
		PE7 a = new PE7();
		for (int x = 0; x < 20; x++) {
			a.add(x);
		}
		a.add("b", 2);
		for (int y = 0; y < a.size; y++) {
			System.out.println(a.objects[y].toString());
		}
		a.remove("b");
		for (int y = 0; y < a.size; y++) {
			System.out.println(a.objects[y].toString());
		}
	}

}
