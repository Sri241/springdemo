package com.wipro.training.springdemo;

//Bean class - DI by constructor

public class Book {
	
	private int bId;
    private String bName;
    private Long price;
  
    public Book() {
    	System.out.println("Dependancy injection using constructor");
    }

	public Book(int bId, String bName, Long price) {
		this.bId = bId;
		this.bName = bName;
		this.price = price;
	}

	public Book(int bId) {
		this.bId = bId;
	}

	public Book(String bName) {
		this.bName = bName;
	}

	public Book(Long price) {
		this.price = price;
	}
	public void show()
    {
        System.out.println(bId+ " "+bName+" "+price);
    }
    
	

}