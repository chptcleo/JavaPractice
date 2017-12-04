package com.creational.prototype;

import java.util.Vector;

public class PrototypeManager {

	public Vector<Prototype> vector = new Vector<Prototype>();
	
	public void add(Prototype p){
		vector.add(p);
	}
	
	public Prototype get(int i){
		return vector.get(i);
	}
	
	public int getSize(){
		return vector.size();
	}
}
