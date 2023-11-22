package core;

public interface Istack {
	boolean isEmpty();
	int getSize();
	void push(Object elm);
	Object top();
	boolean isFull();
	boolean isMatch();
}
