package com.fii.dao;

import java.util.List;

import com.fii.model.UserTable;

public interface UserRepository  {
	
	List<UserTable>findByEmail(String email);
	
//	@Query("select c from UserTable c where c.email = :email")
//    Stream<UserTable> findByEmailReturnStream(@Param("email") String email);

}
