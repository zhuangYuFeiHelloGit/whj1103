package com.lanou3g.study;

public class Company {
	
	private Teacher t;
	private Doctor doc;
	public Teacher getT() {
		return t;
	}
	public void setT(Teacher t) {
		this.t = t;
	}
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	
	public void work(){
		if(doc != null){
			doc.work();
		}
		
		if(t != null){
			t.work();
		}
	}
	
	
	

}
