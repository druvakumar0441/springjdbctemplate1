package com.spring1;

public class student {

	private Integer sid;
	private String sname;
	private Integer sage;
	private String squal;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", squal=" + squal + "]";
	}
	public String getSqual() {
		return squal;
	}
	public void setSqual(String squal) {
		this.squal = squal;
	}
	public student(Integer sid, String sname, Integer sage, String squal) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.squal = squal;
	}
	public student() {
		super();
	}
	
	
	
}
