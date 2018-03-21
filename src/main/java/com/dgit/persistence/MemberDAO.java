package com.dgit.persistence;

import java.util.List;

import com.dgit.domain.MemberVO;

public interface MemberDAO {
	public String getTime()throws Exception;
	public void insertMember(MemberVO vo)throws Exception;
	public MemberVO readMember(String userid)throws Exception;
	public MemberVO readWithPw(String userid,String userpw)throws Exception;
	public List<MemberVO> listAll()throws Exception;
	public void update(String userid,String userpw)throws Exception;
	public void delete(String userid)throws Exception;
}
