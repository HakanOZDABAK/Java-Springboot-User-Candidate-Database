package com.hakanozdabak.KayitSistemi.business.abstracts;

import java.util.List;

import com.hakanozdabak.KayitSistemi.core.utilities.Result;
import com.hakanozdabak.KayitSistemi.core.utilities.UserResult;
import com.hakanozdabak.KayitSistemi.entities.concretes.User;
import com.hakanozdabak.KayitSistemi.entities.dtos.UserDto;

public interface UserService {
	UserResult<User> getByUserName(String userName);
    UserResult<User> getByUserEmail(String userEmail);
    Result add(User user);
    UserResult<List<UserDto>> getByUserNameDetails( );
}
