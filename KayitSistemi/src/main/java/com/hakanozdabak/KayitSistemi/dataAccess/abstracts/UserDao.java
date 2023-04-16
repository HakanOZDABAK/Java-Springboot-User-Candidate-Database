package com.hakanozdabak.KayitSistemi.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hakanozdabak.KayitSistemi.entities.concretes.User;
import com.hakanozdabak.KayitSistemi.entities.dtos.UserDto;

public interface UserDao extends JpaRepository<User, Integer> {

	User getByUserName(String userName);
	@Query("From User where userEmail =: userEmail ")
	User getByUserEmail(String userEmail);
	
	 @Query("Select new com.hakanozdabak.KayitSistemi.entities.dtos.UserDto(u.userName) From User u")
	 List<UserDto>getByUserNameDetails();
}
