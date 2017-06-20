package com.action;

import java.util.List;

import com.dao.DeptDao;
import com.dao.EmpDao;
import com.pojo.Dept;

public class DeptAction {
	private DeptDao dd=new DeptDao();
	private EmpDao ed=new EmpDao();
	private List list;
	private Dept dept;
	
	public String showAll(){
		list=dd.getAll(dept);
		return "showlist";
		
	}
	
	public DeptDao getDd() {
		return dd;
	}
	public void setDd(DeptDao dd) {
		this.dd = dd;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
	
}
