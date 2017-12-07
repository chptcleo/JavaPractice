package com.pattern.structural.composite.limpidity;

import java.util.Enumeration;

public interface Component {

	public Composite getComposite();
	
	public void operation();
	
	public void add(Composite c);
	
	public void remove(Composite c);
	
	public Enumeration<Composite> components();
}
