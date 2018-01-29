package com.ch.test;

public class Tiaozhuan {
	private String a;
	
	public void setA(String a){
		this.a=a;
	}
	public String getA(){
		return a;
	}
	public String execute(){
		if(a=="1"){
			return "success1";			
		}else{
			return "success2";			
		}

	}
}
