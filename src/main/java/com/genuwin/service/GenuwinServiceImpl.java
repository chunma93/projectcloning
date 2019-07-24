package com.genuwin.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.genuwin.dao.GenuwinDAO;
import com.genuwin.domain.GenuwinVO;

@Service
public class GenuwinServiceImpl implements GenuwinService {

	@Inject
	private GenuwinDAO dao;

	@Override
	public void write(GenuwinVO vo) throws Exception {
		dao.write(vo);

	}

	@Override
	public void update(GenuwinVO vo) throws Exception {
		dao.update(vo);

	}

	@Override
	public void delete(int pk) throws Exception {
		dao.delete(pk);
	}

	@Override
	public GenuwinVO view(int pk) throws Exception {
		return dao.view(pk);
	}

	@Override
	public List<GenuwinVO> list() throws Exception {
		return dao.list();
	}

}
