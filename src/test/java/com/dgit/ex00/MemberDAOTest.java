package com.dgit.ex00;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.domain.MemberVO;
import com.dgit.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	
	@Autowired
	private MemberDAO dao;
	
	//@Test
	public void testTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	//@Test
	public void testInsertMember() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserid("test2");
		vo.setUserpw("123");
		vo.setUsername("test2");
		vo.setEmail("test@test.com");
		dao.insertMember(vo);
	}
	
	//@Test
	public void testReadMember() throws Exception{
		System.out.println(dao.readMember("test"));
	}
	
	//@Test
	public void testReadWithPw() throws Exception{
		System.out.println(dao.readWithPw("test", "123"));
	}
	
	//@Test
	public void testListAll() throws Exception{
		System.out.println(dao.listAll());
	}
	
	@Test
	public void testUpdate() throws Exception{
		dao.update("test1", "1111");
	}
	
	@Test
	public void testDelete()throws Exception{
		dao.delete("test");
	}
	
}
