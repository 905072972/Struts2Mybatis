package com.action;

import java.util.List;

import com.dao.EmpDao;
import com.pojo.Emp;

public class EmpAction {
	private List<Emp> list;
	private Emp e;
	private int num;
	EmpDao ed=new EmpDao();
	public String getAll(){
		
		setList(ed.getAll());
		return "success";
	}
	public String getAddAll(){
	
		int num=setNum(ed.getAddAll(e));
		if(num>0){
			return "showsuccess";	
			
		}else{
			return "fail";
			
		}
		
	}
	public String getDeleteAll(){
		
		int num=setNum(ed.getDeleteAll(e));
		if(num>0){
			return "success";
		}else{
			return "fail";
			
		}
	}
	public String getUpdateAll(){
		int num=setNum(ed.getUpdateAll(e));
		if(num>0){
			return "success";	
			
		}else{
			return "fail";
			
		}
	}

	public void setList(List<Emp> list) {
		this.list = list;
	}

	public List<Emp> getList() {
		return list;
	}
	public int setNum(int num) {
		return this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setE(Emp e) {
		this.e = e;
	}
	public Emp getE() {
		return e;
	}
}
