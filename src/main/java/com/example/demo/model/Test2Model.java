package com.example.demo.model;

public class Test2Model {
	
	private int id;
	private String empname;
	private int empage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	@Override
	public String toString() {
		return "Test2Model [id=" + id + ", empname=" + empname + ", empage=" + empage + "]";
	}
	public Test2Model(int id, String empname, int empage) {
		super();
		this.id = id;
		this.empname = empname;
		this.empage = empage;
	}
	public Test2Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empage;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test2Model other = (Test2Model) obj;
		if (empage != other.empage)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
