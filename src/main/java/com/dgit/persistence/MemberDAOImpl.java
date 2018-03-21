package com.dgit.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgit.domain.MemberVO;

//bean으로 인식하기 위해서 annotation
@Repository
public class MemberDAOImpl implements MemberDAO {
	
	//mapperfile에 선언한 이름과 동일하여야 한다.
	private static final String namespace = "com.dgit.mapper.MemberMapper";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public String getTime() throws Exception {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) throws Exception {
		sqlSession.insert(namespace+".insertMember",vo);

	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		return sqlSession.selectOne(namespace+".readMember",userid);
	}

	@Override
	public MemberVO readWithPw(String userid, String userpw) throws Exception {
		//매개변수를 두개 넘길 수 없어서 hashmap 이용
		Map<String,Object> map = new HashMap<>();
		//key값에 주의
		map.put("userid", userid);
		map.put("userpw", userpw);
		return sqlSession.selectOne(namespace+".readWithPw",map);
	}

	@Override
	public List<MemberVO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
	}

	@Override
	public void update(String userid, String userpw) throws Exception {
		Map<String,Object> map = new HashMap<>();
		map.put("userid", userid);
		map.put("userpw", userpw);
		sqlSession.update(namespace+".update",map);
	}

	@Override
	public void delete(String userid) throws Exception {
		sqlSession.delete(namespace+".delete",userid);
		
	}

}
