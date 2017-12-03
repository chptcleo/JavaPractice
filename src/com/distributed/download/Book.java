package com.distributed.download;


public class Book extends Product {

	private String isbn;

	@Override
	public String getDescription() {

		return this.getDescription() + " " + isbn;
	}

	public Book(String title, String isbn, double price) {
		super(title, price);
		this.isbn = isbn;
	}

	private static final long serialVersionUID = -7570939993069699362L;

}
