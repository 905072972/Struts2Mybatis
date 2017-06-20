package com.dao;

import java.util.List;

import com.pojo.Dept;

public class DeptDao extends BaseDao{
	public List<Dept> getAll(Dept dept){
		List <Dept>list=getSession().selectList("com.mapper.dept.getDept",dept);
		return list;
		
	}
}
