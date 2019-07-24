package com.genuwin.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.genuwin.domain.GenuwinVO;

@Repository
public class GenuwinDAOImpl implements GenuwinDAO {

	@Inject
	private SqlSession sql;

	private static String namespace = "com.genuwin.mappers.genuwinMapper";

	@Override
	public void write(GenuwinVO vo) throws Exception {
		sql.insert(namespace + ".write", vo);

	}

	@Override
	public void update(GenuwinVO vo) throws Exception {
		sql.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int pk) throws Exception {
		sql.delete(namespace + ".delete", pk);
	}

	@Override
	public GenuwinVO view(int pk) throws Exception {
		return sql.selectOne(namespace + ".view", pk);
	}

	@Override
	public List<GenuwinVO> list() throws Exception {
		return sql.selectList(namespace + ".list");
	}

}
