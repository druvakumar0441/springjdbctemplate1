package com.spring1;

import java.util.Objects;

public class student1 {

	private Integer sid;
	private String sname;
	private Integer sage;
	private String squal;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(sage, sid, sname, squal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student1 other = (student1) obj;
		return Objects.equals(sage, other.sage) && Objects.equals(sid, other.sid) && Objects.equals(sname, other.sname)
				&& Objects.equals(squal, other.squal);
	}
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
	public student1(Integer sid, String sname, Integer sage, String squal) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.squal = squal;
	}
	public student1() {
		super();
	}
	
	
	
}
