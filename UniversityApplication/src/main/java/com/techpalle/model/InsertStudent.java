package com.techpalle.model;

public class InsertStudent {
	private String name;
	private String email;
	private int mob;
	private int maths;
	private int english;
	public InsertStudent(String name, String email, int mob, int maths, int english) {
		super();
		this.name = name;
		this.email = email;
		this.mob = mob;
		this.maths = maths;
		this.english = english;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
}
