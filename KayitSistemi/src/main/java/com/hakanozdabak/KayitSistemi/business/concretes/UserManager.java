package com.hakanozdabak.KayitSistemi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hakanozdabak.KayitSistemi.business.abstracts.UserService;
import com.hakanozdabak.KayitSistemi.core.utilities.Result;
import com.hakanozdabak.KayitSistemi.core.utilities.SuccessUserResult;
import com.hakanozdabak.KayitSistemi.core.utilities.UserResult;
import com.hakanozdabak.KayitSistemi.dataAccess.abstracts.UserDao;
import com.hakanozdabak.KayitSistemi.entities.concretes.User;
import com.hakanozdabak.KayitSistemi.entities.dtos.UserDto;

@Service
public class UserManager implements UserService{
    
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public UserResult<User> getByUserEmail(String userEmail) {
	
		return new SuccessUserResult<User>
		(this.userDao.getByUserEmail(userEmail), "Kullanıcı Getirildi");
	}

	@Override
	public Result add(User user) {

		 this.userDao.save(user);
		 return new SuccessUserResult<User>(user, "Kullanıcı Kaydedildi");
	}

	@Override
	public UserResult<User> getByUserName(String userName) {
		return new SuccessUserResult<User>(this.userDao.getByUserName(userName)); 
	}

	@Override
	public UserResult<List<UserDto>> getByUserNameDetails() {
		// TODO Auto-generated method stub
		return new SuccessUserResult<List<UserDto>>
		(this.userDao.getByUserNameDetails(),"Data Listelendi");
	}


	
}
