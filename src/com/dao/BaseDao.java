package com.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseDao {
	private SqlSession session;
	public SqlSession getSession(){
		SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
		SqlSessionFactory sf=sfb.build(EmpDao.class.getResourceAsStream("/conf.xml") );
		 session=sf.openSession();
		return session;
		
	}
	public void commit(){
		if(session!=null){
			session.commit();
			
		}
		
	}
}
