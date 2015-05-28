package com.prince;

public class PersonCommand {
	private String name;
	private String desc;

	public void setName(String name){
		this.name = name;
	}
	
	public void execute(){
		desc = name + "-desc";
	}
	
	public String getDesc(){
		return desc;
	}
}
