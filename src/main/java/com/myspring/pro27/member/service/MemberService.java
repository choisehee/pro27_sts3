package com.myspring.pro27.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.myspring.pro27.member.vo.*;

public interface MemberService {
	 public List listMembers() throws DataAccessException;
	 public int addMember(MemberVO membeVO) throws DataAccessException;
	 public int removeMember(String id) throws DataAccessException;
	 
	 public int memberMod(MemberVO memberVO)throws DataAccessException;

}
