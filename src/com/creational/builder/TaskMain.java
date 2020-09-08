package com.creational.builder;

public class TaskMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task task = new Task.Builder("patar").setAction("action").setName("name").build();
		
		

	}

}
