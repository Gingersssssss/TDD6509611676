package core;

import java.util.ArrayList;

public class Stack implements Istack {
	
	ArrayList elms = new ArrayList();
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		if (elms != null)
			return elms.size();
		else
			return 0;
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void push(Object elm) {
		// TODO Auto-generated method stub
		elms.add(elm);
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return elms.get(getSize()-1);
	}
	
	@Override
	public boolean isMatch() {
		// TODO Auto-generated method stub
		return false;
	}
}
