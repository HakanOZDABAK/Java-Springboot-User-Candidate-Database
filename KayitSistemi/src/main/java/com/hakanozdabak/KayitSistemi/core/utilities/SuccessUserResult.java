package com.hakanozdabak.KayitSistemi.core.utilities;

public class SuccessUserResult<T> extends UserResult<T> {

	public SuccessUserResult(T data) {
		super(data,true);
	}
	
	public SuccessUserResult(T data,String message) {
		super(data,true,message);
	}
	
	public SuccessUserResult() {
		super(null,true);
	}
	
	public SuccessUserResult(String message) {
		super(null,true,message);
	}
	

}
