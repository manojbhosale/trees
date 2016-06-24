package com.man.interval;

public class Interval {
	
	private int start;
	private int stop;
	private String name;
	
	public void testPolymorphism(){
		
		System.out.println("Master");
		
	}
	
	Interval(){
		
		
	}
	
	public Interval(int start, int stop, String name) {
		super();
		this.start = start;
		this.stop = stop;
		this.name = name;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getStop() {
		return stop;
	}
	public void setStop(int stop) {
		this.stop = stop;
	}
	@Override
	public String toString() {
		return "Interval [start=" + start + ", stop=" + stop + ", name=" + name
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getIntervalSize(){
		
		return stop-start;
	}
	
}
