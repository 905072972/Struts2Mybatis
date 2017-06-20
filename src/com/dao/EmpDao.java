package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pojo.Emp;


public class EmpDao {
	Emp emp=new Emp();
	public List<Emp> getAll(){
		SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
		SqlSessionFactory sf=sfb.build(EmpDao.class.getResourceAsStream("/conf.xml") );
		SqlSession session=sf.openSession();
		List <Emp>list=session.selectList("getEmp");
		return list;
	}
	public int getAddAll(Emp e){
		SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
		SqlSessionFactory sf=sfb.build(EmpDao.class.getResourceAsStream("/conf.xml") );
		SqlSession session=sf.openSession();	
		int list=session.insert("addEmp",e);
		session.commit();
		return list;
	}
	public int getDeleteAll(Emp e){
		SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
		SqlSessionFactory sf=sfb.build(EmpDao.class.getResourceAsStream("/conf.xml") );
		SqlSession session=sf.openSession();
		int list=session.delete("delEmp",e);
		
		session.commit();
		return list;
	}
	public int getUpdateAll(Emp e){
		SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
		SqlSessionFactory sf=sfb.build(EmpDao.class.getResourceAsStream("/conf.xml") );
		SqlSession session=sf.openSession();
		int list=session.update("updateEmp",e);
		
		session.commit();
		return list;
	}
	

	
	
//	public List<Emp> getAll() {
//		String sql="select *from emp";
//		List<Emp> list=new ArrayList<Emp>();
//		ResultSet rs=dbu.executeQuery(sql);
//		try {
//			while(rs.next()){
//				Emp e=new Emp();
//				e.setEmpno(rs.getInt("empno"));
//				e.setEname(rs.getString("ename"));
//				e.setJob(rs.getString("job"));
//				e.setMgr(rs.getInt("mgr"));
//				e.setHiredate(rs.getString("Hiredate"));
//				e.setSal(rs.getInt("sal"));
//				e.setComm(rs.getInt("comm"));
//				e.setDeptno(rs.getInt("deptno"));
//				list.add(e);
//				
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}finally{
//			dbu.closeAll();
//		}
//		return list;	
//	}
//	public int addEmp(Emp e) {
//		String sql = "insert into emp values(?,?,?,?,to_date('2014-6-3','yyyy-mm-dd'),?,?,?)";
//		int result = dbu.executeUpdate(sql, e.getEmpno(), e.getEname(), e.getJob()
//				,e.getMgr(),e.getSal(),e.getComm(),e.getDeptno());
//		return result;
//	}
}
