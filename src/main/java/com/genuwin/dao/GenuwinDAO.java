package com.genuwin.dao;

import java.util.List;

import com.genuwin.domain.GenuwinVO;

public interface GenuwinDAO {
	
	public void write(GenuwinVO vo) throws Exception;
	
	public void update(GenuwinVO vo) throws Exception;
	
	public void delete(int pk) throws Exception;
	
	public GenuwinVO view(int pk) throws Exception;
	
	public List<GenuwinVO> list() throws Exception;

}
