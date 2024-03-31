package com.techpalle.model;

public class StudentDetails {
	private String sname;
	private String semail;
	private int maths;
	private int english;
	public StudentDetails(String sname, String semail, int maths, int english) {
		super();
		this.sname = sname;
		this.semail = semail;
		this.maths = maths;
		this.english = english;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
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
